package org.study.spring.ioc.lookup.method;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @projectName:springs
 * @see:org.study.spring.ioc.lookup.method
 * @author:杜康乐
 * @createTime:2022/09/28
 * @version:1.0
 */
public abstract class CommandManager {

	public  void process(){
		MyCommand command=createCommand();
	}
	protected  abstract  MyCommand createCommand();
}
