package com.app.mod;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Bean_Factory {

	public static void main(String[] args) {
		// Bean Factory
		Resource config=new ClassPathResource("config.xml");
		BeanFactory container=new XmlBeanFactory(config);
		// It not creates an object for interface

		Solve bean=(Solve)container.getBean("diff");
		System.out.println(bean);
	}
}