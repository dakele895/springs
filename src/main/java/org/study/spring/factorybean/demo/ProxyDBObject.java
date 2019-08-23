package org.study.spring.factorybean.demo;

import org.springframework.beans.factory.FactoryBean;

/**
 * ProxyDBObject
 *
 * @author dkl
 * 2019/8/23
 **/
public class ProxyDBObject implements FactoryBean<Object> {

	private String currentDB;
	public String getCurrentDB() {
		return currentDB;
	}

	public void setCurrentDB(String currentDB) {
		this.currentDB = currentDB;
	}

	@Override
	public Object getObject() throws Exception {
		if("mysql".equals(currentDB)){
			return new MysqlDB();
		}
		return new RedisDB();
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	@Override
	public Class<?> getObjectType() {
		if("mysql".equals(currentDB)){
			return MysqlDB.class;
		}
		return RedisDB.class;
	}
}
