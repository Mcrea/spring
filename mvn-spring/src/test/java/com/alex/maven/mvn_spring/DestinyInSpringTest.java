package com.alex.maven.mvn_spring;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DestinyInSpringTest {
	@Test
	public void test() {
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("spring/spring.xml");
		DestinyInSpring destiny = aac.getBean("alex", DestinyInSpring.class);
		System.out.println(destiny.getName());
		aac.registerShutdownHook();
	}

}
