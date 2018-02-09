import java.util.Arrays;

public class ArrayMethods2 
{
	public static String[] merge(String[] list1, String[] list2)
	{
		int x, y ,z = 0;
		String[] list3 = new String[list1.length + list2.length];
		while(z < list1.length + list2.length)
		{
			if(list1[x] <= list2[y])
			{
				x++;
			}
			
			if(list1[x] > list2[y])
			{
				y++;
			}
			
			if()
			{
				
			}
			
			if()
			{
				
			}
			z++;
		}
		return list3;
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

	public static void main(String[] args) 
	{
		String[] list1 = {"apple","cucumber","microsoft","zorro"};
		String[] list2 = {"banana","cherry","mahogany","oreos", "pinata"};
		int[] list = {3,4,2,7,12,22,0,1};

		long start = System.nanoTime();
		String[] mergeResult = merge(list1, list2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(mergeResult));
		
		start = System.nanoTime();
		int pivotFinalPos = partition(list);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		System.out.println(list);
	}	
	
	public static void swap(int list[], int index1, int index2)
	{
		int x = list[index1];
		list[index1] = list[index2];
		list[index2] = x;
	}
}
