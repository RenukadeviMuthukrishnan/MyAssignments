package week1.day3;

public class Browser {

	public void launchBrowser(String Browsername) {
		System.out.println("Browser launched successfully");
	}
	
	public void loadurl() {
		System.out.println("Application launched successfully");
	}
	
	public static void main(String[] args) {
		Browser obj=new Browser();
		obj.launchBrowser(null);
		obj.loadurl();
	}
}s