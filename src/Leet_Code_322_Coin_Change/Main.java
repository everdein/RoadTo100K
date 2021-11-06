package Leet_Code_322_Coin_Change;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int numOfCoins = solution.coinChange(coins, amount);
        System.out.println(numOfCoins);
    }
}

// TODO: Underand solution
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] mins = new int[amount + 1];
        for (int i = 1; i <= amount; i ++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j ++) {
                if (i - coins[j] >= 0 && mins[i - coins[j]] != Integer.MAX_VALUE) {
                    min = Math.min(min, mins[i - coins[j]] + 1);
                }
            }
            mins[i] = min;
        }
        if (mins[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return mins[amount];
    }
}
