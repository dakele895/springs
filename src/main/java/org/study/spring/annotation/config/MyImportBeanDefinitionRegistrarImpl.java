package org.study.spring.annotation.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 **/
public class MyImportBeanDefinitionRegistrarImpl implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinition beanDefinition=new GenericBeanDefinition();
		beanDefinition.setBeanClassName("org.study.spring.annotation.bean.Red");
		registry.registerBeanDefinition("red",beanDefinition);
	}
}
