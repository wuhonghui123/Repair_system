package cn.edu.glmc.controller.ewm;

import cn.edu.glmc.feign.EwmFeignClient;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:50
 */
@RestController
public class EwmController {
    @Autowired
    private EwmFeignClient ewmFeignClient;
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
                return ewmFeignClient.ewmServlet(op,eid,qid,startId,endId,token);
            default: return new ResponseData(false);
        }
    }
}
