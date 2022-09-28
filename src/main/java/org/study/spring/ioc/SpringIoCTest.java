package org.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringIoCTest
 *
 * @author dkl
 * 2019/8/23
 **/
public class SpringIoCTest {
	@Test
	public void test1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean.xml");
		SayService sayService = (SayService)applicationContext.getBean("test");
		sayService.say();
	}

}
