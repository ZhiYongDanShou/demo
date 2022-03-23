package lab11;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-11-09 {TIME}
 */
public class MyTest02 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入五个学生的名字");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第" + i + "位学生的名字:");
             String name = scanner.next();
            arr[i] = name;
        }
        System.out.println("遍历循环名字:");
        for (int i = 0; i <arr.length; i++) {
            System.out.println("第"+ i + "位学生的名字" + arr[i]);
        }
    }}