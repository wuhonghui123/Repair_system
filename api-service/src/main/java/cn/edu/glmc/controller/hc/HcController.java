package cn.edu.glmc.controller.hc;

import cn.edu.glmc.feign.HcFeignClient;
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
            case "delhc":
            case "newhc":
            case "uphc":
            case "selHcByLb":
                return hcFeignClient.hcServlet(op,mc,dw,jg,id,lb,xh,yjlb,ejlb);
            default:
                return new ResponseData(false);
        }
    }
}
