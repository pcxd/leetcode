package easy;

public class CompareVersionNumbers
{
	public static int compareVersion(String version1, String version2)
	{
		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");
		
		int length = Math.max(s1.length, s2.length);
		
		for(int i = 0; i < length; i++)
		{
			Integer a = i < s1.length ? Integer.parseInt(s1[i]) : 0;
			Integer b = i < s2.length ? Integer.parseInt(s2[i]) : 0;
			
			int comp = a.compareTo(b);
			if(comp != 0)
				return comp;
		}
		
		return 0;
	}
	public static void main(String[] args)
	{
		System.out.println(Integer.parseInt("000100"));
		System.out.println(Double.parseDouble("001.010"));
	}
}
