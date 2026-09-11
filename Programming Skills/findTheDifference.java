// https://leetcode.com/problems/find-the-difference/?envType=study-plan-v2&envId=programming-skills

class Solution {
    public char findTheDifference(String s, String t) {
        
        int sumone = 0;
        int sumtwo = 0;

        for(int i = 0; i<s.length();i++)
        {
            sumone = sumone + s.charAt(i);
        }
        for(int i = 0; i<t.length();i++)
        {
            sumtwo = sumtwo + t.charAt(i);
        }
        return (char)(sumtwo-sumone);
        
    }
}
