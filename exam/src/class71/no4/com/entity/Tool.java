package class71.no4.com.entity;

import java.sql.Date;

/*
 * �豸ʵ����
 */
public class Tool {
	//�豸���
	private int toolId;
	//�豸����
	private String toolName;
	//�豸����
	private String toolType;
	//�豸�������
	private String toolDate;
	
	//�����ǹ��캯���ͷ�װϸ��
	public Tool() {
		
	}
	public Tool(int toolId, String toolName, String toolType, String toolDate) {
		
		this.toolId = toolId;
		this.toolName = toolName;
		this.toolType = toolType;
		this.toolDate = toolDate;
	}
	public int getToolId() {
		return toolId;
	}
	public void setToolId(int toolId) {
		this.toolId = toolId;
	}
	public String getToolName() {
		return toolName;
	}
	public void setToolName(String toolName) {
		this.toolName = toolName;
	}
	public String getToolType() {
		return toolType;
	}
	public void setToolType(String toolType) {
		this.toolType = toolType;
	}
	public String getToolDate() {
		return toolDate;
	}
	public void setToolDate(String toolDate) {
		this.toolDate = toolDate;
	}
	
	
}
