package shop;
import java.util.ArrayList;
import java.util.Random;
public class UserManager {
	
	private Random ran;
	
	private ArrayList<User> group;
	
	private UserManager() {
		this.group = new ArrayList<>();
		this.ran = new Random();
	}
	// 클래스 내부에서 단일객체 생성하기 
	private static UserManager userManager = new UserManager();
	// 클래스 내부에서 게터 제공
	public static UserManager getUserManager() {
		return userManager;
	}
	
	
	// 기능 CRUD
	
	// C
	public void createUser(String name,String id,String password) {
		User user = new User(id,password,name);
		group.add(user);
	}
	
	
}
