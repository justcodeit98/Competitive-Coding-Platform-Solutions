// PROBLEM STATEMENT LINKS: https://leetcode.com/problems/find-common-characters/

class Solution {
    
    /*
    Input - A String
    Returns - Chaaracter Frequency Array
    */
    public static int[] getCharFreqArray(String s){
        
        int[] res = new int[26];
        
        for(int i = 0;i<s.length();i++){
            
            res[s.charAt(i) - 'a']++;
            
        }
        
        return res;
        
    }
    
    /*
    Input - Two Character Frequencency Arrays
    Returns - Common Character Frequency Array
    */
    public static int[] getCommonCount(int[] res,int[] cur){
        
        for(int i = 0;i<26;i++){
            
            res[i] = Math.min(res[i],cur[i]); // common count = minimum(count1,count)
            
        }
        
        return res;
    }
    
    public List<String> commonChars(String[] words) {
        
        int[] vis = getCharFreqArray(words[0]); // Intialize the common character frequency array with first word
        
        for(int i = 1;i<words.length;i++){
            
            int[] cur = getCharFreqArray(words[i]);
            
            vis = getCommonCount(vis,cur); // update the common character frequency array
            
        }
        
        List<String> ans = new ArrayList<String>(); // for storing the answe in List<String> format
        
        for(int i = 0;i<26;i++){
            
            for(int j = 0;j<vis[i];j++){
                
                ans.add(Character.toString(i + 'a')); // Convert Characters to String based on Common Count
                
            }
            
        }
        
        return ans;
    }
}
