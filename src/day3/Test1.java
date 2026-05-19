package day3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        System.out.println("个位是："+ones);
        System.out.println("十位是："+tens);
        System.out.println("百位是："+hundreds);
    }
}