package cn.edu.glmc.controller;

import cn.edu.glmc.bean.Shy;
import cn.edu.glmc.service.ShyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:59
 */
@RestController
public class ShyController {
    @Autowired
    private ShyService shyService;
    @RequestMapping("/shyservice/selallqy")
    List<Shy> selallqy(){
        return shyService.selallqy();
    }
}
