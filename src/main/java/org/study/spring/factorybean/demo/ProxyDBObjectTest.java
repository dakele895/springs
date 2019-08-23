package org.study.spring.factorybean.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ProxyDBObjectTest
 *
 * @author dkl
 * 2019/8/23
 **/
public class ProxyDBObjectTest {

	@Test
	public void test2() throws Exception{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory-bean.xml");
		DBOperation dBoperation =  applicationContext.getBean("proxyDB",DBOperation.class);
		MysqlDBEntity dbEntity = new MysqlDBEntity();
		dBoperation.save(dbEntity);
	}


}
