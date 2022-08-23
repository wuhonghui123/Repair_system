package cn.edu.glmc.controller.bxd;

import cn.edu.glmc.feign.bxd.BxdFeignClient;
import cn.edu.glmc.feign.bxqy.BxqyFeignClient;
import cn.edu.glmc.feign.ewm.EwmFeignClient;
import cn.edu.glmc.feign.hc.HcFeignClient;
import cn.edu.glmc.feign.shy.ShyFeignClient;
import cn.edu.glmc.http.HttpResult;
import cn.edu.glmc.response.ResponseData;
import feign.Logger;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
    private BxqyFeignClient bxqyFeignClient;
    @Autowired
    private HcFeignClient hcFeignClient;
    @Autowired
    private ShyFeignClient shyFeignClient;
    @Autowired
    private EwmFeignClient ewmFeignClient;

    @GetMapping("/bxd/getbxdlist")
    public HttpResult deleteClassificationList(){
        return HttpResult.ok(bxdFeignClient.getBxdList());
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
                            @RequestParam(value = "hc", required = false) String hc) throws IOException {
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op) {
            case "sbrbxd":
                return bxdFeignClient.sbr(eid, xh);
            case "upbxdbysbr":
                return bxdFeignClient.upbxdbysbr(cxsy, pj, pjnr, pjzj, xh, bid);
            case "newbxdbysbr":
                return shyFeignClient.filebase64(eid, xxdd, yysj, bxlb, bxnr, sbrsj, sbrxh, sbr, tp, sp, jid, bid, hc);
            case "selqybysbr":
                return ewmFeignClient.selqybysbr(eid);
            case "selbxdforeid":
                return bxdFeignClient.selbxdforeid(eid);
            default:
                return new ResponseData(false);
        }
    }
}
