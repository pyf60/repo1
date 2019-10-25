package com.itheima.utils;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * 连接的工具类*/
public class ConnectionUtils {

    private ThreadLocal<Connection> tl=new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnections(){
//            先从LocalThread中获取

        try {
            Connection conn = tl.get();
//            判断线程数
            if (conn == null){
//                从数据源中获取一个连接，并与线程就行绑定，并且存入ThreadLocal
                conn=dataSource.getConnection();
                tl.set(conn);
            }
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把连接和线程解绑
     */
    public void removeConnection(){
        tl.remove();
    }

}
