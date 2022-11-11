package thursday_activity5_10_nov;

public class Author {
	private String authorName;
	private int age;
	public Author() {
		super();
	}
	
	public Author(String authorName, int age) {
		super();
		this.authorName = authorName;
		this.setAge(age);
	}
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}  
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String toString() {
		return authorName + "  Age: " + age;
	}
}
