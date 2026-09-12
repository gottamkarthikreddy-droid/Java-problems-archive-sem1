//https://leetcode.com/problems/palindrome-number/description/
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while(temp>0)
        {
            reverse = reverse * 10 + temp%10;
            temp = temp/10;
        

        }
        if(reverse == x)
        return true;
        else
        return false;
    }
}