package cn.edu.glmc.controller;

import cn.edu.glmc.bean.Bxd;
import cn.edu.glmc.feign.EwmService;
import cn.edu.glmc.http.HttpResult;
import cn.edu.glmc.response.ResponseData;
import cn.edu.glmc.service.BxdService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:13
 */
@RestController
public class BxdController {
    @GetMapping("/bxd/getbxdlist")
    List<Bxd> getBxdList(){
        return bxdService.getBxdList();
    }
    @GetMapping("/test")
    String test(){
        return "测试zhon。。。。。";
    }
    @Autowired
    private BxdService bxdService; //报修单

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
        if(StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op)) {
            return new ResponseData("2");
        }
        switch (op){
            case "upbxdbyadmin" :
            case "bxnum" :
            case "adminindex" :
            case "sendMessageToSbr" :
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
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op)) {
            return new ResponseData("2");
        }
        switch (op) {
            case "sbrbxd":

            case "upbxdbysbr":

            case "selbxdforeid":

            case "selWpdBxd":

            case "BxdRemore":

            case "downloadBxdRemore":

            default:
                return new ResponseData(false);
        }
    }
    @RequestMapping("/JdrServlet")
    @ResponseBody
    ResponseData jdrServlet(@RequestParam("op") String op, @RequestParam(value = "jid", required = false) String jid,
                            @RequestParam(value = "bid", required = false) String bid, @RequestParam(value = "state", required = false) String state,
                            @RequestParam(value = "hc", required = false) String hc, @RequestParam(value = "gs", required = false) String gs,
                            @RequestParam(value = "eid", required = false) String eid, @RequestParam(value = "ybid", required = false) String ybid) {
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op)) {
            return new ResponseData("2");
        }
        switch (op) {
            case "selbxdbyjdr":

            case "upbxdbyjdr":

            case "selgs":

            default:
                return new ResponseData(false);
        }
    }

    @RequestMapping("/ShyServlet")
    @ResponseBody
    ResponseData shyServlet(@RequestParam("op")String op, @RequestParam(value = "bid", required = false)String bid,
                            @RequestParam(value = "hc", required = false)String hc, @RequestParam(value = "gs", required = false)String gs,
                            @RequestParam(value = "ybid", required = false)String ybid, @RequestParam(value = "num", required = false)String num,
                            @RequestParam(value = "page", required = false)String page, @RequestParam(value = "xq", required = false)String xq,
                            @RequestParam(value = "state", required = false)String state, @RequestParam(value = "shyid", required = false)String shyid,
                            @RequestParam(value = "shystate", required = false)String shystate, @RequestParam(value = "eid", required = false)String eid,
                            @RequestParam(value = "bxdIds", required = false) List<Integer> bxdIds, @RequestParam(value = "superShy", required = false, defaultValue = "false") Boolean superShy) {
        if(StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op){
            case "selbxdbyshy" :
            case "upbxdbyshy" :
            case "upbxdhcbyshy" :
            case "upbxdbyysr" :
            case "upBxdbStateBatch" :
            default: return new ResponseData(false);
        }
    }

    }
