package org.study.spring.ioc;

import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.spring.ioc.lookup.method.CommandManager;

/**
 * @description: 测试lookup-method 标签
 * AbstractAutowireCapableBeanFactory.createBean时候需要检测该标签是否存在。
 * {@link AbstractAutowireCapableBeanFactory}
 * @projectName:springs
 * @see:org.study.spring.ioc
 * @author:杜康乐
 * @createTime:2022/09/28
 * @version:1.0
 */

public class TestLookupMethod {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("classpath:lookupmethod/applicationContext.xml");
		CommandManager manager = context.getBean("manager",CommandManager.class);
		//System.out.println(manager.getClass().getName());
		manager.process();

	}

}
