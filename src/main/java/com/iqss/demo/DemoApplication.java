package com.iqss.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);

		displayAllBeans(context);

		HelloWorld hw = (HelloWorld) context.getBean("sessionScopedBean2");
		hw.setMessage("Hello Paul!");
		var message = hw.getMessage();
		System.out.println(message);
	}

	public static void displayAllBeans(ApplicationContext applicationContext) {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : allBeanNames) {
			System.out.println(beanName);
		}
	}
}
