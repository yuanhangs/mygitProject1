package class71.no2.com.dao;

public class User {
	
	public static Object getname;
	public static Object getpassword;
	private int id;//���
	private String name;//����
	private String password;//����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String password) {
		super();
		this.id=id;
		this.name=name;
		this.password=password;
	}
	

}
