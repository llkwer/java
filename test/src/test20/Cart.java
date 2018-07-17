package test20;

public class Cart implements Drive{
	protected String name;
	protected int speed;
	protected int demaege;
	public Cart(String name, int speed, int damaege) {
		this.name = name;
		this.speed = speed;
		this.demaege = demaege;
	}
	@Override
	public String attack(int damaege) {
		// TODO Auto-generated method stub
		return demaege + "로 공격합니다.";
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(speed + "로 달립니다.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("정지합니다.");
	}

}
