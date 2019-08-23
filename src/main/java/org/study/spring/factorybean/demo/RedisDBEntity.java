package org.study.spring.factorybean.demo;

/**
 * RedisDBEntity
 *
 * @author dkl
 * 2019/8/23
 **/
public class RedisDBEntity extends DBEntity {
	private String jsonStr;

	public String getJsonStr() {
		return jsonStr;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}

}
