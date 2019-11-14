package class71.no2.com.dao;

public class SheBei {
	
	private int Sid;  //�豸���
	private String Sname;//�豸����
	private String Slx;  //�豸����
	private String Srq;  //���ʱ��
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSlx() {
		return Slx;
	}
	public void setSlx(String slx) {
		Slx = slx;
	}
	public String getSrq() {
		return Srq;
	}
	public void setSrq(String srq) {
		Srq = srq;
	}
	
	
	public SheBei() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SheBei(int sid, String sname, String slx, String srq) {
		super();
		Sid = sid;
		Sname = sname;
		Slx = slx;
		Srq = srq;
		
	}
	
	

}
