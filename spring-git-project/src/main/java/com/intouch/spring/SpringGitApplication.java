package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGitApplication {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Hello Git");
        System.out.println("update1");
        System.out.println("branch修改bug1");
        System.out.println("update2");
        System.out.println("master分支继续修改aaa");
    }
}
