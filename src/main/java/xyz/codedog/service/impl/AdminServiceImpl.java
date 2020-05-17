package xyz.codedog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.codedog.dao.AdminMapper;
import xyz.codedog.po.Admin;
import xyz.codedog.service.AdminService;

import java.util.List;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/5/17 15:54
 * @Version 1.0
 **/
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findAdmin(Admin admin) {
        Admin admin1 = adminMapper.findAdmin(admin);
        return admin1;
    }

    @Override
    public List<Admin> findAdminWithPage() {
        List<Admin> adminList = adminMapper.findAdminWithPage();
        return adminList;
    }

    @Override
    public int deleteByPrimary(Integer id) {
        int i = adminMapper.deleteByPrimaryKey(id);
        return i;
    }
}
