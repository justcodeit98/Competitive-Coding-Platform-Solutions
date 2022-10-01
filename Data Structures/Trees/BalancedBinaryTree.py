LINK:https://leetcode.com/problems/balanced-binary-tree/
    
    
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        
        def dfs(root) :
            
            if not root : 
                return 0, True
            else :
                left, lstat = dfs(root.left)
                right, rstat = dfs(root.right)
                # returned status : result comes from left is good, from right is also good, and current result is good
                status = lstat and rstat and abs(left-right)<=1
                return max(left,right)+1, status
        
        # algorithm start    
        n, status = dfs(root)
        return status
