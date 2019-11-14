package class71.no4.com.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.entity.Tool;

public class selectById {
	//ɨ����
		Scanner input = new Scanner(System.in);
		
	public void select(Map<Integer, Tool> tools){
		System.out.println("��������Ҫ��ѯ���豸����:");
		String toolType = input.next();
		
		int toolId = 0;
		
		int sum = 0;
		
		for (Object item : tools.values()) {
			Tool t = (Tool)item;
			if((t.getToolType()).equals(toolType)){
				sum++;
			}
		}
		
		System.out.println(toolType+"����Ϊ"+sum);
		
	}
}
