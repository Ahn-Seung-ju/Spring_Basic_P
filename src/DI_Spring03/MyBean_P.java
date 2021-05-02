package DI_Spring03;

public class MyBean_P {
	public MyBean_P() {
		System.out.println("default");
	}
	
	public MyBean_P(String name) {
		System.out.println("overloading" + name);
	}
}
