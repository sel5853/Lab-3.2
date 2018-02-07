
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
				lowerArrange(list, y, list[x]);
			}
			else if(list[x] > y)
			{
				upperArrange(list, y, list[x]);
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
	
	public static void lowerArrange(int[] list, int index1, int index2)
	{
		int i = list[index1];
		list[index1] = list[index2];
		list[index2] = i;
	}
	
	public static void upperArrange(int[] list, int index1, int index2)
	{
		int i = list[index1];
		list[index1] = list[index2];
		list[index2] = i;
	}
	
	public static void mergeSort(String x, String y)
	{
		
	}
}
