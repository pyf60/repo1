package com.itheima.utils;


/**
 * 和事务管理相关的工具类，它包含了，开启事务，提交事务，回滚事务和释放连接
 */
public class TransactionManager {
    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }
    /**
     * 开启事务
     */
    public  void beginTransaction() {
        try{
            connectionUtils.getThreadConnections().setAutoCommit(false);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /**
     * 提交事务
     */
    public  void commit() {
        try{
            connectionUtils.getThreadConnections().commit();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 回滚事务
     */
    public  void rollback(){
        try{
            connectionUtils.getThreadConnections().rollback();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 释放连接
     */
    public  void release(){
        try{
            connectionUtils.getThreadConnections().close();
            connectionUtils.removeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }

    }











    }


