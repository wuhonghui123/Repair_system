package cn.edu.glmc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/24/15:37
 */
@RestController
public class HcBatchController {
    @RequestMapping("/downloadHcTemplate")
    public String downloadHcTemplate(HttpServletResponse response) {
        return "";
    }
}
