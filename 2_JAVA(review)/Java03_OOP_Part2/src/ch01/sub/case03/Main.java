package ch01.sub.case03;

public class Main {
	public static void main(String[] args) {
		
		Gun pistol = new Pistol(); // 업케스팅
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);
		shooter.fire();
		
		shooter.setGun(rifle); // 업케스팅
		shooter.fire();
	}
}
