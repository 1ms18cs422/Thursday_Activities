package thursday_activity5_10_nov;

public class Book_details {

	
		static void display(Book b) {
			System.out.println("Book name : " + b.getBookName());
			System.out.println("Book Author name : " + b.getAur());
			System.out.println("Book price : " + b.getPrice());
			System.out.println("Year of publictaion of Book: " + b.getYearOfPub());
		}
			public static void main(String[] args) {
				Book b1 = new Book("Java Programming", 2022, 99.50, new Author("Balaguruswamy", 22));
                display(b1);
	}

}
