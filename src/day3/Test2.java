package day3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入空午的时髦度");
        int kuugoFashion=sc.nextInt();
        System.out.println("输入雷诺依的时髦度");
        int lnyFashion=sc.nextInt();
        boolean result=kuugoFashion>lnyFashion;
        System.out.println(result);
        sc.close();
    }
}
