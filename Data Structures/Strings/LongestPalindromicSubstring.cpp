/* https://leetcode.com/problems/longest-palindromic-substring/

Given a string s, return the longest palindromic substring in s.

A string is called a palindrome string if the reverse of that string is the same as the original string.

*/

class Solution {
public:
   string longestPalindrome(string s) {     
        int start = 0,end =0;
       int len = 0;
         // string longest ="";
        for(int i = 0;i<s.length();i++){
//             b a a b
            // i i+1
//             b a b 
//             i i
             int odd = expandfromcentre(s,i,i);   // centre  common hai 
             int even = expandfromcentre(s,i,i+1);
            
             if(len<max(odd,even)){
                 len=max(odd,even);
                 start = i - (len-1)/2;
                // end = i+len/2;
             }
        }
        
        return s.substr(start,len);
        
    }
    
      int expandfromcentre(string s, int i , int j){
      
        while(i>=0 && j<s.length() && s[i]==s[j]){
            i--,j++;
        }
        return j-i-1;
    }
    
};
