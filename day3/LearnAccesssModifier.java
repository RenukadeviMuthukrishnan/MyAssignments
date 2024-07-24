package week1.day3;

public class LearnAccesssModifier {

	public void depositAmount() {
		
	System.out.println("depositAmount");	
		
	}
	private void atmPIN() {
		System.out.println("atmPIN");
	}
	public static void main(String[] args) {
		LearnAccesssModifier acc=new LearnAccesssModifier();
		acc.depositAmount();
		acc.atmPIN();

	}

}

// private menthod cannot be called outside this call