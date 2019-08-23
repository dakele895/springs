package org.study.spring.beanfactorypostprocessor.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * ChangeTeacherBeanFactoryPostProcessor
 *
 * @author dkl
 * 2019/8/23
 **/
public class ChangeTeacherBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("teacher");
		MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
		if(mutablePropertyValues.contains("smoking")){
			mutablePropertyValues.add("smoking", false);
		}

	}
}
