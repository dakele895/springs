package org.study.spring.beanfactorypostprocessor.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ChangeTeacherBeanFactoryPostProcessorTest
 *
 * @author dkl
 * 2019/8/23
 **/
public class ChangeTeacherBeanFactoryPostProcessorTest {

	@Test
	public void test2() throws Exception{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanfactory-post-processor-teacher.xml");
		Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
		teacher.teach();

	}

}
