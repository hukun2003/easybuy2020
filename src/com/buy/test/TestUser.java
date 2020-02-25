package com.buy.test;

import com.buy.dao.user.IUser;
import com.buy.dao.user.EasybuyUserImpl;
import com.buy.entity.EasybuyUser;
import org.junit.Test;

import java.sql.SQLException;

public class TestUser {
    @Test
    public void aa() throws SQLException, ClassNotFoundException {
        IUser userDao=new EasybuyUserImpl();
        EasybuyUser user=userDao.getUserByloginName("admin");
        System.out.println(user.getEmail());
    }
}
