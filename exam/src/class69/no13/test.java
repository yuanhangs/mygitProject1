package class69.no13;


import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
        System.out.println("2登录");
        System.out.println("3根据设别类型查询设备数量");
        System.out.println("删除指定设备");
        System.out.println("4根据编号修改设备入库时间");
        System.out.println("5退出");
        System.out.println("6 请选择");
        int xz = sc.nextInt();
        while (true) {
            switch (xz) {
                case 1:
                    System.out.println("请输入用户名");
                    String name = sc.next();
                    System.out.println("请输入密码");
                    int mm = sc.nextInt();

                    if (name == "张三" && mm == 123456) {
                        System.out.println("注册成功");
                    } else {
                        System.out.println("则祖册失败");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("请输入设备类型");
                    String shebie=sc.next();
                    if(shebie.equals("猪")||shebie.equals("1")||shebie.equals("羊")||shebie.equals("2")){

                        System.out.println("猪的设备为5台");
                    }else if(shebie.equals("猪设备")||shebie.equals("猪")||shebie.equals("械")||shebie.equals("器械")){

                        System.out.println("器械设备为4台");
                    }else{
                        System.out.println("请输入正确的设备类型");
                    }
                    break;

                case 4:
                    System.out.println("请输入要增加的设备编号");
                    int sbbh=sc.nextInt();
                    System.out.println("请输入要增加的设备名称");
                    String sbmc=sc.next();
                    System.out.println("请输入要增加的设备类型");
                    String sblx=sc.next();
                    System.out.println("请输入入库时间");
                    String rksj=sc.next();
                    System.out.println("入库成功");

                    break;
                case 5:
                    break;

                case 6:
                    System.out.println("请输入正确的数字");
                    break;

            }

            }
            }
        }
    }
//}
