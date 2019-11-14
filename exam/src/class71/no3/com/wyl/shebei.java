package class71.no3.com.wyl;

import java.util.Date;

/**
 * �豸ʵ����
 * @author DELL
 *
 */
public class shebei {
	public int id;//�豸���
	public String name;//�豸����
	public String lei; //�豸����
	public String riqi;//�������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public shebei() {
		super();
		// TODO Auto-generated constructor stub
	}
	public shebei(int id, String name, String lei, String riqi) {
		super();
		this.id = id;
		this.name = name;
		this.lei = lei;
		this.riqi = riqi;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLei() {
		return lei;
	}
	public void setLei(String lei) {
		this.lei = lei;
	}
	public String getRiqi() {
		return riqi;
	}
	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}
	

}
