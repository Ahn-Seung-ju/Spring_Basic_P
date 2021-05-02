package DI_Spring07;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp7 {
	public static void main(String[] args) {
		
		/*
		Map<String, ProtocolHandler2_P> handlers = new HashMap<String, ProtocolHandler2_P>();
		
		handlers.put("rss", new RssHandler_P());
		handlers.put("rest",new RestHandler_P());
		
		ProtocolHandlerFactory_P phf = new ProtocolHandlerFactory_P();
		phf.setHandlers(handlers);
		phf.handlers_length();
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Spring07/DI_07_Spring_P.xml");
		
		ProtocolHandlerFactory_P phf = context.getBean("protocolHandlerFactory", ProtocolHandlerFactory_P.class);
		
		phf.handlers_length();
		
		
	}
}
