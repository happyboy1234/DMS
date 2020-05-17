package xyz.codedog.dao;

import java.util.List;
import xyz.codedog.po.Admin;

public interface AdminMapper {

    int deleteByPrimaryKey(Integer aId);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer aId);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);

    Admin findAdmin(Admin admin);

    List<Admin> findAdminWithPage();
}