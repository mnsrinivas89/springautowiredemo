package com.verizontraining.springautowiredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
		// "com/verizontraining/springautowiredemo/config.xml");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		 Player player = (Player) ctx.getBean(Player.class);

		 System.out.println(player);
		
		  Club club = (Club) ctx.getBean(Club.class); System.out.println(club);
		  ctx.registerShutdownHook();
		 

	}
}
