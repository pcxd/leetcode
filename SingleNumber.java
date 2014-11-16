public class Solution 
{
    public int singleNumber(int[] A) 
    {
        int len = A.length;
        for(int i = 1; i < len; ++i)
            A[0] = A[0]^A[i];
        
        return A[0];
    }
}

/*
使用额外的内存：
  1.hash，开一个2^31 - 1 大小的数组，进行hash，时间复杂度是O(n)
  2.排序：将数据进行排序，然后找与前后都不相同的那个数，时间复杂度是排序的时间复杂度

不使用额外的内存：
  二进制运算中的异或（^）,a^a=0,a^b^a=b，时间复杂度是O(n)
*/
