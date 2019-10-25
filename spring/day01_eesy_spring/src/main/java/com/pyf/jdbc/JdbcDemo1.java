package com.pyf.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * 程序的耦合
 * 耦合：程序间的依赖关系
 *      包括
 *          类之间的依赖
 *             第一步： 创建对象时，使用反射创建对象，避免使用new创建
 *              第二步： 通过读取配置文件来获取要创建的对象全限定类名
 *          方法间的依赖
 * 解耦：降低程序间的依赖关系
 *          实际开发中要做到编译期不依赖，运行时才依赖
 *
 *
 *
 * 异常：编译期没有错误，在运行时出现错误
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
//        操作数据库一般步骤
//        1.注册驱动
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");//降低依赖关系，此行相当于一个字符串
//        2.获取连接
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root","root");
//        3.获取操作数据库的预处理对象
        PreparedStatement pstm=conn.prepareStatement("select * from account");
//        4.执行sql，得到结果集
        ResultSet rs=pstm.executeQuery();
//        5.遍历结果集
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
//        6.释放资源
        rs.close();
        pstm.close();
        conn.close();


    }

}
