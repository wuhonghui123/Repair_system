package cn.edu.glmc.feign;

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
    @RequestMapping("/AdminServlet")
    @ResponseBody
    ResponseData adminServlet(@RequestParam("op")String op, @RequestParam(value = "shyid",required = false) String shyid,
                              @RequestParam(value = "num",required = false) String num, @RequestParam(value = "state",required = false)String state,
                              @RequestParam(value = "qid",required = false) String qid, @RequestParam(value = "xxdd",required = false) String xxdd,
                              @RequestParam(value = "qy",required = false) String qy, @RequestParam(value = "qylb",required = false) String qylb,
                              @RequestParam(value = "xq",required = false) String xq, @RequestParam(value = "x",required = false) String x,
                              @RequestParam(value = "y",required = false) String y, @RequestParam(value = "eid",required = false) String eid,
                              @RequestParam(value = "jid",required = false) String jid, @RequestParam(value = "xm",required = false) String xm,
                              @RequestParam(value = "del",required = false) String del, @RequestParam(value = "zw",required = false) String zw,
                              @RequestParam(value = "sj",required = false) String sj, @RequestParam(value = "yx",required = false) String yx,
                              @RequestParam(value = "ywfw",required = false) String ywfw, @RequestParam(value = "ybid",required = false) String ybid,
                              @RequestParam(value = "gh",required = false) String gh, @RequestParam(value = "bid",required = false) String bid,
                              @RequestParam(value = "shy1",required = false) String shy1, @RequestParam(value = "shy2",required = false) String shy2,
                              @RequestParam(value = "pj",required = false) String pj, @RequestParam(value = "startime",required = false) String startime,
                              @RequestParam(value = "endtime",required = false) String endtime, @RequestParam(value = "pjnr",required = false) String pjnr,
                              @RequestParam(value = "hc",required = false) String hc, @RequestParam(value = "gs",required = false) String gs,
                              @RequestParam(value = "bxlb",required = false) String bxlb, @RequestParam(value = "message", required = false) String message);

    @RequestMapping("/BxqyServlet")
    @ResponseBody
    ResponseData bxqyServlet(@RequestParam("op")String op, @RequestParam(value = "qid", required = false) String qid);
}
