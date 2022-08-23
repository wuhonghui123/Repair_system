package cn.edu.glmc.feign.bxd;

import cn.edu.glmc.bean.Bxd;
import cn.edu.glmc.response.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.edu.glmc.config.OpenFeignConfig;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:46
 */
@FeignClient(name = "baoxiudan-service", configuration = OpenFeignConfig.class)
public interface BxdFeignClient {
    @GetMapping("/bxd/getbxdlist")
    List<Bxd> getBxdList();

    @GetMapping("/test")
    String test();
    /**
     * 获得首页数据
     */
    @RequestMapping("/AdminServlet/adminindex")
    ResponseData adminindex();
    /**
     * 获取报修单总数
     */
    @RequestMapping("/AdminServlet/bxnum")
    ResponseData bxnum(@RequestParam String state);
    /**
     * 发送消息给申报人
     * @param ybid 申报人易班 id
     * @param message 消息
     * @return
     */
    @RequestMapping("/AdminServlet/sendMessageToSbr")
    ResponseData sendMessageToSbr(@RequestParam String ybid, @RequestParam String message);
    /**
     * 分配或者审核报修单
     * 更新该报修单到数据库
     */
    @RequestMapping("/AdminServlet/upbxdbyadmin")
    ResponseData upbxdbyadmin(@RequestParam String del, @RequestParam String bid, @RequestParam String jid, @RequestParam String shy1, @RequestParam String shy2, @RequestParam String pj, @RequestParam String pjnr, @RequestParam String hc, @RequestParam String gs);

    /**
     * 根据二维码id，获取由该二维码扫描出的没有完成的报修单
     */
    @RequestMapping("/BxdServlet/selbxdforeid")
    ResponseData selbxdforeid(@RequestParam String eid);

    /**
     * 根据申报人学号、报修单id，来更新该报修单
     * 其实就是 更新申报人申报的报修单
     * 如果报修单已被接单人接到，就提供易班告诉接单人：报修单的更新
     * pjzj:评价追加
     */
    @RequestMapping("/BxdServlet/upbxdbysbr")
    ResponseData upbxdbysbr(@RequestParam String cxsy, @RequestParam String pj, @RequestParam String pjnr, @RequestParam String pjzj, @RequestParam String xh, @RequestParam String bid);

    /**
     * 根据申报人学号，获取该申报人申报的报修单
     */
    @RequestMapping("/BxdServlet/sbr")
    ResponseData sbr(@RequestParam String eid, @RequestParam String xh);

    /**
     * 查找所有未派单的报修单的数量
     * @return
     */
    @RequestMapping("/BxdServlet/selWpdBxd")
    ResponseData selWpdBxd();

    /**
     * 清除一年前的记录，并做备份
     * @return
     */
    @RequestMapping("/BxdServlet/bxdRemore")
    ResponseData bxdRemore(HttpServletResponse response);

    /**
     * 下载备份的报修单
     * @return
     */
    @RequestMapping("/BxdServlet/downloadBxdRemore")
    ResponseData downloadBxdRemore(HttpServletResponse response);

    /**
     * 查询接单人当天 已维修和已验收 报修单的所花费的工时
     * 存在工时则四舍五入计算，保留小数点 12 位，否则为0
     */
    @RequestMapping("/JdrServlet/selgs")
    ResponseData selgs(@RequestParam String jid);

    /**
     * 通过接单人id和报修单id，来更新该报修单的数据，如耗材工时
     */
    @RequestMapping("/JdrServlet/upbxdbyjdr")
    ResponseData upbxdbyjdr(@RequestParam String jid, @RequestParam String bid, @RequestParam String state, @RequestParam String hc, @RequestParam String gs);

    /**
     * 根据接单人的易班id，获取由该接单人处理的报修单
     * 如果报修单的状态不为空、二维码id不为空，也加入判断中
     */
    @RequestMapping("/JdrServlet/selbxdbyjdr")
    ResponseData selbxdbyjdr(@RequestParam String jid, @RequestParam String eid, @RequestParam String state);

    /**
     * 当审核员1或者审核员2处理报修单，则根据该报修单id，来进行更新处理结果
     * 其他更新条件：
     * 1.如果耗材了，则在报修单表加上耗材内容
     * 2.如果接单人消耗工时了，则在报修单表加上消耗的工时
     */
    @RequestMapping("/ShyServlet/upbxdhcbyshy")
    ResponseData upbxdhcbyshy(@RequestParam String bid, @RequestParam String hc, @RequestParam String gs, @RequestParam String ybid);

    /**
     * 更新报修单的状态，并通知处理该报修单的接单人
     */
    @RequestMapping("/ShyServlet/upbxdbyysr")
    ResponseData upbxdbyysr(@RequestParam String shyid, @RequestParam String bid, @RequestParam String tstate, @RequestParam Boolean superShy);

    /**
     * 批量验收报修单
     * @param superShy 后台超级管理员
     * @param bxdIds 批量的报修单号
     * @param state 4：通过验收，5：拒绝验收
     * @return
     */
    @RequestMapping("/ShyServlet/upBxdbStateBatch")
    public ResponseData upBxdbStateBatch(@RequestParam Boolean superShy, @RequestParam List<Integer> bxdIds, @RequestParam String state);

    /**
     * 根据审核员id，获得该审核员  处理  过的报修单。报修单不包括已撤回的
     * 处理 = 审核通过 | 审核不通过
     * 如果二维码id不为空，获得的报修单是该二维码区域的
     */
    @RequestMapping("/ShyServlet/selbxdbyshy")
    ResponseData selbxdbyshy(@RequestParam String shyid, @RequestParam String eid, @RequestParam String shystate);


    /**
     * 当审核员1或者审核员2处理报修单，则根据该报修单id，来进行更新处理结果
     * 并查询该报修单是否已经真正处理，然后推送结果给接单人
     */
    @RequestMapping("/ShyServlet/upbxdbyshy")
    ResponseData upbxdbyshy(@RequestParam String shyid, @RequestParam String bid, @RequestParam String shystate, @RequestParam Boolean superShy);



}
