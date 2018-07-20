package test25;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {
	public ArrayList<HashMap<String,String>> selectUserList();
	public int insertUserInfo(HashMap<String,String> userInfo);
	public int deleteUserInfo(HashMap<String,String> userInfo);
	public int updateUserinfo(HashMap<String,String> userInfo);
	
}
