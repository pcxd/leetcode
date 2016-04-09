package easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern
{
	public static boolean wordPattern(String pattern, String str)
	{
		int pCount = 1, sCount = 1;
		int pp = 0, ss = 0;
		char[] pArray = pattern.toCharArray();
        String[] strArray = str.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        int[] hash = new int[256];
        
        for(int i = 0; i < strArray.length; i++)
        {
        	if(!map.containsKey(strArray[i]))
        		map.put(strArray[i], sCount++);
        	ss = ss*10+map.get(strArray[i]);
        }
        
        for(int i = 0; i < pArray.length; i++)
        {
        	if(hash[pArray[i]] == 0)
        		hash[pArray[i]] = pCount++;
        	pp = pp*10+hash[pArray[i]];
        }
//        System.out.println(pp);
//        System.out.println(ss);
        
        return pp==ss;
    }
	
	public static void main(String[] args)
	{
		boolean ret = wordPattern("abba", "dog cat cat dog");
		System.out.println(ret);
	}
}
