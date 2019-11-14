package class69.no2.main;



import class69.no2.user.User;

import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    boolean n=false;
	    List<User> users = new ArrayList<>();
	    User user1 = new User(1, "豆豆", "123456");
	    User user2 = new User(2, "欧欧", "123123");
	    users.add(user1);
	    users.add(user2);

	    HashMap map=new HashMap();
	    map.put(1,"机械设备");
	    map.put(2,"器械设备");
	    do{
	    System.out.println("1.注册");
	    System.out.println("2.登录");
	    System.out.println("3.根据设备类型查询设备数量");
	    System.out.println("4.增加设备信息");
	    System.out.println("5.删除指定设备");
	    System.out.println("6.根据编号修改设备入库时间");
	    System.out.println("0.退出");
	    System.out.println("请选择");
	    int choose=sc.nextInt();
	    switch(choose){
	        case 1:
	            System.out.println("请输入用户名");
	            String name=sc.next();
	            System.out.println("请输入密码");
	            String pwd=sc.next();
	            System.out.println("注册成功！");
	            User user3 = new User(3,name,pwd);
	            users.add(user3);
	            break;
	        case 2:
	            System.out.println("请输入用户名");
	            String name2=sc.next();
	            System.out.println("请输入密码");
	            String pwd2=sc.next();
	            System.out.println("登录成功");
	            break;
	        case 3:
	            System.out.println("请输入设备类型：");
	            String lei = sc.next();
	            boolean contains = map.containsKey(lei);
	            int a=map.size();
	            if (contains) {
	                System.out.println(lei+"的数量为"+a+"台");
	            } else {
	                System.out.println("没有此类设备");
	            }
	            break;
	        case 4:
	            System.out.println("请输入要增加的设备编号");
	            int bian=sc.nextInt();
	            System.out.println("请输入要增加的设备名称");
	            String Sname=sc.next();
	            System.out.println("请输入要增加的设备类型");
	            String Slei=sc.next();
	            System.out.println("请输入入库时间");
	            String  time=sc.next();
	            System.out.println("入库成功！");
	            break;
	        case 5:
	            System.out.println("请输入要删除的设备");
	        case 6:
                break;
            case 0:
                break;
            default:
                return;
        }
       }while(n);
    }
}

	    
	