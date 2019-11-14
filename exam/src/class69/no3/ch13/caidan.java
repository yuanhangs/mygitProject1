package class69.no3.ch13;

import java.util.Scanner;

public class caidan {

	public static void main(String[] args) {
	System.out.println("1.ע��");	
	System.out.println("2.��¼");	
	System.out.println("3.�����豸���Ͳ�ѯ�豸����");	
	System.out.println("4.�����豸��Ϣ");	
	System.out.println("5.ɾ��ָ���豸");	
	System.out.println("6.���ݱ���޸����ʱ��");	
	System.out.println("0.�˳�");
	Scanner sc=new Scanner(System.in);
	System.out.println("��ѡ��");
	int a=sc.nextInt();	
	switch (a) {
	case 1:
		System.out.println("�������û���");
		String yhm=sc.next();
		System.out.println("����������");
		String mm=sc.next();
		System.out.println("ע��ɹ�");
		break;
case 2:
	System.out.println("�������û���");
	String yhm1=sc.next();
	System.out.println("����������");
	String mm1=sc.next();
	System.out.println("��¼�ɹ�");
		break;
case 3:
	System.out.println("�������豸����");
	String sblx=sc.next();
	
	break;
case 4:
	System.out.println("������Ҫ���ӵ��豸���");
	String sbbh=sc.next();
	System.out.println("������Ҫ��������");
	String mc=sc.next();
	System.out.println("�������豸����");
	String lx=sc.next();
	break;
case 5:
	System.out.println("������Ҫɾ�����豸���");
	String sc1=sc.next();
	break;
case 6:
	System.out.println("����������豸���");
	String rku=sc.next();
	System.out.println("����������豸ʱ��");
	String sj=sc.next();
	break;
case 0:
	System.out.println("�˳��ɹ�");
	
	break;
	default:
		System.out.println("�����������������");
		break;
	}
	}

}
