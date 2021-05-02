package DI_Spring06;

public class ArticleDao_P {
	String name;
	int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public ArticleDao_P(String name, int num) {
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "ArticleDao_P [name=" + name + ", num=" + num + "]";
	}
	public ArticleDao_P() {
		System.out.println("Article Dao 생성자 확인");
	}
	
	
}
