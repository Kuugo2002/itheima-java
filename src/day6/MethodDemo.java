package day6;

public class MethodDemo {
    public static void main(String[] args) {
        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(10, 20, 30);
        int sum3 = getSum(10, 20, 30);
        int sum4 = getSum(10, 20, 30);
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }

    public static int getSum(int month1, int month2, int month3) {
        int sum = month1 + month2 + month3;
        return sum;
    }
}
