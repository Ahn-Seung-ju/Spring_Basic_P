package DI_Spring05;

public class Article_P {
	String name;
	String num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Article_P() {
	}
	public Article_P(String name, String num) {
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Article_P [name=" + name + ", num=" + num + "]";
	}
	
	
	
}
