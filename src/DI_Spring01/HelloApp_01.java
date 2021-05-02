package DI_Spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_01 {

	public static void main(String[] args) {
		
		/*
		MessageBean_P message = new MessageBean_en_P();
		message.sayHello("안승주");
		
		message = new MessageBean_kr_P();
		message.sayHello("안승주");
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Spring01/DI_01_Spring_P.xml");
		MessageBean_P message = context.getBean("ms_bean_kr", MessageBean_P.class);
		message.sayHello("안승주");
		
		message = context.getBean("ms_bean_en", MessageBean_P.class);
		message.sayHello("이성훈");
	}

}
