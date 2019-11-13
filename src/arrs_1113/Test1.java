package arrs_1113;

import java.lang.ref.SoftReference;
import java.util.Arrays;

/**
 * @Author HLX
 * @Date 2019/11/13 16:20
 */
public class Test1 {
    public static void main(String[] args) {
//        getPop();

//        getSort();
//          getEquals();

//        getFill();

//        getCopyof();

        getBinarySearch();

    }

    /**
     * Arrays.binarySearch()查询元素值val在数组array中的下标,但前提数组必须要按升序排序
     */
    private static void getBinarySearch() {
        //数组必须要按升序排序
        int[] scores = {6, 25, 49, 90, 113};
        //key是要查找的数据 ;获得对应的下标0开始；
        //如果没有找到，按升序排序，就是-1，-2，-3.。。。
        int num = Arrays.binarySearch(scores, 6);
        System.out.println("查找到当前值的下标："+num);


    }

    /**
     * Arrays.copyOf() 数组array复制成一个长度为length的新数组，返回类型与复制的数组一致
     */
    private static void getCopyof() {
        int[] scores = {16, 25, 19, 90, 13};
        //  int[] news = Arrays.copyOf(scores, 3);
        int[] news = Arrays.copyOf(scores, scores.length + 1);
        System.out.println(Arrays.toString(news));


    }

    /**
     * Arrays.fill() 填充所有的数据
     */
    private static void getFill() {
        int[] scores = {16, 25, 19, 90, 13};
        Arrays.fill(scores, 500);
        System.out.println(Arrays.toString(scores));


    }

    /**
     * Arrays.equals()比较方法
     */
    private static void getEquals() {
        int[] scores1 = {16, 25, 19, 90, 13};
        int[] scores2 = {16, 25, 19, 90, 13};

        System.out.println(Arrays.equals(scores1, scores2));
        System.out.println("比较的是地址：" + (scores1 == scores2));
    }

    /**
     * Arrays.sort()排序方法
     */
    private static void getSort() {
        int[] scores = {16, 25, 19, 90, 13};
        System.out.println(Arrays.toString(scores));
        //default asc sort
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        //desc sort
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + "\t");
        }
        System.out.println();
    }

    /**
     * 冒泡排序对输入的5名学员成绩进行降序排列
     */
    private static void getPop() {

        int[] scores = {16, 25, 9, 90, 13};
        System.out.println(Arrays.toString(scores));
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(scores));
    }
}
