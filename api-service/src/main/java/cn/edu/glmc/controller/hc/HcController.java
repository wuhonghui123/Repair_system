package cn.edu.glmc.controller.hc;

import cn.edu.glmc.feign.hc.HcFeignClient;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:52
 */
@RestController
public class HcController {
    @Autowired
    private HcFeignClient hcFeignClient;
    @RequestMapping("/HcServlet")
    @ResponseBody
    ResponseData hcServlet(@RequestParam("op") String op, @RequestParam(value = "mc", required = false) String mc,
                           @RequestParam(value = "dw", required = false) String dw, @RequestParam(value = "jg", required = false) String jg,
                           @RequestParam(value = "id", required = false) String id, @RequestParam(value = "lb", required = false) String lb,
                           @RequestParam(value = "xh", required = false) String xh, @RequestParam(value = "yjlb", required = false) String yjlb,
                           @RequestParam(value = "ejlb", required = false) String ejlb) {
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op) {
            case "selhc":
                return hcFeignClient.selhc();
            case "delhc":
                return hcFeignClient.delhc(id);
            case "newhc":
                return hcFeignClient.newhc(mc, dw, jg, lb, xh);
            case "uphc":
                return hcFeignClient.uphc(id, mc, dw, jg, lb, xh);
            case "selHcByLb":
                return hcFeignClient.selHcByLb(yjlb, ejlb);
            default:
                return new ResponseData(false);
        }
    }
}
