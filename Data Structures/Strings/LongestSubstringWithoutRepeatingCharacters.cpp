// PROBLEM STATEMENT: Given a string s, find the length of the longest substring without repeating characters

class Solution {
public:

int lengthOfLongestSubstring(string s) {
    int max_substring=0;
   int count[256]={0};
    int l=0;
    int r=0;
    while(r<s.length()){
        count[s[r]]++;  
        while(count[s[r]] > 1){
            count[s[l]]--;
            l++;
        }
        max_substring=max(max_substring,r-l+1);
        r++;
    }
   return max_substring; 
}
};
