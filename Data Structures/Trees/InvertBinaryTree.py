https://leetcode.com/problems/invert-binary-tree/  -link for problem statement
  
  
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        
        def invert(node) :
            if node :
                # swap
                node.left, node.right = node.right, node.left
                # go deeper
                invert(node.left)
                invert(node.right)
        
        # algorithm mstart        
        invert(root)
        return root
