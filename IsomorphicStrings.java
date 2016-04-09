package easy;

public class IsomorphicStrings
{
	public static boolean isIsomorphic(String s, String t)
	{
		int sCount = 1, tCount = 1;
		int[] sHash = new int[256], tHash = new int[256];
		char[] sArr = s.toCharArray(), tArr = t.toCharArray();
		int ss = 0, tt = 0;
		
		for(int i = 0; i < sArr.length; i++)
		{
			if(sHash[sArr[i]] == 0)
			{
				sHash[sArr[i]] = sCount;
				sCount++;
			}
			ss = ss*10+sHash[sArr[i]];
		}
//		System.out.println(ss);
		
		for(int i = 0; i < tArr.length; i++)
		{
			if(tHash[tArr[i]] == 0)
			{
				tHash[tArr[i]] = tCount;
				tCount++;
			}
			tt = tt*10+tHash[tArr[i]];
		}
//		System.out.println(tt);
		
		return ss==tt;
	}
	public static void main(String[] args)
	{
		System.out.println(isIsomorphic("boo", "baa"));
	}
}
