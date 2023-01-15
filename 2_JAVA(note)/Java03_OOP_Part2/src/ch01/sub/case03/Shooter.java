package ch01.sub.case03;

public class Shooter {

	private Gun gun; //확장성을 위해서 타입을 상위클래스(Gun)로 해줌
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() {
		this.gun.fire();
	}
	
}
