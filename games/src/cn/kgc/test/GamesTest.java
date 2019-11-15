package cn.kgc.test;

import cn.kgc.dao.BaseDao;
import cn.kgc.entity.Hero;
import cn.kgc.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GamesTest {

    public static void main(String[] args) throws SQLException, InterruptedException {
        //获取系统输入流对象
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("***************************************************************");
            System.out.println("**********************-王者荣耀管理平台-***********************");
            System.out.println("***************************************************************");
            System.out.println("1.登录游戏平台");
            System.out.println("2.注册新用户");
            System.out.println("3.退出平台");
            System.out.println("请选择您要操作的功能:");
            int menu1 = scanner.nextInt();
            if(menu1>=1 && menu1<=3){
                if(menu1==1){
                    while(true){
                        System.out.println("请输入游戏账号:");
                        String userLoginName = scanner.next();
                        System.out.println("请输入游戏账号密码:");
                        String userPassword = scanner.next();
                        //定义登录sql语句
                        String sql = "select * from user where userLoginName = ? and userPassword = ?";
                        //创建list集合 将登录用户信息存储到list集合中
                        List list = new ArrayList();
                        list.add(userLoginName);
                        list.add(userPassword);
                        //调用查询方法
                        ResultSet rs = BaseDao.getQuery(sql,list);
                        //判断查询结果集中是否有查询数据 如果有表示登录成功 否则登录失败
                        if(rs.next()){
                            //将登录成功的用户信息存储到User对象中
                            User user = new User();
                            user.setId(rs.getInt("id"));
                            user.setUserName(rs.getString("userName"));
                            user.setUserPassword(rs.getString("userPassword"));
                            user.setUserLoginName(rs.getString("userLoginName"));
                            System.out.println("****************************欢迎----"+rs.getString("userName")+"----进入王者农药游戏平台******************************");
                            while(true){
                                System.out.println("1.创建英雄角色");
                                System.out.println("2.查询我的英雄角色");
                                System.out.println("3.进入PK平台");
                                System.out.println("4.个人信息操作");
                                System.out.println("5.返回上级菜单");
                                System.out.println("请输入您要操作的功能序号:");
                                int menu2 = scanner.nextInt();
                                //判断录入的功能序号是否合法 如果不合法重新录入
                                if(menu2>=1 && menu2<=5){
                                     if(menu2==1){
                                         System.out.println("1.请输入英雄角色名称:");
                                         String heroName = scanner.next();
                                         System.out.println("2.选择英雄的角色属性:");
                                         //英雄的角色
                                         String heroRole = "";
                                         //创建一个List集合存储到英雄的信息
                                         List list1 = new ArrayList();
                                         //英雄的生命值
                                         float vitality = 0;
                                         //英雄的战力值
                                         float powerValue = 0;
                                         //英雄的法值
                                         float mana = 0;
                                         //输入英雄其他信息 并存储到list1集合对象中
                                         while(true){
                                             System.out.println("1.法师");
                                             System.out.println("2.坦克");
                                             System.out.println("3.刺客");
                                             System.out.println("4.辅助");
                                             System.out.println("5.战士");
                                             System.out.println("输入英雄角色序号:");
                                             int menu3 = scanner.nextInt();
                                             if(menu3>=1 && menu3<=5){
                                                 if(menu3==1){
                                                     heroRole = "法师";
                                                     vitality = 500;
                                                     powerValue = 100;
                                                     mana = 400;
                                                     list1.add(heroName);
                                                     list1.add(heroRole);
                                                     list1.add(vitality);
                                                     list1.add(powerValue);
                                                     list1.add(mana);
                                                     break;
                                                 }else if(menu3==2){
                                                     heroRole = "坦克";
                                                     vitality = 1000;
                                                     powerValue = 200;
                                                     mana = 100;
                                                     list1.add(heroName);
                                                     list1.add(heroRole);
                                                     list1.add(vitality);
                                                     list1.add(powerValue);
                                                     list1.add(mana);
                                                     break;
                                                 }else if(menu3==3){
                                                     heroRole = "刺客";
                                                     vitality = 700;
                                                     powerValue = 300;
                                                     mana = 100;
                                                     list1.add(heroName);
                                                     list1.add(heroRole);
                                                     list1.add(vitality);
                                                     list1.add(powerValue);
                                                     list1.add(mana);
                                                     break;
                                                 }else if(menu3==4){
                                                     heroRole = "辅助";
                                                     vitality = 1500;
                                                     powerValue = 100;
                                                     mana = 100;
                                                     list1.add(heroName);
                                                     list1.add(heroRole);
                                                     list1.add(vitality);
                                                     list1.add(powerValue);
                                                     list1.add(mana);
                                                     break;
                                                 }else if(menu3==5){
                                                     heroRole = "战士";
                                                     vitality = 1000;
                                                     powerValue = 200;
                                                     mana = 110;
                                                     list1.add(heroName);
                                                     list1.add(heroRole);
                                                     list1.add(vitality);
                                                     list1.add(powerValue);
                                                     list1.add(mana);
                                                     break;
                                                 }
                                             }else{
                                                 System.out.println("您选择的角色有误!请重新选择！");
                                             }
                                         }
                                         //将集合中的英雄的数据写入数据库中 注意一定要和list1集合中的数据一一对应
                                         String sql1 = "insert into hero (heroName,heroRole,vitality,powerValue,mana,userId)values(?,?,?,?,?,?)";
                                         //将拥有者的用户的id存储到集合中
                                         list1.add(user.getId());
                                         int i = BaseDao.getUpdate(sql1,list1);
                                         if(i>0){
                                             System.out.println("您的英雄创建成功！去试试吧！");
                                         }else{
                                             System.out.println("您的英雄创建失败！");
                                         }
                                     }else if(menu2==2){
                                         /**
                                          * 查询我拥有的英雄的信息
                                          */
                                         String sql2 = "select * from hero where userId = ?";
                                         List list2 = new ArrayList();
                                         list2.add(user.getId());
                                         ResultSet rs1 = BaseDao.getQuery(sql2,list2);
                                         if(rs1!=null){
                                             System.out.println("英雄:\t角色\t战力值\t生命值\t法术值\t");
                                             while(rs1.next()){
                                                 System.out.print(rs1.getString("heroName")+"\t");
                                                 System.out.print(rs1.getString("heroRole")+"\t");
                                                 System.out.print(rs1.getString("powerValue")+"\t\t");
                                                 System.out.print(rs1.getString("vitality")+"\t\t");
                                                 System.out.print(rs1.getString("mana"));
                                                 System.out.println();
                                             }
                                         }else{
                                             System.out.println("您还没有拥有英雄！快去创建属于你的英雄吧！");
                                         }
                                     }else if(menu2==3){
                                         //进入PK台
                                         /**
                                          * PK思路:
                                          *   1.确保当前登录账号是已经拥有英雄，如果没有则无法进入PK平台
                                          *   2.确保除了自己英雄还有其他玩家的英雄 否则找不到对手
                                          *   3.选择当前用户要出战的英雄
                                          *   4.选择要进行PK的对方的英雄
                                          *   5.如果满足以上条件则进行PK操作
                                          *      用户: 手动选择
                                          *         1.普通攻击  物理攻击1次
                                          *         2.放大招    物理攻击+法伤
                                          *      对方: 定义一个随机数 1或2
                                          *         1.普通攻击  物理攻击1次
                                          *         2.放大招    物理攻击+法伤
                                          *
                                          */
                                         //1.查询自己是否已经拥有英雄 有才能出战
                                         String s1 = "select * from hero where userId = ?";
                                         List l1 = new ArrayList();
                                         l1.add(user.getId());
                                         ResultSet r1 = BaseDao.getQuery(s1,l1);
                                        //2.查询是否有PK的英雄信息
                                         String s2 = "select * from hero where userId != ?";
                                         List l2 = new ArrayList();
                                         l2.add(user.getId());
                                         ResultSet r2 = BaseDao.getQuery(s2,l2);
                                         //判断当前登录用户是否拥有英雄
                                         if(r1!=null && r1.next()){
                                             r1.beforeFirst();
                                             //判断是否有PK的对手英雄
                                             if(r2!=null && r2.next()){
                                                 r2.beforeFirst();
                                                 //挑选要进行PK的用户的英雄
                                                 System.out.println("----------------我已有的英雄！----------------");
                                                 System.out.println("英雄ID\t英雄:\t角色\t战力值\t生命值\t法术值\t");
                                                 while(r1.next()){
                                                     System.out.print(r1.getInt("id")+"\t\t");
                                                     System.out.print(r1.getString("heroName")+"\t");
                                                     System.out.print(r1.getString("heroRole")+"\t");
                                                     System.out.print(r1.getString("powerValue")+"\t\t");
                                                     System.out.print(r1.getString("vitality")+"\t\t");
                                                     System.out.print(r1.getString("mana"));
                                                     System.out.println();
                                                 }
                                                 System.out.println("--请选择您要出战的英雄ID:");
                                                 //原则上这里需要对录入的英雄的id进行验证 这里默认都是输入正确的
                                                 int heroId1 = scanner.nextInt();
                                                 String s11 = "select * from hero where id = "+heroId1;
                                                 ResultSet r11 = BaseDao.getQuery(s11,null);
                                                 Hero myHero1 = new Hero();
                                                 //获取自己所选择的英雄
                                                 if (r11!=null && r11.next()){
                                                     myHero1.setId(heroId1);
                                                     myHero1.setPowerValue(r11.getFloat("powerValue"));
                                                     myHero1.setMana(r11.getFloat("mana"));
                                                     myHero1.setVitality(r11.getFloat("vitality"));
                                                     myHero1.setHeroName(r11.getString("heroName"));
                                                     myHero1.setHeroRole(r11.getString("heroRole"));
                                                     System.out.println("---我方选择了出战英雄:"+myHero1.getHeroName());
                                                 }
                                                 System.out.println("----------------PK台上的玩家英雄！----------------");
                                                 System.out.println("英雄ID\t英雄:\t角色\t战力值\t生命值\t法术值\t");
                                                 while(r2.next()){
                                                     System.out.print(r2.getInt("id")+"\t\t");
                                                     System.out.print(r2.getString("heroName")+"\t");
                                                     System.out.print(r2.getString("heroRole")+"\t");
                                                     System.out.print(r2.getString("powerValue")+"\t\t");
                                                     System.out.print(r2.getString("vitality")+"\t\t");
                                                     System.out.print(r2.getString("mana"));
                                                     System.out.println();
                                                 }
                                                 System.out.println("请选择要进行PK的英雄ID:");
                                                 //原则上这里需要对录入的英雄的id进行验证 这里默认都是输入正确的
                                                 int heroId2 = scanner.nextInt();
                                                 String s22 = "select * from hero where id = "+heroId2;
                                                 ResultSet r22 = BaseDao.getQuery(s22,null);
                                                 Hero myHero2 = new Hero();
                                                 //获取PK台上对手的英雄
                                                 if (r22!=null && r22.next()){
                                                     myHero2.setId(heroId2);
                                                     myHero2.setPowerValue(r22.getFloat("powerValue"));
                                                     myHero2.setMana(r22.getFloat("mana"));
                                                     myHero2.setVitality(r22.getFloat("vitality"));
                                                     myHero2.setHeroName(r22.getString("heroName"));
                                                     myHero2.setHeroRole(r22.getString("heroRole"));
                                                     System.out.println("选择了对方的英雄:"+myHero2.getHeroName());
                                                 }


                                                 /**
                                                  * 进行PK操作
                                                  *
                                                  **/
                                                 while(true){
                                                     //定义一个变量 表示自己的容量池
                                                     float myAbility = 0;
                                                     float otherAbility = 0;
                                                     System.out.println("-------1.普通攻击-------");
                                                     System.out.println("-------2.大招-------");
                                                     System.out.println("-------我要动手了:");
                                                     int n1 = scanner.nextInt();
                                                     if(n1>=1 && n1<=2){
                                                         if(n1==1){
                                                             //普通攻击
                                                            myAbility = myHero1.getPowerValue();
                                                             System.out.println("我使用了普通攻击！.............................");

                                                         }else if(n1==2){
                                                             //普通+法攻
                                                            myAbility = myHero1.getPowerValue()+myHero1.getMana();
                                                             System.out.println("我使用了大招攻击！.............................");
                                                         }
                                                         Thread.sleep(2000);
                                                         //对对方英雄进行造成伤害
                                                         myHero2.setVitality(myHero2.getVitality()-myAbility);
                                                         System.out.println("您对对方英雄造成点"+myAbility+"伤害！");
                                                         if(myHero2.getVitality()>0.0){
                                                             System.out.println("对方还剩"+myHero2.getVitality()+"点生命！");
                                                              //对方要出招了
                                                             //定义一个随机数
                                                             Random r = new Random();
                                                             int n2 = r.nextInt(2)+1;
                                                             Thread.sleep(2000);
                                                             if(n2==1){
                                                                 //普通攻击
                                                                 otherAbility = myHero2.getPowerValue();
                                                                 System.out.println("对方正在使用了普通攻击！.....");
                                                             }else if(n2==2){
                                                                 //普通+法攻
                                                                 otherAbility = myHero2.getPowerValue()+myHero2.getMana();
                                                                 System.out.println("对方正在使用了大招攻击！......");
                                                             }
                                                             Thread.sleep(2000);
                                                             //对对方英雄进行造成伤害
                                                             myHero1.setVitality(myHero1.getVitality()-otherAbility);
                                                             System.out.println("对方对您的英雄造成点"+otherAbility+"点伤害！");
                                                             if(myHero1.getVitality()<=0.0){
                                                                 System.out.println("我方"+myHero1.getHeroName()+"被对方的"+myHero2.getHeroName()+"干掉了！PK结束！");
                                                                 break;
                                                             }else{
                                                                 System.out.println("我方英雄还剩"+myHero1.getVitality()+"点生命！");
                                                             }
                                                         }else{
                                                             System.out.println("你已经把对方的"+myHero2.getHeroName()+"干掉了！PK结束");
                                                             System.out.println("----------------------系统正在打扫战场！请稍后----------------------");
                                                             Thread.sleep(2000);
                                                             break;
                                                         }
                                                     }else{
                                                         System.out.println("您还没有修改该技能！");
                                                     }
                                                 }


                                             }else{
                                                 System.out.println("抱歉！PK台上只有您一人！无法建立PK平台！");
                                             }
                                         }else{
                                             System.out.println("请先拥有自己的英雄！");
                                         }

                                     }else if(menu2==4){
                                         while(true){
                                             System.out.println("1.查询个人信息");
                                             System.out.println("2.修改我的密码");
                                             System.out.println("3.返回上级菜单");
                                             System.out.println("请输入功能序号:");
                                             int menu3 = scanner.nextInt();
                                             if(menu3==1){
                                                 System.out.println("---用户Id:"+user.getId());
                                                 System.out.println("---用户姓名:"+user.getUserName());
                                                 System.out.println("---用户账号:"+user.getUserLoginName());
                                                 System.out.println("---用户密码:"+user.getUserPassword());
                                             }else if(menu3==2){
                                                 System.out.println("---请输入新密码:");
                                                 String newPassword = scanner.next();
                                                 System.out.println("---请再次确认输入的密码:");
                                                 String newPasswords = scanner.next();
                                                 if(newPassword.equals(newPasswords)){
                                                     List list3 = new ArrayList();
                                                     list3.add(newPassword);
                                                     list3.add(user.getId());
                                                     String sql3 = "update user set userPassword = ? where id = ?";
                                                     int i = BaseDao.getUpdate(sql3,list3);
                                                     if(i>0){
                                                         user.setUserPassword(newPassword);
                                                         System.out.println("密码修改成功！");
                                                     }else{
                                                         System.out.println("密码修改失败！");
                                                     }
                                                 }else{
                                                     System.out.println("您两次输入的密码不一致！");
                                                 }
                                             }else if(menu3==3){
                                                 break;
                                             }else{
                                                 System.out.println("您输入的功能序号不存在！请重新输入！");
                                             }
                                         }
                                     }else if(menu2==5){
                                         break;
                                     }
                                }else{
                                    System.out.println("您操作的功能序号不存在！请重新输入功能序号！");
                                }
                            }
                        }else{
                            System.out.println("您输入的账号或密码有误！请重新登录！");
                        }

                    }
                }else if(menu1==2){
                    List list = new ArrayList();

                    System.out.println("请输入您的真实姓名:");
                    list.add(scanner.next());
                    //验证该用户是否已经注册过
                    String sql1 = "select * from user where userName = ?";
                    ResultSet rs1 = BaseDao.getQuery(sql1,list);

                    if(rs1!=null && !rs1.next()){
                        System.out.println("请输入您的账号名:");
                        list.add(scanner.next());
                        System.out.println("请输入您的Login密码:");
                        list.add(scanner.next());
                        System.out.println("请输入您的身份证号:");
                        list.add(scanner.next());
                        String sql = "insert into user (userName,userLoginName,userPassword,userId)values(?,?,?,?)";
                        int i = BaseDao.getUpdate(sql,list);
                        if(i>0){
                            System.out.println("欢迎您注册成功！");
                        }else{
                            System.out.println("注册失败！请联系客服！电话 4007114006");
                        }
                    }else{
                        System.out.println("您已经注册过该用户平台！请Login去吧！");
                    }


                }else if(menu1==3){

                    System.out.println("谢谢！欢迎下次使用!");
                    break;
                }
            }else{
                System.out.println("您输入的功能序号有误！请重新输入！");
            }

        }

    }

}
