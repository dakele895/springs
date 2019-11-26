package org.study.spring.annotation.test;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.ConfigurableEnvironment;
import org.study.spring.annotation.config.MainConfig;
import org.study.spring.annotation.config.MainConfig2;

import javax.annotation.Resource;

/**
 * @Auther: dalele
 * @Date: 2019/11/25 23:59
 * @Description:
 */
public class ComponentScanTest {

	AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);


	@Test
	public void testImport(){
		printBeanName();
		Object myFactoryBean = annotationConfigApplicationContext.getBean("myFactoryBean");
		System.out.println(myFactoryBean.getClass());
	}

	private void  printBeanName(){
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String name:beanDefinitionNames){
			System.out.println(name);
		}
	}



	@Test
	public void test03(){
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String name:beanDefinitionNames){
			System.out.println(name);
		}
		//获取环境配置
		ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
		String property = environment.getProperty("os.name");
		System.out.println(property);
	}







    @Test
	@SuppressWarnings("resource")
	public void test(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String name: beanDefinitionNames){
			System.out.println(name);
		}

	}

	@Test
	@SuppressWarnings("resource")
	public void test2(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String name: beanDefinitionNames){
			System.out.println(name);
		}
		//获取person的bean类
		Object person = annotationConfigApplicationContext.getBean("person");
		//Object person2 = annotationConfigApplicationContext.getBean("person");
		//获取person的beandefinition
		//BeanDefinition person1 = annotationConfigApplicationContext.getBeanDefinition("person");
		//判断是否是单例
		//boolean singleton = person1.isSingleton();
		//System.out.println(singleton);

	}




}
