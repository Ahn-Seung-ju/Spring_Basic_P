package DI_Spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Spring02/DI_02_Spring_P.xml");
		
		MessageBean_P2 message = context.getBean("ms",MessageBean_P2.class);
		
		message.sayHello();
		
	}
}
