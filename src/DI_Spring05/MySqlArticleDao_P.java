package DI_Spring05;

public class MySqlArticleDao_P implements ArticleDao_P{

	@Override
	public void insert(Article_P article) {
		article.setName("MySql");
		article.setNum("포트 번호 1521");
		System.out.println(article);
	}

}
