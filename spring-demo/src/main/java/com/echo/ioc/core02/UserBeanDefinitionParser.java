package com.echo.ioc.core02;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

// AbstractSingleBeanDefinitionParser 是一个 BeanDefinition 转换器的抽象类
// 用于解析设置 BeanDefinition 的字段值
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String userName = element.getAttribute("username");
		String email = element.getAttribute("email");
		String password = element.getAttribute("password");

		if (StringUtils.hasLength(userName)) {
			builder.addPropertyValue("username", userName);
		}

		if (StringUtils.hasLength(email)) {
			builder.addPropertyValue("email", email);
		}
		if (StringUtils.hasLength(password)) {
			builder.addPropertyValue("password", password);
		}
	}
}
