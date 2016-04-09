package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal
{
	public List<List<Integer>> levelOrderBottom(TreeNode root)
	{
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root == null)	return ret;
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			int levelNum = queue.size();
			List<Integer> levelBuff = new ArrayList<Integer>();
			
			for(int i = 0; i < levelNum; i++)
			{
				TreeNode tmp = queue.poll();
				levelBuff.add(tmp.val);
				if(tmp.left != null)
					queue.add(tmp.left);
				if(tmp.right != null)
					queue.add(tmp.right);
			}
			ret.add(0, levelBuff);
		}
		
		return ret;
	}
}
