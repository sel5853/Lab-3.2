
public class ArrayMethods2 {

	public static String[] merge(String[] list1, String[] list2)
	{
		
	}
	
	public static int partition(int[] list)
	{
		int y = list[0];
		for(int x = 0; x < list.length; x++)
		{
			if(list[x] <= y)
			{
				lowerArrange(list[x], y);
			}
			else if(list[x] > y)
			{
				upperArrange(list[x], y);
			}
			return ;
		}
	}
	
	public static void lowerArrange(int x, int y)
	{
		
	}
	
	public static void upperArrange(int x, int y)
	{
		
	}
	
	public static void mergeSort(String x)
	{
		
	}
}
