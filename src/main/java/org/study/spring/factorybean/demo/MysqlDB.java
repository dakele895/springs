package org.study.spring.factorybean.demo;

/**
 * MysqlDB
 *
 * @author dkl
 * 2019/8/23
 **/

public class MysqlDB implements DBOperation<MysqlDBEntity>{
	@Override
	public int save(MysqlDBEntity t) {
		System.out.println("save object to mysql");
		return 1;
	}
	@Override
	public int update(MysqlDBEntity t) {
		System.out.println("update object to mysql");
		return 0;
	}
	@Override
	public int delete(MysqlDBEntity t) {
		System.out.println("delete object from mysql");
		return 0;
	}
	@Override
	public MysqlDBEntity select(Integer id) {
		return new MysqlDBEntity();
	}
}
