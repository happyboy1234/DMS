package xyz.codedog.service;

import xyz.codedog.po.Admin;

import java.util.List;

/**
 * @ClassName AdminService
 * @Description
 * @Author Administrator
 * @Date 2020/5/17 15:53
 * @Version 1.0
 **/
public interface AdminService {
    Admin findAdmin(Admin admin);

    List<Admin> findAdminWithPage();

    int deleteByPrimary(Integer id);
}
