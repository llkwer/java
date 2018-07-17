package test17;

public class ThreeSixNine {
	public static void main(String[] args) {
		int ranNum = 100;
		int cnt = 0;
		for(int i = 0; i<=ranNum; i++) {
			String s = i+"";
			if(s.indexOf("3")!=-1 ||s.indexOf("6")!=-1||s.indexOf("9")!=-1) {
				cnt++;
		}
	}
	System.out.println("짝 갯수"+cnt);
}
}