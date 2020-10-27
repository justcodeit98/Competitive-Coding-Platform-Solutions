/* Given a binary array, find the maximum number of consecutive 1s in this array.
Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:
The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000 */

// Solution peforms in O(n) time

class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {        
        int current=0; //stores the current no. of consecutive 1's 
        int max=0; //stores the max no. of consecutive 1s                
        for (int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {                
                // loop to count the number of consecutive 1's
                while(i<nums.length && nums[i]!=0)
                {
                    current++;
                    i++;
                }                
                //updates the max count
                if(current>max)
                {
                    max=current;
                }
                //resets the current number to 0, when it encounters a 0
                current=0;
            }
        }
       return max;        
    }
}
