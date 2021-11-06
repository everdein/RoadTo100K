package Leet_Code_1_Two_Sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        int[] num = {2,5,5,11};
//        int key = 10;
//        Solution sol = new Solution();
//        int[] ans = sol.twoNumSum(num, key);
//        if(sol != null) {
//            for (int y : ans) {
//                System.out.print(y);
//            }
//        }

        int[] numbers = {2,5,5,11};
        int target = 10;
        Solution solution = new Solution();
        int[] answer = solution.twoSum(numbers, target);
        if(solution != null) {
            for (int x : answer) {
                System.out.print(x);
            }
        }
    }
}

class Solution {
    // O(n) Solution
//    public static int[] twoNumSum(int[] num, int key) {
//
//        return null;
//    }

    // N^2 Solution
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 2) {
            if(numbers[0] == target) {
                int[] answer = {0};
                return answer;
            }
            return null;
        }

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(sum == target && i != j) {
                    int[] solution = {i, j};
                    return solution;
                }
            }
        }
        return null;
    }
}