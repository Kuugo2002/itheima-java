package day6;

public class MethodTest5 {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 98, 73, 60 };
        int number = getMax(arr);
        System.out.println("number:" + number);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
