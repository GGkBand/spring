package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
	public static void main(String[] args) {
		duke();
	}

	private static void duke() {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");

		Performer performer
	}
}
