package class69.no7.com.bdqn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//�û�
		List<user>users=new ArrayList<>();
		user user1=new user(1,"����","12345");
		user user2=new user(2,"����","666666");
		users.add(user1);
		users.add(user2);
		//�����û���Ϣ
		 for (user u: users) {
	            System.out.print(u.getId()+"\t"+u.getUserName()+"\t"+u.getPassword());
	            System.out.println();
	        }
		//�豸
		 List<serr>list=new ArrayList<>();
		 serr list1=new serr(1,"������","��е�豸","2018-2-2");
		 serr list2=new serr(2,"������","��е�豸","2018-5-2");
			list.add(list1);
			list.add(list2);
		 
		 
		System.out.println("1.ע��");
		System.out.println("2.��¼");
		System.out.println("3.�����豸��ѯ�豸����");
		System.out.println("4.�����豸��Ϣ");
		System.out.println("5.ɾ��ָ���豸");
		System.out.println("6.���ݱ���޸��豸���ʱ��");
		System.out.println("0.�˳�");
		System.out.println("��ѡ��");
		
		
		Scanner input=new Scanner(System.in);
		int key=input.nextInt();
		switch (key) {
		case 1:
			System.out.println("�������û���");
			String name=input.next();
			System.out.println("����������");
			String pws=input.next();
			System.out.println("ע��ɹ�");
			break;
		case 2:
			System.out.println("�������û���");
			String name1=input.next();
			System.out.println("����������");
			String pws1=input.next();
			System.out.println("��¼�ɹ�");
			break;
		case 3:
			System.out.println("��ѯ�ɹ�");
			break;
		case 4:
			System.out.println("���ӳɹ�");
			break;
		case 5:
			System.out.println("ɾ���ɹ�");
			break;
		case 6:
			System.out.println("�޸ĳɹ�");
			break;
		default:
			break;
		}
		
		
			
		
	}

}
