package com.app.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation_Application_Context {

	public static void main(String[] args) {

		// Class Path Xml Application Context
//		ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

		// File System Application Context
//		ApplicationContext container=new FileSystemXmlApplicationContext("C:/Users/Admin/Downloads/Workspace/JAVA/Spring/src/main/java/config.xml");

//		Diff bean=(Diff)container.getBean("diff");

		// Annotation Config Application Context
		ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
		// It creates an object for interface

		Solve bean=(Solve)container.getBean(Solve.class);
		System.out.println(bean);

	}
}