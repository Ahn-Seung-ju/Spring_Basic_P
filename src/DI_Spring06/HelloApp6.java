package DI_Spring06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp6 {

	public static void main(String[] args) {
		
		
		/*
		JobExecute_P execute = null;
		execute = new JobExecute_P("str" , "str2");
		execute.setData(100);
		System.out.println(execute.getData());
		execute.setArticleDao(new ArticleDao_P("str", 100));
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Spring06/DI_06_Spring_P.xml");
		
		JobExecute_P execute = context.getBean("jobExecute",JobExecute_P.class);
		
		
		
		System.out.println(execute.getData());
	}

}
