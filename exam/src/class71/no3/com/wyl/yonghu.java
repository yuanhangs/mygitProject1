package class71.no3.com.wyl;
/**
 * �û�ʵ����
 * @author DELL
 *
 */
public class yonghu {
	public int userId;//�û����
	public String userName;//�û�����
	public String userPassword;//�û�����
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public yonghu(int userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public yonghu() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
