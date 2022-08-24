package cn.edu.glmc.controller.jdr;

import cn.edu.glmc.feign.BxdFeignClient;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:45
 */
@RestController
public class JdrController {
    @Autowired
    private BxdFeignClient bxdFeignClient;

    @RequestMapping("/JdrServlet")
    @ResponseBody
    ResponseData jdrServlet(@RequestParam("op") String op, @RequestParam(value = "jid", required = false) String jid,
                            @RequestParam(value = "bid", required = false) String bid, @RequestParam(value = "state", required = false) String state,
                            @RequestParam(value = "hc", required = false) String hc, @RequestParam(value = "gs", required = false) String gs,
                            @RequestParam(value = "eid", required = false) String eid, @RequestParam(value = "ybid", required = false) String ybid) {
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op) {
            case "selbxdbyjdr":
            case "upbxdbyjdr":
            case "selgs":
                return bxdFeignClient.jdrServlet(op,jid,bid,state,hc,gs,eid,ybid);
            default:
                return new ResponseData(false);
        }
    }
}
