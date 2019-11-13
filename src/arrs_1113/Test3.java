package arrs_1113;

import java.util.Arrays;

/**
 * @Author HLX
 * @Date 2019/11/13 17:17
 */
public class Test3 {
    public static void main(String[] args) {
        home1();

    }

    /**
     * 题目： 首先创建一个长度是5的数组,然后给数组的每一位赋予随机整数,通过for循环，遍历数组，找出最小的一个值出来
     *
     * 提示：int random =(int)(Math.random()*100+1) 产生随机数1-100的整数
     *
     */
    private static void home1() {
        int[] arrs =new int[5];
        for (int i = 0; i <arrs.length ; i++) {
            int random =(int)(Math.random()*100+1);
            arrs[i]=random;
        }
        System.out.println(Arrays.toString(arrs));

        //第一种方法
        int min =arrs[0];
        for (int i = 1; i <arrs.length ; i++) {
            if(min>arrs[i]){
                min=arrs[i];
            }
        }
        System.out.println("min="+min);

        //第二种方法
//        //升序排序
//        Arrays.sort(arrs);
//        System.out.println(Arrays.toString(arrs));
//        //经过排序之后，那么最小的在第一个！！
//        System.out.println("min="+arrs[0]);
    }
}
