package ch04.ex02;

public class C03SwitchString {
	public static void main(String[] args) {
		
		String grade = "gold";
		String coupon = "";
		
		switch (grade) { //String
		case "gold":
			coupon = "10,000원\n"; break;
		case "silver":
			coupon = "5,000원\n"; break;
		case "bronze":
			coupon = "1,000원\n"; break;
		} 
		
		System.out.println(coupon);
	}
}
