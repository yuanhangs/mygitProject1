package com;

/**
 * @Author HLX
 * @Date 2019/11/11 15:23
 * @content: 编写Java程序，实现输出1~100中所有不能被7整除的数，并求其和。当累加和大于4000时，记录当前数，跳出循环。
 * 要求：每输出4个数换行显示。
 */
public class Test2 {
    public static void main(String[] args) {
//        getCount();

}
    private static void getCount() {
        int sum=0;
        int count=0;
        for (int i = 1; i <101 ; i++) {
            if (i % 7 != 0) {
                System.out.print(i + "\t");
               //统计个数
                count++;
                if(count==4) { // 4 number in line
                    System.out.println();
                    count=0;   //reset count value zero
                }
                sum += i;

            }
            if(sum>4000){
                System.out.println("\n"+"当前数："+i+"\tsum="+sum);
                break;
            }
        }
    }
}
