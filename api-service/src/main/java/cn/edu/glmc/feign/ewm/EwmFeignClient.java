package cn.edu.glmc.feign.ewm;

import cn.edu.glmc.config.OpenFeignConfig;
import cn.edu.glmc.response.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:50
 */
@FeignClient(value = "ewm-service", configuration = OpenFeignConfig.class)
public interface EwmFeignClient {
    /**
     * 插入二维码到数据库
     */
    @RequestMapping("/AdminServlet/newewm")
    ResponseData newewm(@RequestParam String qid, @RequestParam String xxdd);

    /**
     * 更新二维码到数据库
     */
    @RequestMapping("/AdminServlet/upewm")
    ResponseData upewm(@RequestParam String eid, @RequestParam String qid, @RequestParam String xxdd);

    /**
     * 提供二维码id，查询该二维码和所在的报修区域的数据
     */
    @ResponseBody
    @RequestMapping("/BxdServlet/selqybysbr")
    ResponseData selqybysbr(String eid);
    /**
     * 查询一个二维码数据
     */
    @RequestMapping("/AdminServlet/selewm")
    ResponseData selewm(String qid);
    /**
     * 根据二维码id，获取该二维码的数据
     */
    @ResponseBody
    @RequestMapping("/EwmServlet/selEwmById")
    ResponseData selEwmById(Integer eid);

    /**
     * 根据二维码id范围，更新范围内的二维码所处的区域
     */
    @ResponseBody
    @RequestMapping("/EwmServlet/updateQidByAdmin")
    ResponseData updEwmQid(@RequestParam Integer qid, @RequestParam Integer startId, @RequestParam Integer endId, @RequestParam String token);
}
