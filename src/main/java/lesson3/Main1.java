package lesson3;
//вывести массив в обратном порядке
public class Main1 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 4, 6, 7, 6, 4, 5};
        for (int i = nums.length - 1; i <= nums.length; i--) {
            System.out.println(nums[i]);
        }
    }
}
