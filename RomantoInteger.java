package easy;

public class RomantoInteger
{
	public int romanToInt(String s)
	{
		int[] dict = new int[256];
		dict['I'] = 1;		dict['V'] = 5;		dict['X'] = 10;		dict['L'] = 50;		
		dict['C'] = 100;	dict['D'] = 500;	dict['M'] = 1000;
		char[] arr = s.toCharArray();
		int length = arr.length;
		int ret = 0, i = 0;
		
		while (i < length)
		{
			if (i == length - 1)
			{
				ret += dict[arr[i]];
				i++;
				break;
			}

			if (dict[arr[i]] < dict[arr[i + 1]])
			{
				ret = ret + dict[arr[i + 1]] - dict[arr[i]];
				i += 2;
			}
			else
			{
				ret += dict[arr[i]];
				i++;
			}
		}

		return ret;
	}
}
