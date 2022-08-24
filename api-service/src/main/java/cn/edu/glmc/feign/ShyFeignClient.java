package cn.edu.glmc.feign;

import cn.edu.glmc.bean.Shy;
import cn.edu.glmc.config.OpenFeignConfig;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.codec.binary.Base64;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
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
    @RequestMapping("/JdrServlet")
    @ResponseBody
    ResponseData jdrServlet(@RequestParam("op") String op, @RequestParam(value = "jid", required = false) String jid,
                            @RequestParam(value = "bid", required = false) String bid, @RequestParam(value = "state", required = false) String state,
                            @RequestParam(value = "hc", required = false) String hc, @RequestParam(value = "gs", required = false) String gs,
                            @RequestParam(value = "eid", required = false) String eid, @RequestParam(value = "ybid", required = false) String ybid);
    @RequestMapping("/ShyServlet")
    @ResponseBody
    ResponseData shyServlet(@RequestParam("op")String op, @RequestParam(value = "bid", required = false)String bid,
                            @RequestParam(value = "hc", required = false)String hc, @RequestParam(value = "gs", required = false)String gs,
                            @RequestParam(value = "ybid", required = false)String ybid, @RequestParam(value = "num", required = false)String num,
                            @RequestParam(value = "page", required = false)String page, @RequestParam(value = "xq", required = false)String xq,
                            @RequestParam(value = "state", required = false)String state, @RequestParam(value = "shyid", required = false)String shyid,
                            @RequestParam(value = "shystate", required = false)String shystate, @RequestParam(value = "eid", required = false)String eid,
                            @RequestParam(value = "bxdIds", required = false) List<Integer> bxdIds, @RequestParam(value = "superShy", required = false, defaultValue = "false") Boolean superShy);

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
                              @RequestParam(value = "bxlb",required = false) String bxlb,@RequestParam(value = "message", required = false) String message);
    @RequestMapping("/BxdServlet")
    @ResponseBody
    ResponseData bxdServlet(@RequestParam("op") String op, @RequestParam(value = "eid", required = false) String eid,
                            @RequestParam(value = "xh", required = false) String xh, @RequestParam(value = "xxdd", required = false) String xxdd,
                            @RequestParam(value = "yysj", required = false) String yysj,
                            @RequestParam(value = "bxlb", required = false) String bxlb, @RequestParam(value = "bxnr", required = false) String bxnr,
                            @RequestParam(value = "sbrsj", required = false) String sbrsj, @RequestParam(value = "sbrxh", required = false) String sbrxh,
                            @RequestParam(value = "sbr", required = false) String sbr, @RequestParam(value = "tp", required = false) String tp,
                            @RequestParam(value = "sp", required = false) String sp,
                            @RequestParam(value = "cxsy", required = false) String cxsy, @RequestParam(value = "pj", required = false) String pj,
                            @RequestParam(value = "pjnr", required = false) String pjnr, @RequestParam(value = "pjzj", required = false) String pjzj,
                            @RequestParam(value = "bid", required = false) String bid, @RequestParam(value = "jid", required = false) String jid,
                            @RequestParam(value = "hc", required = false) String hc, HttpServletResponse response);
    /**
     * 如果出问题没有签到，则触发此请求，手动签到
     */
    @RequestMapping("/autoAck")
    public ResponseData autoAck();
}
