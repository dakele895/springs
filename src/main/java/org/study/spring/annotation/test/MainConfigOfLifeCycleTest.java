package org.study.spring.annotation.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.spring.annotation.config.MainConfigOfLifeCycle;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 * 生命周期  1.在@bean注解设置初始化和销毁的方法
 * 2.实现InitializingBean, DisposableBean 来初始化和销毁方法
 * 3.实现BeanPostProcessor
 **/
public class MainConfigOfLifeCycleTest {

	AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

	@Test
	public void test(){
		printBeanName();
		//annotationConfigApplicationContext.close();

	}

	private void  printBeanName(){
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String name:beanDefinitionNames){
			System.out.println(name);
		}
	}

}
