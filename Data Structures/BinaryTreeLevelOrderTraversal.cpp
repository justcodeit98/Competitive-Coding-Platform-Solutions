

/**
 * PROBLEM STATEMENT: Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 *
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */


class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        
        if(!root)
            return {};
        
        vector<vector<int>> ans;
        
        queue<TreeNode *> q;
        q.push(root);
        
        while(!q.empty())
        {
            int size=q.size();
            vector<int> arr;
            
            for(int i=0;i<size;i++)
            {
                TreeNode *temp=q.front();
                q.pop();
                arr.push_back(temp->val);
                
            if(temp->left)
                q.push(temp->left);
            if(temp->right)
                q.push(temp->right);
            }
            ans.push_back(arr);
        }
        return ans;
    }
};
        
