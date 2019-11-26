package org.study.spring.annotation.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

import java.util.Set;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 * 自定义导入的逻辑
 **/
public class MyImportSelectorImpl implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"org.study.spring.annotation.bean.Color","org.study.spring.annotation.bean.Student"};
	}
}
