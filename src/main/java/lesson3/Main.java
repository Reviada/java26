package lesson3;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[9];
        nums[5] = 7;
        for (int i = 0; i < nums.length; i++) {
            //nums.length - это длинна массива
            System.out.println(nums[i]);
        }
    }
}