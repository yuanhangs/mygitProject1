package com;

import java.util.Scanner;

/**
 * @Author HLX
 * @Date 2019/11/11 16:06
 */
public class Test3 {

    public static void main(String[] args) {
        int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 }; // 创建数组并赋值

        int sum=0;
        //循环输出数列的值
        //求数列中所有数值的和
        for(int num:list){
            System.out.println(num);
            sum+=num;
        }
        System.out.println("数组元素之和为："+sum);

        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数： ");
        int guess = input.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (guess == list[i]) {
                System.out.println("guess right！");
                break;
            }else if(list.length-1==i){
                System.out.println("sorry！");
            }
        }
    }

}
