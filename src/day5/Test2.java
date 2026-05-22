package day5;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = { 33, 55, 44, 22, 5 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
