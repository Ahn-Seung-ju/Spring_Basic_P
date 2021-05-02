package DI_Spring05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp5 {
	public static void main(String[] args) {
		//MySpl 사용 insert 실행 하세요
		
		/*
		ArticleDao_P mysql = new MySqlArticleDao_P();
		ArticleDao_P oracle = new OracleArticleDao_P();
		
		ArticleService_P service = new ArticleService_P(mysql);
		
		Article_P ariticel = new Article_P();
		service.write(ariticel);
		*/
		
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Spring05/DI_05_Spring_P.xml");
		
		ArticleService_P articleService = context.getBean("articleService", ArticleService_P.class);
		Article_P article = context.getBean("article",Article_P.class);
		
		
		articleService.write(article);
		
		
	}
}
