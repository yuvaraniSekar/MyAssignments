package week2.assignment;

public class LibraryManagement {//creating sub class in same package

	public static void main(String[] args) {
		Library l2 = new Library();
		l2.addBook("Devil story");//calling parent class method using obj ref
		l2.issueBook();

	}

}
