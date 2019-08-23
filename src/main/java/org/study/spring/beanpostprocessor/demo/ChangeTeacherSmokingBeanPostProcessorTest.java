package org.study.spring.beanpostprocessor.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ChangeTeacherSmokingBeanPostProcessorTest
 *
 * @author dkl
 * 2019/8/23
 **/
public class ChangeTeacherSmokingBeanPostProcessorTest {

	@Test
	public void test2() throws Exception{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-post-processor-teacher.xml");
		Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
		teacher.teach();

	}

}
