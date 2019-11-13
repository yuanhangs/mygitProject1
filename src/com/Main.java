package com;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


            int math = (int) (Math.random() * 10);
            System.out.println("randon=" + math);
            Scanner scanner = new Scanner(System.in);
            System.out.print("please input the number;");
            int number = scanner.nextInt();
        //        System.out.println("one="+number%10);
//        System.out.println("ten="+number/10%10);
//        System.out.println("hundred="+number/100%10);
//        System.out.println("thousand="+number/1000);

        do {

            int hundred = 0;
            if (number > 1000 && number < 9999) {
                hundred = number / 100 % 10;
                String result = (math == hundred) ? (number + "号客户，是幸运客户，奖励MP3！") : (number + "号客户，谢谢支持！");
                System.out.println(result);
                break;
            } else {
                System.out.println("please input the right number!");
                System.out.print("please input the number;");
                number = scanner.nextInt();
            }
        }while (true);
    }
}
