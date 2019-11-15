package exam;

import com.sun.org.apache.xml.internal.security.Init;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author HLX
 * @Date 2019/11/14 16:29
 */
public class BaseService {


    /**
     * 注册用户
     *
     * @param user
     */
    public static void regist(User user) {
        InitObject.lists.add(user);
    }

    /**
     * 登录
     *
     * @param user
     */
    public static boolean login(String name, String pass) {
        boolean flag = false;
//        System.out.println(InitObject.lists.size());
        //在集合中遍历数据
        for (User us : InitObject.lists) {
            if (us.getName().equals(name) && us.getPass().equals(pass)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * 读取本地文件的数据==设备
     *
     * @param file
     */
    public static void readFile(File file) {
        Map<Integer, Equipment> map = (Map<Integer, Equipment>) InitObject.DeserializedObject(file);
        //遍历数据
        Set<Map.Entry<Integer, Equipment>> sets = map.entrySet();
        //迭代
        Iterator<Map.Entry<Integer, Equipment>> it = sets.iterator();
        //循环
        while (it.hasNext()) {
            Map.Entry<Integer, Equipment> en = it.next();
            Integer key = en.getKey();  //key
            Equipment value = en.getValue(); //value
            System.out.println(value);
        }
    }

    /**
     * 根据类型查询数据==>统计几台
     *
     * @param type
     * @return
     */
    public static int findType(String type) {
        int count = 0;
        //获得map
        Map<Integer, Equipment> map = InitObject.map;
        //遍历查找
        for (Integer key : map.keySet()) {
            //获得key
            Equipment eq = map.get(key);
            //比较是否相等
            if (eq.getType().equals(type)) {
                count++;  //累计有几个
            }
        }
        return count;
    }


    /**
     * 添加设备，并写入到本地文件中
     *
     * @param eq
     * @param fileName
     */
    public static void add(Equipment eq, File fileName) {
        //获得map
        Map<Integer, Equipment> map = InitObject.map;
        //添加数据
        map.put(eq.getEid(), eq);
        System.out.println("入库成功!");
        //写入文件中
        InitObject.SerializedObject(map, fileName);


    }

    /**
     * 删除设备，并写入到本地文件中
     *
     * @param eq
     * @param fileName
     */
    public static void del(int eid, File fileName) {
        int count = 0; //标记
        //获得map
        Map<Integer, Equipment> map = InitObject.map;
        //遍历查找
        for (Integer key : map.keySet()) {
            if (key == eid) {
                //删除
                map.remove(key);
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("删除成功!");
            //写入文件中
            InitObject.SerializedObject(map, fileName);
        } else {
            System.out.println("没有此设备编号=>" + eid);
        }
    }


    /**
     * 根据ID查找是否有数据哦
     *
     * @param id
     * @return
     */
    public static boolean findId(int id) {
        boolean flag = false; //标记
        //获得map
        Map<Integer, Equipment> map = InitObject.map;
        //遍历查找
        for (Integer key : map.keySet()) {
            //获得key
            Equipment eq = map.get(key);
            //比较是否相等
            if (eq.getEid() == id) {
                flag = true;
                break;
            }else{
                flag=false;
            }
        }
        return flag;
    }

    /**
     * 修改数据 ，并写入到文件中
     *
     * @param equ
     * @param fileName
     */
    public static void update(Equipment equ, File fileName) {
        int count = 0;
        //获得map
        Map<Integer, Equipment> map = InitObject.map;
        //遍历查找
        for (Integer key : map.keySet()) {
            //获得key
            Equipment eq = map.get(key);
            //比较是否相等
            if (eq.getEid() == equ.getEid()) {
                eq.setDate(equ.getDate());
                break;
            }
        }
        System.out.println("修改成功!");
        //写入文件中
        InitObject.SerializedObject(map, fileName);
    }


}
