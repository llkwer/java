package test18;

public class Data {
	int a=3;
	
	
	public Data() {
		System.out.println("전 Data 생성자 입니다.");
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		
		d.a = 10;
		
		if(d.a==10) {
			d.a = 3;
			d = new Data();
			System.out.println(d.a);
		}
	}

}
