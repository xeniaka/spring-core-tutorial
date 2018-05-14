package com.wipro.common.config;

import com.wipro.common.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        AccountService accountService = context.getBean(AccountService.class);

        System.out.println(accountService == null ? "NULL" : "SUCCESSFULLY CREATED!");
    }
}
