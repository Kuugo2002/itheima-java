package day6;

import java.util.Scanner;

public class MethodDemo2 {
    public static double getArea(int radii) {
        double area = 3.14 * radii * radii;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入圆的半径：");
        int radii = sc.nextInt();
        System.out.println("请输入第二个圆的半径：");
        int radii2 = sc.nextInt();
        sc.close();
        double area1 = getArea(radii);
        double area2 = getArea(radii2);
        if (area1 > area2) {
            System.out.println("第一个圆更大");
        } else {
            System.out.println("第二个圆更大");
        }

    }
}
