package cn.edu.glmc.controller.admin;

import cn.edu.glmc.feign.bxd.BxdFeignClient;
import cn.edu.glmc.feign.bxqy.BxqyFeignClient;
import cn.edu.glmc.feign.ewm.EwmFeignClient;
import cn.edu.glmc.feign.hc.HcFeignClient;
import cn.edu.glmc.feign.shy.ShyFeignClient;
import cn.edu.glmc.response.ResponseData;
import org.checkerframework.checker.units.qual.A;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

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
    private HcFeignClient hcFeignClient;
    @Autowired
    private ShyFeignClient shyFeignClient;
    @Autowired
    private EwmFeignClient ewmFeignClient;
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
                              @RequestParam(value = "bxlb",required = false) String bxlb) throws ParseException {
        Map<String,Object> shymap = new HashMap<>();
        shymap.put("slist",shyFeignClient.selallqy());
        if(StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op)) {
            return new ResponseData("2");
        }
        switch (op){
            case "selbxdbyadmin" : return shyFeignClient.selbxdbyadmin(bid, startime, endtime, xq, qid, jid, state, pj);
            case "selallqy" : return bxqyFeignClient.selallqy(xq);
            case "selalljdr" : return shyFeignClient.selalljdr(state);
            case "selallshy" : return new ResponseData(shymap);
            case "selqdb" : return shyFeignClient.selqdb(shyid, num);
            case "upbxdbyadmin" : return bxdFeignClient.upbxdbyadmin(del, bid, jid, shy1, shy2, pj, pjnr, hc, gs);
            case "newpeople" : return shyFeignClient.newpeople(ywfw, ybid, gh, xm, zw, sj, yx);
            case "uppeople" : return shyFeignClient.uppeople(jid, xm, shyid, del, zw, sj, yx, ywfw, state);
            case "selewm" : return ewmFeignClient.selewm(qid);
            case "newqy" : return bxqyFeignClient.newqy(qy, qylb, xq, x, y);
            case "newewm" : return ewmFeignClient.newewm(qid,xxdd);
            case "upqy" : return bxqyFeignClient.upqy(qid, qy, qylb, xq, x, y);
            case "upewm" : return ewmFeignClient.upewm(eid, qid, xxdd);
            case "bxnum" : return bxdFeignClient.bxnum(state);
            case "adminindex" : return bxdFeignClient.adminindex();
            case "selOptimaljdrPC" : return shyFeignClient.selOptimaljdrPC(bid);
            case "selbxdbyadminpc" : return shyFeignClient.selbxdbyadminpc(bid, startime, endtime, xq, qid, jid, state, pj);
            default: return new ResponseData(false);
        }
    }
}
