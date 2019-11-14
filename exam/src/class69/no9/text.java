package class69.no9;

import java.util.*;

public class text {
    public static void main(String[] args) {
        //
        List<User>users=new ArrayList<User>();

        User user1=new User(1,"lms",123456);
        User user2=new User(2,"wzy",123456);
        users.add(user1);
        users.add(user2);
        //
        Scanner sc=new Scanner(System.in);

        for (int i=1;i>0;i++){
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.根据设备类型查询设备数量");
            System.out.println("4.增加设备信息");
            System.out.println("5.删除指定设备");
            System.out.println("6.根据编号修改设备入库时间");
            System.out.println("0.退出");
            System.out.println("请选择...");
            int choise=sc.nextInt();
            switch (choise){
                case 1:
                    System.out.println("请输入用户名：");
                    String name=sc.next();
                    System.out.println("请输入密码：");
                    int pwd=sc.nextInt();
                    System.out.println("注册成功");
                    i--;
                    break;
                case 2:
                    User user=new User();
                    System.out.println("请输入你的用户名：");
                    name=sc.next();
                    System.out.println("请输入你的密码：");
                    pwd=sc.nextInt();
                    /*if (user.getUserName().equals(name)&&user.getPassword()==pwd){
                        System.out.println("登录成功！");
                    }else {
                        System.out.println("登录失败！");
                    }*/
                    i--;

                    break;

                case 3:
                    i--;
                    break;

                case 4:
                    i--;
                    break;

                case 5:
                    i--;
                    break;
                case 6:
                    i--;
                    break;
                case 0:
                    i=i-2;
                    System.out.println("程序关闭...");
                    break;

                default:
                    i--;
                    System.out.println("请正确输入！");

            }
        }



    }
}
