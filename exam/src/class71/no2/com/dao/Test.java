package class71.no2.com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<User> users = new ArrayList<User>();

		User user1 = new User(1, "妲己", "1169");
		User user2 = new User(2, "李白哥哥", "1456");

		users.add(user1);
		users.add(user2);
		Map shebei = new HashMap<String, SheBei>();

		SheBei shebei1 = new SheBei(1, "123", "123", "1999-11-21");
		SheBei shebei2 = new SheBei(1, "234", "234", "1999-1-11");
		shebei.put("1", shebei1);
		shebei.put("2", shebei2);
		List<SheBei> sheb = new ArrayList<SheBei>();
		sheb.add(shebei1);
		sheb.add(shebei2);

		boolean bool = true;
		while (bool) {

			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.根据设备类型查询设备数量");
			System.out.println("4.增加设备信息");
			System.out.println("5.删除指定设备");
			System.out.println("6.根据编号修改入库时间");
			System.out.println("0.推出");
			System.out.println("请选择");
			int a = input.nextInt();
			if (a == 1) {
				System.out.println("请输入用户名:");
				String name = input.next();
				System.out.println("请输入密码");
				String pwd = input.next();
				User user3 = new User(3, name, pwd);
				System.out.println("注册成功");
			} else if (a == 2) {
				System.out.println("请输入用户名");
				String name = input.next();
				System.out.println("请输入密码");
				String pwd = input.next();
				for (User yonghu : users) {
					if (User.getname.equals(name)
							&& User.getpassword.equals(pwd)) {
						System.out.println("登陆成功");

					}
				}

			} else if (a == 3) {
				System.out.println("请输入设备类型");
				String leix = input.next();
				if (leix.equals("机械设备")) {

					for (SheBei sb : sheb) {
						System.out.println("设备编号" + sb.getSid() + "设备名称"
								+ sb.getSname() + "设备类型" + sb.getSlx());
					}
				} else {
					System.out.println("没有这个设备");
				}

			} else if (a == 4) {
				System.out.println("请输入要增加的设备编号:");
				int bh = input.nextInt();
				System.out.println("请输入要增加的设备名称:");
				String nm = input.next();
				System.out.println("请输入要增加的设备类型:");
				String lx = input.next();
				System.out.println("请输入入库时间:");
				String sj = input.next();
				SheBei shebei3 = new SheBei(bh, nm, lx, sj);
				System.out.println("入库成功");

			} else if (a == 5) {
				System.out.println("请输入您要删除的设备编号");
				int bh = input.nextInt();
				for (SheBei sb : sheb) {
					if (sb.getSid() == bh) {
						users.remove(sb);
						System.out.println("删除成功");
					}
				}

			} else if (a == 6) {
				System.out.println("请输入设备编号");
				int bh = input.nextInt();
				System.out.println("请重新输入入库时间");
				String sj = input.next();
				for (SheBei sb : sheb) {
					if (sb.getSid() == bh) {
						sb.setSrq(sj);

					}
				}
			} else if (a == 0) {
				System.out.println("感谢使用");
				bool = false;

			} else {
				System.out.println("错误");
			}

		}

	}

}
