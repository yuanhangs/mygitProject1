package exam;

import java.io.File;
import java.util.Scanner;

/**
 * @Author HLX
 * @Date 2019/11/14 17:15
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.根据设备类型查询设备数量");
            System.out.println("4.增加设备信息");
            System.out.println("5.删除指定设备");
            System.out.println("6.根据编号修改设备入库时间");
            System.out.println("7.查询设备");
            System.out.println("0.退出");
            System.out.println("请选择");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("请输入用户名：");
                    String username = input.next();
                    System.out.print("请输入密码：");
                    String pass = input.next();
                    User user = new User(username, pass);
                    BaseService.regist(user);
                    break;
                case 2:
                    System.out.print("请输入用户名：");
                    username = input.next();
                    System.out.print("请输入密码：");
                    pass = input.next();
                    BaseService.login(username, pass);
                    break;
                case 7:
                     BaseService.readFile(new File("myequipment.bin"));
                    break;

                default:
                    break;
            }

        } while (true);
    }
}
