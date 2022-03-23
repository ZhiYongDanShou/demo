package lab03;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-09-17 {TIME}
 */

public class Test4{
    public static  void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数据:");
        int a = scan.nextInt();
        int t = 1;
        for (int i = 1; i <= a; i++)
            t = t * i;
        System.out.println(t);

    }
}

