
public class ArrayMethods2 {

	public static String[] merge(String[] list1, String[] list2)
	{
		int x, y ,z = 0;
		while(z < list1.length + list2.length)
		{
			if(list1[x] <= list2[y])
			{
				
			}
			
			if(list1[x] > list2[y])
			{
				
			}
		}
		z++;
	}
	
	public static int partition(int[] list)
	{
		int y = list[0];
		int z = 0;
		for(int x = 0; x < list.length - 1; x++)
		{
			if(list[x] <= y)
			{
				
			}
			else if(list[x] > y)
			{
				
			}
			
			for(int i = 0; i < list.length - 1; i++)
			{
				if(list[i] == y)
				{
					i = z;
				}
			}
		}
		return z;
	}
}
