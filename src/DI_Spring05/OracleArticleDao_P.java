package DI_Spring05;

public class OracleArticleDao_P implements ArticleDao_P{

	@Override
	public void insert(Article_P article) {
		System.out.println(article);
	}

}
