package exam;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author HLX
 * @Date 2019/11/14 17:15
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----------菜单--------------");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.根据设备类型查询设备数量");
            System.out.println("4.增加设备信息");
            System.out.println("5.删除指定设备");
            System.out.println("6.根据编号修改设备入库时间");
            System.out.println("7.查询设备");
            System.out.println("0.退出");
            System.out.println("---------------------------");
            System.out.print("请选择");
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
                    continue;
                case 2:
                    System.out.print("请输入用户名：");
                    username = input.next();
                    System.out.print("请输入密码：");
                    pass = input.next();
                    boolean flag = BaseService.login(username, pass);
                    String str = (flag) ? ("登录成功!") : ("登录失败");
                    System.out.println(str);
                    continue;
                case 3:
                    System.out.print("请输入输入设备类型：");
                    username = input.next();
                    int count = BaseService.findType(username);
                    System.out.println(username + count + "台");
                    continue;
                case 4:
                    System.out.print("请输入设备ID：");
                    int id = input.nextInt();
                    //判断是否有这个编号，才可以添加的
                    if (!BaseService.findId(id)) {
                        System.out.print("请输入设备名称：");
                        String name = input.next();
                        System.out.print("请输入设备类型：");
                        String type = input.next();
                        System.out.print("请输入入库日期：");
                        String dd = input.next();
                        try {
                            //将字符串转换成日期类型
                            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
                            //封装对象
                            Equipment eq = new Equipment(id, name, type, date);
                            //调用方法
                            BaseService.add(eq, new File("myequipment.bin"));

                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("设备编号已经存在!" + id);
                    }
                    continue;
                case 5:
                    System.out.print("请输入设备ID：");
                    id = input.nextInt();
                    BaseService.del(id, new File("myequipment.bin"));
                    continue;
                case 6:
                    System.out.print("请输入设备ID：");
                    id = input.nextInt();
                    //判断是否有这个编号，才可以修改的
                    if (BaseService.findId(id)) {
                        System.out.print("请输入入库日期：");
                        String dd = input.next();
                        try {
                            //将字符串转换成日期类型
                            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
                            //封装对象
                            Equipment eq = new Equipment(id, date);
                            //调用方法
                            BaseService.update(eq, new File("myequipment.bin"));

                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("没有此设置=>" + id);
                    }
                    continue;
                case 7:
                    BaseService.readFile(new File("myequipment.bin"));
                    continue;
                default:  //这个还是必须有的！
                    break;
            }

            if (choose == 0) {
                System.out.println("谢谢光临!");
                break;
            }

        } while (true);
    }
}
