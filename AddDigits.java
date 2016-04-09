package easy;

public class AddDigits
{
	public int addDigits(int num)
	{
		while (num > 9)
		{
			int c = 0;
			while (num > 0)
			{
				c += num%10;
				num = num / 10;
			}

			num = c;
		}
		
		return num;
	}
}
