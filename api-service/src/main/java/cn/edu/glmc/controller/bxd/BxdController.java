package cn.edu.glmc.controller.bxd;

import cn.edu.glmc.feign.BxdFeignClient;
import cn.edu.glmc.feign.EwmFeignClient;
import cn.edu.glmc.feign.ShyFeignClient;
import cn.edu.glmc.http.HttpResult;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:46
 */
@RestController
public class BxdController {
    @Autowired
    private BxdFeignClient bxdFeignClient;
    @Autowired
    private ShyFeignClient shyFeignClient;
    @Autowired
    private EwmFeignClient ewmFeignClient;

    @GetMapping("/bxd/getbxdlist")
    public HttpResult deleteClassificationList(){
        return HttpResult.ok(bxdFeignClient.getbxdlist());
    }

    @GetMapping("/test")
    public String test(){
        return this.bxdFeignClient.test();
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
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op) {
            case "sbrbxd":
            case "upbxdbysbr":
            case "selbxdforeid":
            case "selWpdBxd":
            case "BxdRemore":
            case "downloadBxdRemore":
                return bxdFeignClient.bxdServlet(op, eid, xh, xxdd, yysj, bxlb, bxnr, sbrsj, sbrxh, sbr,
                        tp, sp, cxsy, pj, pjnr, pjzj, bid, jid, hc,response);
            case "newbxdbysbr":
                return shyFeignClient.bxdServlet(op, eid, xh, xxdd, yysj, bxlb, bxnr, sbrsj, sbrxh, sbr,
                        tp, sp, cxsy, pj, pjnr, pjzj, bid, jid, hc,response);
            case "selqybysbr":
                return ewmFeignClient.bxdServlet(op, eid, xh, xxdd, yysj, bxlb, bxnr, sbrsj, sbrxh, sbr,
                        tp, sp, cxsy, pj, pjnr, pjzj, bid, jid, hc,response);
            default:
                return new ResponseData(false);
        }
    }
}
