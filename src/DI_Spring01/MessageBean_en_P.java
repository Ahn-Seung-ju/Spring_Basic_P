package DI_Spring01;

public class MessageBean_en_P implements MessageBean_P {

	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}

}
