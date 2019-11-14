package class69.no4.Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("1.注册");
        System.out.println("2.登陆");
        System.out.println("3.根据设备类型查询设备数量");
        System.out.println("4.增加设备信息");
        System.out.println("5.删除指定设备");
        System.out.println("6.删除编号修改入库时间");
        System.out.println("0.退出");
        System.out.println("=========================");
        System.out.println("请选择");
        int xuanz=sc.nextInt();
       if(xuanz>=0 && xuanz<7){
           switch (xuanz){
               case 1:
                   System.out.println("1.注册,请填写以下信息");
                   System.out.println("请输入用户名：");
                   //user yh=new user();
                   //yh.getName();
                   String yhm=sc.next();
                   System.out.println("请输入密码");
                   int mima=sc.nextInt();
                   System.out.println("注册成功！");
                   break;
               case 2:
                   System.out.println("2.登陆");
                   System.out.println("请输入用户名：");
                   String yhm2=sc.next();
                   System.out.println("请输入密码");
                   int mima2=sc.nextInt();
                   System.out.println("登陆成功！");
                   break;
               case 3:
                   System.out.println("3.根据设备类型查询设备数量");
                   System.out.println("请输入设备编号");
                   int sbianhao=sc.nextInt();
                   System.out.println("chaxun");
                   break;
               case 4:
                   System.out.println("4.增加设备信息");
                   break;
               case 5:
                   System.out.println("5.删除指定设备");
                   System.out.println("请输入要删除的设备编号");
                   int bianhao=sc.nextInt();
                   System.out.println("确认删除？（1.yes）（2.no）");
                   int shanchu=sc.nextInt();
                   break;
               case 6:
                   System.out.println("6.删除编号修改入库时间");
                   break;
               case 0:
                   System.out.println("退出");
                   break;
           }
       }else if(xuanz>=7){
           System.out.println("错误，请您输入以上选择");
       }
    }
}
