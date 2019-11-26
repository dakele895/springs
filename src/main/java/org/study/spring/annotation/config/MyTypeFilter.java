package org.study.spring.annotation.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author dkl
 * @version 1.0 2019/11/26
 **/
public class MyTypeFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

		//获取注解
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取类名
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		//获取资源包
		Resource resource = metadataReader.getResource();
		System.out.println("----------");
		//如果包含er直接被过滤掉
		if (classMetadata.getClassName().contains("er")){
			return  true;
		}
		return false;
	}
}
