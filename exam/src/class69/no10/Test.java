package class69.no10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List <User> users =new ArrayList();
		User user1=new User(1,"Li","123");
		User user2=new User(2,"Hi","1234");
		users.add(user1);
        users.add(user2);
        SheBei she1=new SheBei(1,"�����","��е�豸","2011-07-10"); 
        SheBei she2=new SheBei(2,"�ھ��","��е�豸","2015-08-21"); 
        Map map=new HashMap();
        map.put(1, she1);
        map.put(2, she2);
        int a;
//        do {
//        	System.out.println("1.ע��"+"\n2.��¼"+"\n3.�����豸���Ͳ�ѯ�豸����"+"\n4.�����豸��Ϣ"+"\n5.ɾ��ָ���豸"+"\n6.���ݱ���޸��豸���ʱ��"+"\n0.�˳�"+"\n��ѡ��");
//            a=sc.nextInt();
//            switch (a) {
//    		case 1:
//    			System.out.println("�������û���");
//    			String name1=sc.next();
//    			System.out.println("����������");
//    			String password1=sc.next();
//    			System.out.println("ע��ɹ�!");
//    			continue;
//    		case 2:
//    			System.out.println("�������û���");
//    			String name2=sc.next();
//    			System.out.println("����������");
//    			String password2=sc.next();
//    			System.out.println("��½�ɹ�!");
//    			continue;
//    		case 3:
//    			System.out.println("�������豸����(��е�豸):");
//    			String lei=sc.next();
//    			for (Map.Entry<String, Object> entity: map.entrySet()) {
//    				if(entity.getKey().indexOf(lei)>-1){
//        				System.out.println(lei+"����Ϊ4̨");
//        			}
//				}
//
//    			continue;
//    		case 4:
//    			System.out.println("������Ҫ���ӵ��豸���");
//    			int b=sc.nextInt();
//    			System.out.println("������Ҫ���ӵ��豸����");
//    			String she=sc.next();
//    			System.out.println("������Ҫ���ӵ��豸����");
//    			String lei2=sc.next();
//    			System.out.println("���������ʱ��");
//    			String day=sc.next();
//    			System.out.println("���ɹ���");
//    			continue;
//    		default:
//    			break;
//    		}
//		} while (a==0);
        
		
		
	}
}
