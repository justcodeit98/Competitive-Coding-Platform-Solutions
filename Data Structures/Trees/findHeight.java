

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	if(root==null) {
        return 0; 
    }
    if(root.left==null&&root.right==null) {
        return 0; 
    }
    return Math.max(height(root.left)+1, height(root.right)+1); 
    
    }

