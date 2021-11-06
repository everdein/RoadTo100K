package Leet_Code_238_Product_of_Array_Except_Self;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        int[] nums = {-1,1,0,-3,3};
        int[] answer = Solution.productExceptSelf(nums);
        System.out.print("\nAnswer: ");
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 1;
        int right = 1;
        for(int i = 0; i < answer.length - 1; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.print("Left: ");
        for(int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left = left * nums[i];
            System.out.print(answer[i] + " ");
        }
        System.out.print("\nRight: ");
        for(int i = nums.length - 1; i> -1; i--) {
            answer[i] = right * answer[i];
            right = right * nums[i];
            System.out.print(answer[i] + " ");
        }
        return answer;
    }
}