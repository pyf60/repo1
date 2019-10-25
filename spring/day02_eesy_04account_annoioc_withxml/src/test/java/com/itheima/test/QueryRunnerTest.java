package com.itheima.test;

import config.SpringConfigration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试Query是否单例
 */
public class QueryRunnerTest {

    @Test
    public void testQueryRunner(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigration.class);
        QueryRunner runnner = ac.getBean("runner", QueryRunner.class);
        QueryRunner runnner1 = ac.getBean("runner", QueryRunner.class);
        System.out.println(runnner==runnner1);

    }





}
