package cn.edu.glmc.controller.shy;

import cn.edu.glmc.feign.bxd.BxdFeignClient;
import cn.edu.glmc.feign.bxqy.BxqyFeignClient;
import cn.edu.glmc.feign.ewm.EwmFeignClient;
import cn.edu.glmc.feign.hc.HcFeignClient;
import cn.edu.glmc.feign.shy.ShyFeignClient;
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
    private BxqyFeignClient bxqyFeignClient;
    @Autowired
    private HcFeignClient hcFeignClient;
    @Autowired
    private ShyFeignClient shyFeignClient;
    @Autowired
    private EwmFeignClient ewmFeignClient;
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
            case "selbxdbyshy" : return bxdFeignClient.selbxdbyshy(shyid, eid, shystate);
            case "upbxdbyshy" : return bxdFeignClient.upbxdbyshy(shyid, bid, shystate,superShy);
            case "qd" : return shyFeignClient.qd(ybid, xq, state);
            case "selqdb" : return shyFeignClient.selqdb(num, page, ybid);
            case "upbxdhcbyshy" : return bxdFeignClient.upbxdhcbyshy(bid,hc,gs,ybid);
            case "upbxdbyysr" : return bxdFeignClient.upbxdbyysr(shyid,bid,state,superShy);
            default: return new ResponseData(false);
        }
    }
}
