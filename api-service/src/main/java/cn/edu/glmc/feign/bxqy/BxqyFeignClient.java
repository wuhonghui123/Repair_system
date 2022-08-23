package cn.edu.glmc.feign.bxqy;

import cn.edu.glmc.config.OpenFeignConfig;
import cn.edu.glmc.response.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:50
 */
@FeignClient(value = "baoxiuquyu-service")
public interface BxqyFeignClient {
    @RequestMapping("/BxqyServlet")
    @ResponseBody
    ResponseData bxqyServlet(@RequestParam("op")String op, @RequestParam(value = "qid", required = false) String qid);

    /**
     * 插入一个报修区域到数据
     */
    @RequestMapping("/AdminServlet/newqy")
    ResponseData newqy(@RequestParam String qy, @RequestParam String qylb, @RequestParam String xq, @RequestParam String x, @RequestParam String y);

    /**
     * 更新报修区域到数据库
     */
    @RequestMapping("/AdminServlet/upqy")
    ResponseData upqy(@RequestParam String qid, @RequestParam String qy, @RequestParam String qylb, @RequestParam String xq, @RequestParam String x, @RequestParam String y);

    /**
     * 获取某个报修区域的数据
     */
    @RequestMapping("/AdminServlet/selallqy")
    ResponseData selallqy(String xq);
}
