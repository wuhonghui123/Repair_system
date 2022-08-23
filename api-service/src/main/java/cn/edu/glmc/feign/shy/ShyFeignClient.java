package cn.edu.glmc.feign.shy;

import cn.edu.glmc.bean.Shy;
import cn.edu.glmc.config.OpenFeignConfig;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.codec.binary.Base64;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:45
 */
@FeignClient(value = "shenheyuan-service", configuration = OpenFeignConfig.class)
public interface ShyFeignClient {

    @RequestMapping("/shyservice/selallqy")
    List<Shy> selallqy();
    /**
     * 查询某个审核员的签到表数据
     */
    @RequestMapping("/AdminServlet/selqdb")
    ResponseData selqdb(@RequestParam String shyid,@RequestParam String num);

    @RequestMapping("/AdminServlet/selbxdbyadmin")
    ResponseData selbxdbyadmin(@RequestParam String bid, @RequestParam String startime, @RequestParam String endtime, @RequestParam String xq, @RequestParam String qy, @RequestParam String jdr, @RequestParam String state, @RequestParam String pj) throws ParseException;


    @RequestMapping("/AdminServlet/selbxdbyadminpc")
    ResponseData selbxdbyadminpc(@RequestParam String bid, @RequestParam String startime, @RequestParam String endtime, @RequestParam String xq, @RequestParam String qy, @RequestParam String jdr, @RequestParam String state, @RequestParam String pj) throws ParseException;


    /**
     * 根据审核员id，查询该审核员的所有签到表
     */
    @RequestMapping("/ShyServlet/selqdb")
    ResponseData selqdb(@RequestParam String num, @RequestParam String page, @RequestParam String ybid);

    /**
     * 插入一条审核员的签到数据到签到表
     */
    @RequestMapping("/ShyServlet/qd")
    ResponseData qd(@RequestParam String ybid, @RequestParam String xq, @RequestParam String state);

    /**
     * 整合返工和新增工单，返工要传jdr的jid和本单的id
     */
    @ResponseBody
    //整合返工和新增工单，返工要传jdr的jid和本单的id
    @RequestMapping("/BxdServlet/filebase64")
    ResponseData filebase64(@RequestParam String eid, @RequestParam String xxdd, @RequestParam String yysj, @RequestParam String bxlb, @RequestParam String bxnr, @RequestParam String sbrsj, @RequestParam String sbrxh, @RequestParam String sbr, @RequestParam String tp, @RequestParam String sp, @RequestParam String jid, @RequestParam String bid, @RequestParam String hc) throws IOException ;

    /**
     * 查询接单人的数据
     */
    @RequestMapping("/AdminServlet/selalljdr")
    ResponseData selalljdr(String state);

    /**
     * 查询适合的接单人
     */
    @RequestMapping("/AdminServlet/selOptimaljdrPC")
    ResponseData selOptimaljdrPC(String bid);


    /**
     * 如果出问题没有签到，则触发此请求，手动签到
     */
    @RequestMapping("/autoAck")
    public ResponseData autoAck();

    /**
     * 根据条件：
     * 删除一个审核员
     * 修改一个审核员
     * 删除一个接单人
     * 修改一个接单人
     */
    @RequestMapping("/AdminServlet/uppeople")
    ResponseData uppeople(@RequestParam String jid, @RequestParam String xm, @RequestParam String shyid, @RequestParam String del, @RequestParam String zw, @RequestParam String sj, @RequestParam String yx, @RequestParam String ywfw, @RequestParam String state);

    /**
     * 根据条件：
     * 添加一个审核员
     * 添加一个接单人
     */
    @RequestMapping("/AdminServlet/newpeople")
    ResponseData newpeople(@RequestParam String y, @RequestParam String ybid, @RequestParam String gh, @RequestParam String xm, @RequestParam String zw, @RequestParam String sj, @RequestParam String yx);
}
