package class71.no4.com.index;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.omg.CORBA.portable.Delegate;

import com.entity.Tool;
import com.entity.User;
import com.service.Delete;
import com.service.Login;
import com.service.Register;
import com.service.selectById;

public class index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ɨ����
		Scanner input = new Scanner(System.in);
		
		//���������û��ļ���
		List users = new ArrayList();
		users.add(new User(1000,"sasa","sasa"));
		users.add(new User(1001,"aa","aa"));
		
		//���������豸�ļ���
		Map tools = new HashMap();
		tools.put(99, new Tool(99,"�ھ��","���̳�","2019-01-01"));
		tools.put(100, new Tool(100,"�򶴻�","���̳�","2019-02-01"));
		
		
		//Ĭ�������û�id
		int defaultId = 0;
		//Ĭ�Ϲ���id
		int defaultToolId = 0;
		boolean flag = true;
		while (flag) {
			//��ҳ
			System.out.println("1.ע��");
			System.out.println("2.��¼");
			System.out.println("3.�����豸���Ͳ�ѯ�豸����");
			System.out.println("4.�����豸��Ϣ");
			System.out.println("5.ɾ��ָ���豸");
			System.out.println("6.���ݱ���޸����ʱ��");
			System.out.println("0.�˳�");
			System.out.println("��ѡ��:");
			int shuru = input.nextInt();
			switch (shuru) {
			case 1:
				//ע�᷽��
				System.out.println("��ӭ����ע�����");
				
				//��user������ӽ��뼯��
				users.add(new Register().register(defaultId));
				
				//��Ĭ��id����
				defaultId++;
				
				break;
			case 2:
				//��¼ҳ��
				System.out.println("��ӭ������¼ҳ��");
				
				Login login = new Login();
				login.login(users);
				
				break;
			case 3:
				//��ѯ
				
				selectById select = new selectById();
				select.select(tools);
				break;
			case 4:
				
				break;
			case 5:
				//ɾ��
				System.out.println("����ɾ��ҳ��");
				
				Delete delete = new Delete();
				delete.delete(tools);
				
				break;
			case 6:
				//�޸�
				
				
				break;
			case 0:
				System.out.println("�����˳�!");
				flag = false;
				break;

			default:
				break;
			}
		}
		
	}

}
