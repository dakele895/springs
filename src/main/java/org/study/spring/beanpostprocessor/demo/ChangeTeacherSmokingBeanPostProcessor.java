package org.study.spring.beanpostprocessor.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ChangeTeacherSmokingBeanPostProcessor
 *
 * @author dkl
 * 2019/8/23
 **/
public class ChangeTeacherSmokingBeanPostProcessor implements BeanPostProcessor {
	/**
	 * 处理之前
	 * @param bean
	 * @param beanName
	 * @return Object
	 **/
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		/**
		 * 只处理该bean的类型是Teacher的
		 */
		if(bean instanceof Teacher){
			Teacher teacher = (Teacher)bean;
			/**
			 * 实例化之前，要吧所有抽烟的都改成不抽烟的
			 */
			if(teacher.isSmoking()){
				((Teacher)bean).setTempSmoking(false);
			}
		}
		return bean;
	}

	/**
	 * 处理之后
	 * @param bean
	 * @param beanName
	 **/
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
