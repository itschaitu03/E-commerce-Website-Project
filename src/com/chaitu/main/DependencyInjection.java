package com.chaitu.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chaitu.sbeans.WishMessageGenerator;

public class DependencyInjection {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/chaitu/cfgs/applicationContext.xml");
		Object obj=ctx.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		String result=generator.showMessage("Chaitu");
		System.out.println("Greeting ::"+result);
		ctx.close();
	}
}
