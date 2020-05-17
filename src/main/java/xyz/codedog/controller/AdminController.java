package xyz.codedog.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.codedog.po.Admin;
import xyz.codedog.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/tologin.action",method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * 用户登录
     * @param admin
     * @param model
     * @param session
     * @param request
     * @return
     */
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

    /**
     * 退出登录
     * @param admin
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/loginOut.action")
    public String logout(Admin admin,Model model,HttpSession session) {
        session.invalidate();
        return "redirect:tologin.action";
    }

    /**
     * 管理员列表 ———— 分页展示
     *  分页暂未完成
     * @param model
     * @return
     */
    @RequestMapping(value = "/findAdmin.action")
    public String findAdminWithPage(Model model) {
        List<Admin> admins = adminService.findAdminWithPage();
        model.addAttribute("ai",admins);
        return "admin_list";
    }

    @RequestMapping(value = "/deleteAdmin.action")
    @ResponseBody
    public String deleteByPrimaryKey(Integer id) {
        int a = adminService.deleteByPrimary(id);
        System.out.println(a);
        return "admin_list";
    }

}
