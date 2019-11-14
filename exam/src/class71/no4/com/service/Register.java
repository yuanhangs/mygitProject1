package class71.no4.com.service;

import java.util.Scanner;

import com.entity.User;

public class Register {
	//ɨ����
	Scanner input = new Scanner(System.in);
	
	public User register(int defaultId){
		System.out.println("�����������û���:");
		String userName = input.next();
		System.out.println("��������������:");
		String password = input.next();
		
		//����user���󲢸�ֵ
		int userId = defaultId+1;
		User user = new User(userId,userName,password);
		System.out.println(userId);
		return user;
	}
}
