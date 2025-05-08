package com.echo.ioc.core02;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


public class UserNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		// 注册 user 标签的解析转换器
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
