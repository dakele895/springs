package org.study.spring.annotation.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.spring.annotation.config.MainConfig;

import javax.annotation.Resource;

/**
 * @Auther: dalele
 * @Date: 2019/11/25 23:59
 * @Description:
 */
public class ComponentScanTest {
    @Test
    @SuppressWarnings("resource")
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name: beanDefinitionNames){
            System.out.println(name);
        }

    }
}
