package week2.assignment;

public class Library {
	//method creation
	protected String addBook(String bookTitle) {
		System.out.println("Book added successfully");//print statement
		return bookTitle;
	}
	//second method creation
	public void issueBook() {
		System.out.println("Book issued successfully");//print statement
	}

	public static void main(String[] args) {//main declaration
		
Library lib = new Library();//object creation
lib.addBook("India today");//calling method using obj ref
lib.issueBook();
	}

}
