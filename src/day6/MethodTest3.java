package day6;

public class MethodTest3 {
    public static void main(String[] args) {
        int result = getMax(10, 20);
        System.out.println(result);
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
