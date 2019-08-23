package org.study.spring.factorybean.demo;

/**
 * MysqlDBEntity
 *
 * @author dkl
 * 2019/8/23
 **/
public class MysqlDBEntity extends DBEntity{
	private String attribute;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
