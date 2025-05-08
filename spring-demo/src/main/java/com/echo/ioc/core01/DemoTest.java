package com.echo.ioc.core01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/5/8 19:25
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: DemoTest
 * 文件描述: [
 * 		对应文章：
 * 			Spring-Ioc-01-resolvePlaceholders
 *			Spring-Ioc-02-BeanDefinition
 * ]
 * version：1.0
 *
 ********************************************************/
public class DemoTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/ioc/core01/${user}.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

}