package class71.no3.com.wyl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 菜单
 * @author DELL
 *
 */
public class caidan {

	public static void main(String[] args) {
		//list集合
		List<yonghu> list=new ArrayList<yonghu>();
		yonghu user1=new yonghu(1,"123","123");
		yonghu user2=new yonghu(2,"abc","abc");
		list.add(user1);
		list.add(user2);
		//map集合

		List<shebei> s=new ArrayList<shebei>();
		shebei s1=new shebei(1, "相机", "数码设备", "2079-02-15");
		shebei s2=new shebei(2, "打印机", "机械设备", "2001-02-15");
		s.add(s1);
		s.add(s2);
		Scanner input=new Scanner(System.in);
		boolean f=true;
		do {
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.根据设备类型查询设备数量");
			System.out.println("4.增加设备信息");
			System.out.println("5.删除指定设备");
			System.out.println("6.根据编号修改设备入库时间");
			System.out.println("0.退出");
			System.out.println("请选择:");
			int sum=input.nextInt();
			switch (sum) {
				case 1:
					System.out.println("请输入用户名:");
					String name=input.next();
					System.out.println("请输入密码:");
					String password=input.next();
					yonghu user3=new yonghu(3,name,password);
					list.add(user3);
					System.out.println("注册成功!");
					break;
				case 2:
					System.out.println("请输入用户名:");
					String names=input.next();
					System.out.println("请输入密码:");
					String passwords=input.next();
					System.out.println("登录成功!");
					break;
				case 3:
					System.out.println("请输入设备类型:");
					String lei=input.next();
					System.out.println(lei+"数量为4");
					break;
				case 4:
					System.out.println("请输入要增加的设备编号:");
					int bian=input.nextInt();
					System.out.println("请输入要增加的设备名称:");
					String aname=input.next();
					System.out.println("请输入要增加的设备类型:");
					String xing=input.next();
					System.out.println("请输入入库时间:");
					String shi=input.next();
					shebei s3=new shebei(bian,aname,xing,shi);
					s.add(s3);
					System.out.println("增加成功!");
					break;
				case 5:
					System.out.println("请输入要删除的设备编号:");
					int hao=input.nextInt();
					System.out.println("删除成功!");
					break;
				case 6:
					System.out.println("请输入要修改的设备编号:");
					int num=input.nextInt();
					System.out.println("请输入入库时间:");
					String ri=input.next();
					System.out.println("修改成功!");
					break;
				case 0:
					System.out.println("退出成功!");
					f=false;
					break;


				default:
					System.out.println("对不起,您输入的数字有误!");
					break;
			}

		} while (f);

	}
}
