package xyz.codedog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.codedog.po.Admin;
import xyz.codedog.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName AdminController
 * @Description
 * @Author Administrator
 * @Date 2020/5/17 15:52
 * @Version 1.0
 **/
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/tologin.action",method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login(Admin admin, Model model, HttpSession session, HttpServletRequest request) {
        Admin ad = adminService.findAdmin(admin);
        System.out.println(ad);
        if (ad != null) {
            session.setAttribute("ad",ad);
            return "homepage";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "login";
    }

    @RequestMapping(value = "/loginOut.action")
    public String logout(Admin admin,Model model,HttpSession session) {
        session.invalidate();
        return "redirect:tologin.action";
    }



}
