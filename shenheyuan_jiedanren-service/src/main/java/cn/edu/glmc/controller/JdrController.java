package cn.edu.glmc.controller;

import cn.edu.glmc.response.ResponseData;
import cn.edu.glmc.service.JdrService;
import cn.edu.glmc.service.ShyService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:44
 */
@RestController
public class JdrController {
    @Autowired
    private ShyService shyService;
    @Autowired
    private JdrService jdrService;
    /**
     * 如果出问题没有签到，则触发此请求，手动签到
     */
    @RequestMapping("/autoAck")
    public ResponseData autoAck(){
        return new ResponseData("success", "自动签到成功，请不要重复刷新来签到");
    }

    /**
     * 测试页面
     */
    @RequestMapping("/test")
    public ResponseData test(){
        return new ResponseData("success", "测试成功");
    }
}
