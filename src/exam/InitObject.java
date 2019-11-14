package exam;

import java.io.*;
import java.util.*;

/**
 * @Author HLX
 * @Date 2019/11/14 15:55
 */
public class InitObject {

    //    使用集合默认储存2个用户(List集合),2个设备(Map集合)
    public static List<User> lists = new ArrayList<>();
    public static Map<Integer, Equipment> map = new HashMap<>();

    static {
        //list
        User user1 = new User(1, "mike", "000");
        User user2 = new User(2, "andy", "222");
        //存入集合中
        lists.add(user1);
        lists.add(user2);

        //map
        Equipment equipment1 = new Equipment(1001, "推土机", "机械设备", new Date());
        Equipment equipment2 = new Equipment(1002, "挖土机", "机械设备", new Date());
        Equipment equipment3 = new Equipment(1003, "心电机", "器械设备", new Date());
        map.put(equipment1.getEid(), equipment1);
        map.put(equipment2.getEid(), equipment2);
        map.put(equipment3.getEid(), equipment3);

        //写入文件中
        SerializedObject(map,new File("myequipment.bin"));

    }

    /**
     * 序列化==>写入数据
     * @param map
     * @param fileName
     */
    public static void SerializedObject(Map<Integer, Equipment> map, File fileName) {
        //文件输出流
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fileName);
            //对象流
            oos = new ObjectOutputStream(fos);
            //写入
            oos.writeObject(map);
            System.out.println("写入文件成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 反序列化==>读取数据
     * @return
     */
 public static Object DeserializedObject(File fileName){
     ObjectInputStream ois = null;
     //自动关闭流
     try (FileInputStream fis = new FileInputStream(fileName)) {
         ois =new ObjectInputStream(fis);
         return ois.readObject();
     }catch (Exception ex){
         ex.printStackTrace();
     }finally {
         try {
             ois.close();  //关闭流
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     return null;
 }



}
