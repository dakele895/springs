package org.study.spring.annotation.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.study.spring.annotation.bean.Color;
import org.study.spring.annotation.bean.Person;
import org.study.spring.annotation.conditional.LinuxConditional;
import org.study.spring.annotation.conditional.WindowsConditional;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 **/
@Configurable
//@Import({MyImportSelectorImpl.class,MyImportBeanDefinitionRegistrarImpl.class})
public class MainConfig2 {

	/**
	 * @Scope 是创建单实例和多实例
	 * 懒加载专门针对于单实例：
	 * 单例bean是在容器启动的时候创建对象；懒加载就是容器启动的时候不创建对象第一次获取bean的时候创建对象
	 *
	 * @return
	 */
	@Lazy
	//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Bean
	public Person person(){
		return new Person("zhangsan",11);
	}

	@Conditional(WindowsConditional.class)
	@Bean("windows")
	public Person windows(){
		return new Person("windows",11);
	}

	/**
	 * conditional 是按照条件创建bean
	 * @return
	 */
	@Conditional(LinuxConditional.class)
	@Bean("linux")
	public Person linux(){
		return new Person("linux",11);
	}


	@Bean
	public MyFactoryBeanImpl myFactoryBean(){
		return  new MyFactoryBeanImpl();
	}
}
