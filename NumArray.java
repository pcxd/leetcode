package easy;

public class NumArray
{
	int[] data;
	public NumArray(int[] nums)
	{
		for(int i = 1; i < nums.length; i++)
			nums[i] = nums[i-1]+nums[i];
		this.data = nums;
	}

	public int sumRange(int i, int j)
	{
		if(i == 0)
			return data[j];
		return data[j]-data[i-1];
	}
}
