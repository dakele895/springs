package org.study.spring.factorybean.demo;

import java.lang.annotation.Documented;

/**
 * RedisDB
 *
 * @author dkl
 * 2019/8/23
 **/
public class RedisDB implements DBOperation<RedisDBEntity> {
	@Override
	public int save(RedisDBEntity t) {
		System.out.println("save this object"+t.getJsonStr());
		return 1;
	}
	@Override
	public int update(RedisDBEntity t) {
		System.out.println("update this object"+t.getJsonStr());
		return 0;
	}
	@Override
	public int delete(RedisDBEntity t) {
		System.out.println("delete this object"+t.getJsonStr());
		return 1;
	}
	@Override
	public RedisDBEntity select(Integer id) {
		System.out.println("select this object by id "+id);
		return new RedisDBEntity();
	}

}
