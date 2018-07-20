package test25;

import java.util.ArrayList;
import java.util.HashMap;

public class Exec {
	
	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		ArrayList<HashMap<String,String>> userList = udao.selectUserList();
		
	}

}
