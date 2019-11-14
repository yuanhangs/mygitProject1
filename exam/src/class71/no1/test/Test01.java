package class71.no1.test;




import class71.no1.entity.SheBei;
import class71.no1.entity.User;

import java.security.Key;
import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        //创建集合
        List<User> list=new ArrayList<User>();
        Map<Integer, SheBei> map=new HashMap<Integer, SheBei>();
        //存储数据
        list.add(new User(1,"甲","123"));
        list.add(new User(2,"乙","1234"));

        map.put(1,new SheBei(1,"机械1号","机械","2019-11-11"));
        map.put(2,new SheBei(2,"器械2号","器械","2019-10-11"));

        //创建菜单
        int choose=-1;
        while (choose!=0){

            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.根据设备类型查询设备数量");
            System.out.println("4.增加设备信息");
            System.out.println("5.删除指定设备");
            System.out.println("6.根据编号修改设备入库时间");
            System.out.println("0.退出");
            System.out.println("请选择");
            Scanner input=new Scanner(System.in);
            choose=input.nextInt();
            //判断
            switch (choose){
                case 1:
                    //创建用户实例存储数据
                    User user=new User();
                    System.out.println("请输入用户名：");
                    String username=input.next();
                    user.setUserName(username);
                    System.out.println("请输入密码：");
                    String pwd=input.next();
                    user.setPassword(pwd);
                    list.add(user);
                    System.out.println("注册成功");
                    break;
                case 2:
                    //定义一个布尔值
                    boolean f=false;
                    System.out.println("请输入用户名：");
                    String Dusername=input.next();
                    System.out.println("请输入密码：");
                    String Dpwd=input.next();
                    for (User user1: list) {
                        if (user1.getUserName().equals(Dusername)&&
                        user1.getPassword().equals(Dpwd)){
                            f=true;
                            break;
                        }
                    }
                    if(f){
                        System.out.println("登录成功");
                    }else{
                        System.out.println("用户名或密码错误");
                    }
                    break;
                case 3:
                    System.out.println("请输入设备类型：");
                    String Stype=input.next();
                    //计数
                    //int count=0;
                    int qcount=0;
                    int jcount=0;
                    Set set = map.keySet();
                    Iterator it=set.iterator();
                    while (it.hasNext()){
                        int key=(int)it.next();//获取key
                        SheBei sheBei=(SheBei)map.get(key);//通过key获取value
                        if(((Stype.indexOf('器')!=-1||Stype.indexOf('械')!=-1)&&sheBei.getsType().indexOf('器')!=-1)){
                            qcount++;
                        }
                        if(((Stype.indexOf('机')!=-1||Stype.indexOf('械')!=-1)&&sheBei.getsType().indexOf('机')!=-1)){
                            jcount++;
                        }


                    }
                    if(qcount>0&&jcount>0){
                        System.out.println("器械的数量"+qcount+"\t"+"机械的数量"+jcount);
                    } else if (qcount>0){
                        System.out.println("器械的数量"+qcount);
                    } else if (jcount>0){
                        System.out.println("机械的数量"+jcount);
                    }
                    //System.out.println(Stype+"设备数量为："+count);
                        break;
                case 4:
                    System.out.println("请输入要增加的设备编号：");
                    int Sid=input.nextInt();
                    System.out.println("请输入要增加的设备名称：");
                    String sname=input.next();
                    System.out.println("请输入要增加的设备类型：");
                    String stype=input.next();
                    System.out.println("请输入入库时间：");
                    String stime=input.next();
                    //创建设备对象存储数据
                    SheBei sheBei=new SheBei(Sid,sname,stype,stime);
                   map.put(Sid,sheBei);
                    System.out.println("入库成功");
                    break;
                case 5:
                    System.out.println("请选择要删除的设备编号");
                    int del=input.nextInt();
                    map.remove(del);
                    System.out.println("删除成功");
                    break;
                case 6:

                    System.out.println("请输入设备编号：");
                    int num=input.nextInt();
                    System.out.println("请重新输入入库时间：");
                    String time=input.next();
                    Set set1=map.keySet();
                    Iterator it1=set1.iterator();
                    while (it1.hasNext()){
                        int key=(int)it1.next();//获取key
                        SheBei sheBei1=(SheBei)map.get(key);//通过key获取value
                        sheBei1.setsDate(time);//通过value设置时间

                    }
                    System.out.println("修改成功");
                    break;
                case 0:
                    System.out.println("退出成功");
                    break;


            }
        }


    }
}
