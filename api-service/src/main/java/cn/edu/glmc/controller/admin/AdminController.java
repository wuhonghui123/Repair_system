package cn.edu.glmc.controller.admin;

import cn.edu.glmc.feign.BxdFeignClient;
import cn.edu.glmc.feign.BxqyFeignClient;
import cn.edu.glmc.feign.EwmFeignClient;
import cn.edu.glmc.feign.ShyFeignClient;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:46
 */
@RestController
public class AdminController {
    @Autowired
    private BxdFeignClient bxdFeignClient;
    @Autowired
    private BxqyFeignClient bxqyFeignClient;
    @Autowired
    private ShyFeignClient shyFeignClient;
    @Autowired
    private EwmFeignClient ewmFeignClient;

    @RequestMapping("/AdminServlet")
    @ResponseBody
    ResponseData adminServlet(@RequestParam("op") String op, @RequestParam(value = "shyid", required = false) String shyid,
                              @RequestParam(value = "num", required = false) String num, @RequestParam(value = "state", required = false) String state,
                              @RequestParam(value = "qid", required = false) String qid, @RequestParam(value = "xxdd", required = false) String xxdd,
                              @RequestParam(value = "qy", required = false) String qy, @RequestParam(value = "qylb", required = false) String qylb,
                              @RequestParam(value = "xq", required = false) String xq, @RequestParam(value = "x", required = false) String x,
                              @RequestParam(value = "y", required = false) String y, @RequestParam(value = "eid", required = false) String eid,
                              @RequestParam(value = "jid", required = false) String jid, @RequestParam(value = "xm", required = false) String xm,
                              @RequestParam(value = "del", required = false) String del, @RequestParam(value = "zw", required = false) String zw,
                              @RequestParam(value = "sj", required = false) String sj, @RequestParam(value = "yx", required = false) String yx,
                              @RequestParam(value = "ywfw", required = false) String ywfw, @RequestParam(value = "ybid", required = false) String ybid,
                              @RequestParam(value = "gh", required = false) String gh, @RequestParam(value = "bid", required = false) String bid,
                              @RequestParam(value = "shy1", required = false) String shy1, @RequestParam(value = "shy2", required = false) String shy2,
                              @RequestParam(value = "pj", required = false) String pj, @RequestParam(value = "startime", required = false) String startime,
                              @RequestParam(value = "endtime", required = false) String endtime, @RequestParam(value = "pjnr", required = false) String pjnr,
                              @RequestParam(value = "hc", required = false) String hc, @RequestParam(value = "gs", required = false) String gs,
                              @RequestParam(value = "bxlb", required = false) String bxlb, @RequestParam(value = "message", required = false) String message) throws ParseException {
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op)) {
            return new ResponseData("2");
        }
        switch (op) {
            case "upbxdbyadmin":
            case "bxnum":
            case "adminindex":
                return bxdFeignClient.adminServlet(op, shyid, num, state, qid, xxdd, qy, qylb, xq, x, y, eid, jid, xm, del, zw,
                        sj, yx, ywfw, ybid, gh, bid, shy1, shy2, pj, startime, endtime, pjnr, hc, gs, bxlb, message);
            case "selallqy":
            case "newqy":
            case "upqy":
                return bxqyFeignClient.adminServlet(op, shyid, num, state, qid, xxdd, qy, qylb, xq, x, y, eid, jid, xm, del, zw,
                        sj, yx, ywfw, ybid, gh, bid, shy1, shy2, pj, startime, endtime, pjnr, hc, gs, bxlb, message);
            case "selewm":
            case "newewm":
            case "upewm":
                return ewmFeignClient.adminServlet(op, shyid, num, state, qid, xxdd, qy, qylb, xq, x, y, eid, jid, xm, del, zw,
                        sj, yx, ywfw, ybid, gh, bid, shy1, shy2, pj, startime, endtime, pjnr, hc, gs, bxlb, message);
            case "selalljdr":
            case "newpeople":
            case "uppeople":
            case "selOptimaljdrPC":
            case "selbxdbyadmin":
            case "selallshy":
            case "selqdb":
            case "selbxdbyadminpc":
                return shyFeignClient.adminServlet(op, shyid, num, state, qid, xxdd, qy, qylb, xq, x, y, eid, jid, xm, del, zw,
                        sj, yx, ywfw, ybid, gh, bid, shy1, shy2, pj, startime, endtime, pjnr, hc, gs, bxlb, message);
            default:
                return new ResponseData(false);
        }
    }
}
