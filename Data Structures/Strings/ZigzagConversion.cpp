/*
LINK: https://leetcode.com/problems/zigzag-conversion/
*/


class Solution {
public:
string convert(string s, int numRows) {
int diff = numRows > 1 ? (numRows-1)*2 : 1;
int j = 0;
int len = s.size();
string result = "";

    //we are using temporary difference counter for each row using inter
    //we are using a temporary string temp that resets at each row and we use this string to set the value of the result string
    int inter=diff;
    while( j < numRows ){
         string temp = "";
         int i = j;
         bool down = true;
         for( ; i<len ;  ){
             char ch = s.at(i);
             temp += ch;
             
             if( down ){
                 i= i+inter;
             }else{
                 i = i + (diff!=inter ? diff-inter : inter);
             }
             down = !down;
         }
        result += temp;
        j++; 
        inter = j!=numRows-1 ? inter - 2 : diff ;
    }
    
    return result;
    
}
};
