package week3.assign;

public class TextField implements WebElement{

	@Override
	public void click() {
		System.out.println("Click the button");
	}

	@Override
	public void setText() {
		System.out.println("Set the text");
	}
	
	public void getText() {
		System.out.println("Get the text value");
	}

}
