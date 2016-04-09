package easy;

public class InvertBinaryTree
{
	public TreeNode invertTree(TreeNode root)
	{
		if(root == null)
			return null;
		root.left = invertTree(root.right);
		root.right = invertTree(root.left);
		
		return root;
    }
}
