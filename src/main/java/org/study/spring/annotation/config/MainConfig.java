package org.study.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.study.spring.annotation.bean.Person;
import org.study.spring.annotation.controller.BookController;
import org.study.spring.annotation.dao.BookDao;
import org.study.spring.annotation.service.BookService;

/**
 * @Auther: dalele
 * @Date: 2019/11/25 23:39
 * @Description:这是一个配置类
 */
@Configuration
@ComponentScan(value = "org.study.spring.annotation",excludeFilters ={
		//@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
		//按照给定的类型匹配
		//@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
		@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
})
public class MainConfig {

    @Bean
    public Person person(){
        return new Person("zhangsan",11);
    }
}
