package Leet_Code_9_Palindrome_Number;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num = 1001;
//        int num = 10000;
        Solution solution = new Solution();
        boolean check = solution.isPalindrome(num);
        System.out.println(check);
    }
}

class Solution {
    public boolean isPalindrome(int num) {

        if(num > 0 && num < 10) return true;
        if(num < 0)  return false;

        int revNum = reverseInteger(num);
        int numMod, revMod;

        while(num > 0) {
            numMod = num % 10;
            num = num - numMod;
            num = num / 10;

            revMod = revNum % 10;
            revNum = revNum - revMod;
            revNum = revNum / 10;

            if(numMod != revMod) { return false; }
        }
        return true;
    }

    public int reverseInteger(int num) {
        int revNum = 0;

        while(num > 0) {
            revNum = revNum * 10;
            revNum = revNum + (num % 10);

            int numMod;
            numMod = (num % 10);
            num = num - numMod;
            num = num / 10;
        }
        return revNum;
    }
}