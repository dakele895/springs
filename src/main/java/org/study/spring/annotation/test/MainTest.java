package org.study.spring.annotation.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.spring.annotation.bean.Person;
import org.study.spring.annotation.config.MainConfig;

/**
 * @Auther: dalele
 * @Date: 2019/11/25 23:44
 * @Description:
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = annotationConfigApplicationContext.getBean("person");
        if (person instanceof Person){
          Person  Myperson=(Person)person;
          System.out.println(Myperson.toString());
        }
    }
}
