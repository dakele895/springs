package org.study.spring.annotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 **/
@Component
public class Cat implements InitializingBean, DisposableBean {

	public Cat(){
		System.out.println("Cat 构造器创建");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("this.cat--------destory");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("this.cat--------init");
	}


}
