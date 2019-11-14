package class71.no4.com.entity;
/*
 * �û�ʵ����
 */
public class User {
	//�û�id
	private int userId;
	//�û���
	private String userName;
	//�û�����
	private String password;
	
	//�����ǹ��캯���ͷ�װϸ��
	public int getId() {
		return userId;
	}

	public void setId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
