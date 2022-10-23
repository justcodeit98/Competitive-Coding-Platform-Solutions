
//PROBLEM LINK: https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int freq[] = new int[nums.length+1];
        for (int i:nums) freq[i]++;
        int dup = 0, miss = 0;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i]==2) dup = i;
            if (freq[i]==0) miss = i; 
            if (dup!=0 && miss!=0) break;
        }
        return new int[]{dup,miss};
    }
}
