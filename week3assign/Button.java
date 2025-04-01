package week3.assign;

public class Button implements WebElement{

	@Override
	public void click() {
		System.out.println("Click the button");
		}

	@Override
	public void setText() {
		System.out.println("Set the text");
		}
	public void submit() {
		System.out.println("Click on submit");
	}
	
}
