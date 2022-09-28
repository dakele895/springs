package org.study.spring.ioc.lookup.method;

/**
 * @description: 水果盘可以拿到水果
 * @projectName:springs
 * @see:org.study.spring.ioc.lookup.method
 * @author:杜康乐
 * @createTime:2022/09/28
 * @version:1.0
 */

public abstract class FruitPlate {
	// 抽象方法获取新鲜水果
	public abstract Fruit getFruit();
}
