package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII
{
	public static List<Integer> getRow(int rowIndex)
	{
		List<Integer> ret = new ArrayList<Integer>(rowIndex+1);
		
		for(int i = 0; i < rowIndex+1; i++)
			ret.add(0);
		
		for(int i = 0; i < rowIndex+1; i++)
		{
			ret.set(0, 1);
			ret.set(i, 1);
			for(int j = i-1; j > 0; j--)
				ret.set(j, ret.get(j)+ret.get(j-1));
		}
		return ret;
	}
	
	public static void main(String[] args)
	{
		List<Integer> ret = getRow(3);
		
		for(int i = 0; i < ret.size(); i++)
			System.out.println(ret.get(i));
	}
}
