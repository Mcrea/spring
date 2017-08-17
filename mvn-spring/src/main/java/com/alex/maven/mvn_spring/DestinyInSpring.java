package com.alex.maven.mvn_spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DestinyInSpring implements InitializingBean,DisposableBean,ApplicationContextAware,BeanNameAware  {
	private String name;
	
	public void init(){
		System.out.println("7.bean的init方法执行");
	}
	
	public void iDestroy(){
		System.out.println("10.bean的iDestroy方法执行");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("6.bean的afterPropertiesSet方法执行");
	}
	
	@Override
	public void destroy(){
		System.out.println("9.bean的destroy方法执行");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("2.bean属性注入方法执行");
		this.name = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4.bean的setApplicationContext方法执行");
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("3.bean的beanNameAware方法执行 ");
		
	}

}
