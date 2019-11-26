package org.study.spring.annotation.bean;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 **/
public class Car {

	public Car(){
		System.out.println("类被创建");
	}


	public void init(){
		System.out.println("car---- 初始化");
	}


	public void destroy(){
		System.out.println("car ------- destroy销毁");
	}
}
