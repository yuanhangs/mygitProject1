package class71.no4.com.service;

import java.util.List;
import java.util.Scanner;

import com.entity.User;

public class Login {
	//ɨ����
	Scanner input = new Scanner(System.in);
		
	public void login(List users){
		System.out.println("�����������û���:");
		String userName = input.next();
		System.out.println("��������������:");
		String password = input.next();
		
		//��ʼ���ȽϽ��
		boolean nameFlag = false;
		boolean pwdFlag = false;
		for (Object items : users) {
			//ת������
			User user = (User)items;
			
			//��������û�����֤��booleanֵ
			nameFlag = user.getUserName().equals(userName);
			pwdFlag = user.getPassword().equals(password);
			
			
			}
		//�ж�
		if(nameFlag&&pwdFlag){
			System.out.println("��¼�ɹ�!");
			return;
		}else{
			System.out.println("��¼ʧ�������µ�¼!");
			return;
		}
	}
}
