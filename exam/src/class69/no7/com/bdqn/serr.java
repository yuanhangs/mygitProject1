package class69.no7.com.bdqn;
/*
 * �豸ʵ����
 */
public class serr {
	int id;//�豸���
	String sbName;//�豸����
	String sbLeix;//�豸����
	String sbDay;//�������
	
	//ȫ��
	
	public serr(int id, String sbName, String sbLeix, String sbDay) {
		super();
		this.id = id;
		this.sbName = sbName;
		this.sbLeix = sbLeix;
		this.sbDay = sbDay;
	}
	//�ղ�
	public serr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSbName() {
		return sbName;
	}
	public void setSbName(String sbName) {
		this.sbName = sbName;
	}
	public String getSbLeix() {
		return sbLeix;
	}
	public void setSbLeix(String sbLeix) {
		this.sbLeix = sbLeix;
	}
	public String getSbDay() {
		return sbDay;
	}
	public void setSbDay(String sbDay) {
		this.sbDay = sbDay;
	}
	
}
