package arrs_1113;

import java.util.Scanner;

/**
 * @Author HLX
 * @Date 2019/11/13 16:52
 */
public class Test2 {
    public static void main(String[] args){

//  有5个班各5名学生某门课程的成绩，如何计算5个班各自的总成绩

        Scanner scanner =new Scanner(System.in);

        //二维数组 5*5
        int[][] scores =new int[2][2];

        //input the number
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("please input the class:"+(i+1));
            //每个班的个数
            for (int j = 0; j <scores[i].length ; j++) {
                System.out.print("please the score:");
                scores[i][j]=scanner.nextInt();
            }
        }

        //
        System.out.println();

        //每个班级
        for (int i = 0; i <scores.length ; i++) {
            int sum=0;
            //累计和
            for (int j = 0; j <scores[i].length ; j++) {
                sum+=scores[i][j];
            }
            System.out.println("number "+(i+1)+"class total score:"+sum);
        }



    }
}
