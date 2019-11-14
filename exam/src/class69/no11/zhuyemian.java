package class69.no11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class zhuyemian {
    public static void main(String[] args) {
        do {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.注册");
        System.out.println("2.登陆");
        System.out.println("3.根据设备类型查询设备数量");
        System.out.println("4.增加设备信息");
        System.out.println("5.删除指定设备");
        System.out.println("6.根据编号修改设备入库时间");
        System.out.println("0.退出");
        System.out.println("请选择");

    int a = sc.nextInt();
    if (a>=0 || a <=6) {
        switch (a) {
            case 1:
                System.out.println("请输入用户名");
                String name = sc.next();
                System.out.println("请输入密码");
                String pws = sc.next();
                System.out.println("注册成功！");
                break;
            case 2:
                System.out.println("请输入用户名");
                String name1 = sc.next();
                System.out.println("请输入密码");
                String pws1 = sc.next();
                System.out.println("登陆成功！");
                break;
            case 3:
                System.out.println("请输入设备类型");
                String sblx=sc.next();
                  zhu zhu=new zhu();
                  zhu.shebei();
                break;
            case 4:
                System.out.println("请输入要增加的设备编号");
                int shebeiid=sc.nextInt();
                System.out.println("请输入要增加设备的名字");
                String shebeimz=sc.next();
                System.out.println("请输入要增加的设备类型");
                String shebeilx=sc.next();
                System.out.println("请输入入库时间");
                String rukusj=sc.next();
                System.out.println("入库成功");
                break;
            case 5:
                System.out.println("请输入要删除的设备编号");
                String shebeibh=sc.next();
                HashMap a1=new HashMap();
                a1.put("1","机械设备");
                a1.put("2","机械设备");
                a1.put("3","机械设备");
                for (Object a11:a1.entrySet()
                     ) {
                    System.out.println(a11);
                }
                //删除
                a1.remove(shebeibh);
                System.out.println("查看");
                for (Object a12:a1.entrySet()
                     ) {
                    System.out.println(a12);
                }
                System.out.println("删除成功");

                break;
            case 6:
                System.out.println("请输入设备编号");
                int bh=sc.nextInt();
                System.out.println("请重新输入入库时间");
                String rksj=sc.next();
                HashMap a2=new HashMap();
                a2.put("1","2011-1-1");
                a2.put(bh,rksj);
                System.out.println("删除成功");
                break;
            case 0:
                return;
        }
    } else {
        System.out.println("请输入0-6之间的数字");
    }
            System.out.println("===============================================================");
}while (true);
    }
}
