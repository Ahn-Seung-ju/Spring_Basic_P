package DI_Spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp3 {

	public static void main(String[] args) {
		
		/*
		MyBean_P mybean = new MyBean_P();
		System.out.println(mybean);
		//DI_Spring03.MyBean_P@15db9742
		mybean = new MyBean_P();
		System.out.println(mybean);
		//DI_Spring03.MyBean_P@6d06d69c
		
		
		mybean = new MyBean_P("서태희");
		System.out.println(mybean);
		//DI_Spring03.MyBean_P@7852e922
		
		Singleton_P single = Singleton_P.getInstance();
		System.out.println(single);
		//DI_Spring03.Singleton_P@4e25154f
		
		Singleton_P single2 = Singleton_P.getInstance();
		System.out.println(single2);
		//DI_Spring03.Singleton_P@4e25154f
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Spring03/DI_03_Spring_P.xml");
		
		MyBean_P mybean = context.getBean("mybean",MyBean_P.class);
		MyBean_P mybean2 = context.getBean("mybean",MyBean_P.class);
		MyBean_P mybean3 = context.getBean("mybean",MyBean_P.class);
		
		System.out.println(mybean + " / " + mybean2 + " / " + mybean3);
		
		MyBean_P mybean4 = context.getBean("mybean2",MyBean_P.class);
		MyBean_P mybean5 = context.getBean("mybean2",MyBean_P.class);
		System.out.println(mybean4 + " / " + mybean5);
		
		Singleton_P single = context.getBean("single",Singleton_P.class);
		Singleton_P single2 = context.getBean("single",Singleton_P.class);
		single.getInstance();
		
		System.out.println(single + " / " + single2);
		
		
		
		
	}

}
