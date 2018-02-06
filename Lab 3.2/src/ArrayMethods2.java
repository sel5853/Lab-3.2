
public class ArrayMethods2 {

	public static String[] merge(String[] list1, String[] list2)
	{
		for(int x = 0; x < list1.length - 1; x++)
		{
			String a = list1[x];
			String b = list2[x];
			if(a.compareTo(b) <= 0)
			{
				mergeSort(list1[x], list2[x]);
			}
		}
	}
	
	public static int partition(int[] list)
	{
		int y = list[0];
		for(int x = 0; x < list.length - 1; x++)
		{
			if(list[x] <= y)
			{
				lowerArrange(list[x], y);
			}
			else if(list[x] > y)
			{
				upperArrange(list[x], y);
			}
			
			for(int i = 0; i < list.length - 1; i++)
			{
				if(list[i] == y)
				{
					return i;
				}
			}
		}
	}
	
	public static void lowerArrange(int[] list, int x, int y)
	{
		int i = list[x];
		list[x] = list[y];
		list[y] = i;
	}
	
	public static void upperArrange(int[] list, int x, int y)
	{
		int i = list[x];
		list[x] = list[y];
		list[y] = i;
	}
	
	public static void mergeSort(String x, String y)
	{
		
	}
}
