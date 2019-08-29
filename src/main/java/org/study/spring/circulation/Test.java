package org.study.spring.circulation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test
 *
 * @author dkl
 * 2019/8/28
 **/
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("circulation.xml");
		System.out.println(context.getBean("a", StudentA.class));
	}

}
