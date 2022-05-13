package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk trasportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		trasportationWalk.move();
		ctx.close();
	}
}