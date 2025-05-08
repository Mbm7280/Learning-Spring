package com.echo.ioc.core02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/29 19:24
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: DemoTest
 * 文件描述: [
 * 		Spring-Ioc-03-自定义标签
 * ]
 * version：1.0
 *
 ********************************************************/
public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/ioc/core02/spring-custom-tags.xml");
		User user = (User)context.getBean("echo");
		System.out.println(user);
	}

}
