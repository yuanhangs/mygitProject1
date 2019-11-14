package class71.no4.com.service;

import java.util.Map;
import java.util.Scanner;

import com.entity.Tool;

public class Update {
	public void update(Map<Integer, Tool> tools){
		//ɨ����
				Scanner input = new Scanner(System.in);
				
		System.out.println("�������豸���:");
		int toolId = input.nextInt();
		
		boolean flag1 = false;
		for (Object item : tools.keySet()) {
			if(item.equals(toolId)){
				flag1 = true;
				break;
			}
		}
		
		
	}
}
