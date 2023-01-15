package ch04.ex02;

public class C03SwitchStr {
	public static void main(String[] args) {
		
		String grade = "silver";
		String coupon = "";
		
		switch (grade) { // String
		case "gold":
			coupon += "10,000원\n"; break;
		case "silver":
			coupon += "5,000원\n"; break;
		case "brond":
			coupon += "1,000원";
		}
		
		System.out.println(coupon);
	}
}
