/**
 * 连接oracle 数据库
 * */

package com.cn;
import java.sql.*;
public class L5 {
    // dbUrl数据库连接串信息，其中“1521”为端口，“ora9”为sid
    String dbUrl = "jdbc:oracle:thin:@localhost:1521/XE";
    // theUser为数据库用户名
    String theUser = "test";
    // thePw为数据库密码
    String thePw = "1234";
    // 几个数据库变量
    Connection c = null;
    Statement conn;
    ResultSet rs = null;
    // 初始化连接
    public L5() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            // 与url指定的数据源建立连接
            c = DriverManager.getConnection(dbUrl, theUser, thePw);
            // 采用Statement进行查询
            conn = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 执行查询
    public ResultSet executeQuery(String sql) {
        rs = null;
        try {
            rs = conn.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public void close() {
        try {
            conn.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Test is true!");
        ResultSet newrs;
        L5 newjdbc = new L5();
        System.out.println(newjdbc);
        newrs = newjdbc.executeQuery("select * from dba_users");
        try {
            while (newrs.next()) {
                System.out.print(newrs.getString("USER_ID"));
                System.out.print("\t" + newrs.getString("USERNAME"));
                System.out.println("\t"+newrs.getString("DEFAULT_TABLESPACE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        newjdbc.close();
    }
}