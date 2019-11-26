package org.study.spring.annotation.config;

import org.springframework.beans.factory.FactoryBean;
import org.study.spring.annotation.bean.Color;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 * 自定义factorybean
 **/
public class MyFactoryBeanImpl implements FactoryBean<Color> {
	@Override
	public Color getObject() throws Exception {
		//TODO 这里是写自己的逻辑
		return  new Color();
	}

	@Override
	public Class<?> getObjectType() {
		//TODO 这里是写自己的逻辑
		return Color.class;
	}

	/**
	 * 设置是否是单例
	 * @return
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}


}
