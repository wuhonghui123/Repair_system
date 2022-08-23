package cn.edu.glmc.controller;

import cn.edu.glmc.bean.Admin;
import cn.edu.glmc.response.ResponseData;
import cn.edu.glmc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/23/15:25
 */
@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/AdminLogin")
    @ResponseBody
    ResponseData adminLogin(@RequestParam("account")String account, @RequestParam("password")String password, HttpSession session) throws UnsupportedEncodingException {
        Admin s = new Admin();
        s.setAccount(account);
        s.setPassword(password);
        Admin temp = adminService.login(s);
        if(temp==null || temp.getId()==null){
            return new ResponseData(false);
        }else{
            session.setAttribute("admin", s);
            return new ResponseData(true);
        }
    }
}
