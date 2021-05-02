package DI_Spring05;

public class ArticleService_P {
	private ArticleDao_P articledao;
	
	public ArticleService_P(ArticleDao_P articledao) {
		this.articledao = articledao;
		System.out.println("생성자 생성 확인");
	}
	
	public void write(Article_P article) {
		this.articledao.insert(article);
	}
	
}
