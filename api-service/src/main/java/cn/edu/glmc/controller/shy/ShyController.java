package cn.edu.glmc.controller.shy;

import cn.edu.glmc.feign.BxdFeignClient;
import cn.edu.glmc.feign.ShyFeignClient;
import cn.edu.glmc.response.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:45
 */
@RestController
public class ShyController {
    @Autowired
    private BxdFeignClient bxdFeignClient;
    @Autowired
    private ShyFeignClient shyFeignClient;
    @RequestMapping("/ShyServlet")
    @ResponseBody
    ResponseData shyServlet(@RequestParam("op")String op, @RequestParam(value = "bid", required = false)String bid,
                            @RequestParam(value = "hc", required = false)String hc, @RequestParam(value = "gs", required = false)String gs,
                            @RequestParam(value = "ybid", required = false)String ybid, @RequestParam(value = "num", required = false)String num,
                            @RequestParam(value = "page", required = false)String page, @RequestParam(value = "xq", required = false)String xq,
                            @RequestParam(value = "state", required = false)String state, @RequestParam(value = "shyid", required = false)String shyid,
                            @RequestParam(value = "shystate", required = false)String shystate, @RequestParam(value = "eid", required = false)String eid,
                            @RequestParam(value = "bxdIds", required = false) List<Integer> bxdIds, @RequestParam(value = "superShy", required = false, defaultValue = "false") Boolean superShy
                            ) {
        if(StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op){
            case "selbxdbyshy" :
            case "upbxdbyshy" :
            case "upBxdbStateBatch" :
            case "upbxdhcbyshy" :
            case "upbxdbyysr" :
                return bxdFeignClient.shyServlet(op, bid, hc, gs, ybid, num, page, xq, state, shyid, shystate, eid, bxdIds, superShy);
            case "selqdb" :
            case "qd" :
                return shyFeignClient.shyServlet(op, bid, hc, gs, ybid, num, page, xq, state, shyid, shystate, eid, bxdIds, superShy);
            default: return new ResponseData(false);
        }
    }
}
