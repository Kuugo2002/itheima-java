package day6;

public class Test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int index = contains(arr, 3);
        System.out.println(index);
    }

    public static int contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
