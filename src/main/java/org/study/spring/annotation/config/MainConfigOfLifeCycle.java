package org.study.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.study.spring.annotation.bean.Car;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 **/
@Configuration
@ComponentScan("org.study.spring.annotation.bean")
public class MainConfigOfLifeCycle {


	/**
	 * 单例可以自动销毁，多例的情况下要自己手动销毁
	 * @return
	 */
	@Bean(initMethod ="init",destroyMethod ="destroy" )
	public Car car(){
		return new Car();
	}

}
