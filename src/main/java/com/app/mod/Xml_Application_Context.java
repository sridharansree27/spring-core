package com.app.mod;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Xml_Application_Context {

	public static void main(String[] args) {

		// Class Path Xml Application Context
		ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");
		// It not creates an object for interface

		// File System Application Context
//		ApplicationContext container=new FileSystemXmlApplicationContext("C:/Users/Admin/Downloads/Workspace/JAVA/Spring/src/main/java/config.xml");
		// It not creates an object for interface

		Solve bean=(Solve)container.getBean("diff");
		System.out.println(bean);
	}
}