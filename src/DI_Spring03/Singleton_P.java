package DI_Spring03;

public class Singleton_P {
	private Singleton_P() {}
	
	private static Singleton_P instance;
	
	public static Singleton_P getInstance() {
		
		if(instance == null) {
			instance = new Singleton_P();
		}
		
		return instance;
		
	}
}
