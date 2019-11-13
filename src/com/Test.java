package com;

/**
 * @Author HLX
 * @Date 2019/11/11 14:49
 * @conent:  素数的定义是指在除了1和此整数本身外,不能被其他自然数整除的数（1除外）。
 */
public class Test {
    public static void main(String[] args) {
//        two();
                  boolean flag=false;
            //1-100之间的质数
            for (int i = 2; i <101 ; i++) {
                for (int j = 2; j < i; j++) {
                    if(i%j==0){
                        flag=true;
                        break;
                    }
                }
                //i is
                if(!flag){
                    System.out.print(i+"\t");
                }
                //change flag value false
                flag=false;
        }

    }

    private static void two() {
        boolean flag=false;
        //1-100之间的质数
        for (int i = 2; i <101 ; i++) {
            for (int j = 2; j<=Math.sqrt(i) ; j++) {
                if(i%j==0){ //i equals j value zero
                    flag=true;
                    break;
                }
            }
            //质数(素数)
            if(!flag){
                System.out.print(i+"\t");
            }
            //reset flag value false;
            flag=false;
        }
    }
}
