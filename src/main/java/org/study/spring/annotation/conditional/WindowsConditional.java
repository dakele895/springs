package org.study.spring.annotation.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 **/
public class WindowsConditional implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//获取到开发环境
		Environment environment = context.getEnvironment();
		//获取到bean注册类
		BeanDefinitionRegistry registry = context.getRegistry();

		if (environment.getProperty("os.name").contains("Windows")){
			return  true;
		}
		return false;
	}
}
