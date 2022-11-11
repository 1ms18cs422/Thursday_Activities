package thursday_activity5_10_nov;

public class Book {
	private String book_name;
	private int Y_O_P;
	private double price;
	private Author aur;
	
	Book()
	{
		super();
	}
	Book(String book_name,int Y_O_P,double price,Author aur){
		this.book_name=book_name;
		this.Y_O_P=Y_O_P;
		this.price=price;
		this.setAur(aur);
	}


	public String getBookName()
	{
		return book_name;
	}
	public void setBookName(String book_name) {
		this.book_name=book_name;
	}
	
	public int getYearOfPub()
	{
		return Y_O_P;
	}
	public void setYearOfPub(int Y_O_P) {
		this.Y_O_P=Y_O_P;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	public Author getAur()
	{
		return aur;
	}
	public void setAur(Author aur) {
		this.aur=aur;
	}
}
