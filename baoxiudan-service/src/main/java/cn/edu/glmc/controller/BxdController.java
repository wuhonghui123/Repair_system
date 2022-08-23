package cn.edu.glmc.controller;

import cn.edu.glmc.bean.Bxd;
import cn.edu.glmc.feign.EwmService;
import cn.edu.glmc.http.HttpResult;
import cn.edu.glmc.response.ResponseData;
import cn.edu.glmc.service.BxdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:13
 */
@RestController
public class BxdController {
    @GetMapping("/bxd/getbxdlist")
    List<Bxd> getBxdList(){
        return bxdService.getBxdList();
    }
    @GetMapping("/test")
    String test(){
        return "测试zhon。。。。。";
    }

    @Autowired
    private BxdService bxdService; //报修单

    }
