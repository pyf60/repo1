package com.itheima.jdbcTemplate;

import com.itheima.domai.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * jdbcTemplate最基本用法
 * */
public class jdbcTemplateDemo3 {
    public static void main(String[] args) {
//获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate", JdbcTemplate.class);
//        执行操作
//        jt.execute("insert into account(name,money) values('ddd',2222)");
//执行操作
//        保存
//        jt.update("insert into account(name,money) values (?,?)","eee",3333f);
////        更新
//        jt.update("update  account set name=?,money=? where id=?","test",4567,7);
////        删除
//        jt.update("delete from account where id=?",8);
//        查询所有
//       List<Account> accounts= jt.query("select * from account where money > ?",new AccountRowMapper(),1000f);
//       List<Account> accounts= jt.query("select * from account where money > ?",new BeanPropertyRowMapper<Account>(Account.class),1000f);
//        for (Account account : accounts) {
//            System.out.println(account);
//        }
//        查询一个
//        List<Account> accounts = jt.query("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), 1);
//        System.out.println(accounts.isEmpty()?"没有内容":accounts.get(0));
//        查询返回一行一列（使用聚合函数，但是不加group by子句）
        Long count = jt.queryForObject("select count(*) from account where money > ?", Long.class, 1000f);
        System.out.println(count);
    }


    /**
     * 定义一个account的封账策略
     */
    class AccountRowMapper implements RowMapper<Account>{
        /**
         * 把结果集中的数据封装到Account中，然后由spring把每个Account加到集合中
         * @param rs
         * @param rowNUm
         * @return
         * @throws SQLException
         */
        @Override
//获取查询数据库 数据，封装到ResultSet结果集中
        public Account mapRow(ResultSet rs, int rowNUm) throws SQLException {
            Account account=new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setMoney(rs.getFloat("money"));
            return account;

        }
    }
}
