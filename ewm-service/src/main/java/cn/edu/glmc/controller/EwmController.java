package cn.edu.glmc.controller;

import cn.edu.glmc.response.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/13:20
 */
@RestController
public class EwmController {
    @RequestMapping("/EwmServlet")
    @ResponseBody
    ResponseData ewmServlet(@RequestParam("op")String op, @RequestParam(value = "ewmId", required = false) Integer eid,
                            @RequestParam(value = "qid", required = false) Integer qid, @RequestParam(value = "startId", required = false) Integer startId,
                            @RequestParam(value = "endId", required = false) Integer endId, @RequestParam(value = "token", required = false) String token) {
        if(StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op){
            case "selEwmById" :
            case "updateQidByAdmin":
            default: return new ResponseData(false);
        }
    }
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
                              @RequestParam(value = "bxlb",required = false) String bxlb, @RequestParam(value = "message", required = false) String message) throws ParseException {
        if(org.apache.commons.lang3.StringUtils.isWhitespace(op) || org.apache.commons.lang3.StringUtils.isEmpty(op) || org.apache.commons.lang3.StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op){
            case "selewm" :
            case "newewm" :
            case "upewm" :
            default: return new ResponseData(false);
        }
    }
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
                            @RequestParam(value = "hc", required = false) String hc, HttpServletResponse response) throws IOException {
        if (org.apache.commons.lang3.StringUtils.isWhitespace(op) || org.apache.commons.lang3.StringUtils.isEmpty(op) || org.apache.commons.lang3.StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op) {
            case "selqybysbr":
            default:
                return new ResponseData(false);
        }
    }


}
