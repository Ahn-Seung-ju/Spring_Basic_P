package DI_Spring01;

public class MessageBean_kr_P implements MessageBean_P {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕 " + name);
	}

}
