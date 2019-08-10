package com.dld.hll.financial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 17:30
 */

public class DbUtil {


    public static Connection getConn() {
        String url = "jdbc:mysql://47.98.195.229:3306/student";
        String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String pwd = "Hualala4039!";

        url = "jdbc:h2:tcp://localhost/~/test";
        driver = "org.h2.Driver";
        username = "sa";
        pwd = null;
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
