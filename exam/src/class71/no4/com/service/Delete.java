package class71.no4.com.service;

import java.util.Map;
import java.util.Scanner;

import com.entity.Tool;

public class Delete {
	public void delete(Map<Integer, Tool> tools){
		//ɨ����
		Scanner input = new Scanner(System.in);
		
		System.out.println("������Ҫɾ���Ĳ�Ʒ���");
		int toolId = input.nextInt();
		
		for (Object item : tools.keySet()) {
			if (item.equals(toolId)) {
				System.out.println("ɾ���ɹ�!");
				tools.remove(toolId);
			}
		}
		
	}
}
