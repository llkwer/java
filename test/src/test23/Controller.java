package test23;

public class Controller {
	
	public void callOrder(String order) {
		if("1".equals(order)) {
			System.out.println("유저리스트를 보고 싶군요");
		}else if("2".equals(order)) {
			System.out.println("유저를 추가하고 싶군요");
		}else if("3".equals(order)) {
			System.out.println("유저생성 하고 싶군요");
		}else if("4".equals(order)){
			System.out.println("유저 삭제 하고 싶군요");
		}else if("q".equals(order)) {
			System.out.println("종료하고 싶군요");
			System.exit(0);
		}else {
			System.out.println("존재하지 않는 명령어 입니다.");
		}
	}

}
