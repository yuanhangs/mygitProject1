package class69.no13;

import java.util.*;

public class jh {
    public static void main(String[] args) {
        User user = new User(1,"小黄","123456");
        User user1 = new User(2,"小白","234567");
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);
//        两个设备
        Shebei shebei = new Shebei(1,"猪",2,1);
        Shebei shebei1 = new Shebei(2,"羊",3,4);
        HashMap<String,Shebei>  map = new HashMap<>();
        map.put(shebei.getName(),shebei);
        map.put(shebei1.getName(),shebei);
//       map遍历
        Set<Map.Entry<String, Shebei>> en = map.entrySet();
        for (Map.Entry arr:en) {
            System.out.println("设备是"+arr.getKey());

        }


//        遍历
        for (User userr:list) {
            System.out.println("id是"+userr.getId());
            System.out.println("姓名是"+userr.getName());
            System.out.println("密码是"+userr.getPassword());
        }





    }
}
