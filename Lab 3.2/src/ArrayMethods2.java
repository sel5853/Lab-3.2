import java.util.Arrays;

	/*
	 * Name: Stanley Liang
	 * Date: 3/11/18
	 * Period 2
	 */

public class ArrayMethods2 
{
	public static String[] merge(String[] list1, String[] list2)
	{
		int x = 0; 																	//Used for list1[]
		int y = 0;																	//Used for list2[]
		int z = 0;																	//Used for combinedArray
		String[] combinedArray = new String[list1.length + list2.length];			//Creates new array for the sorted array
		while(x < list1.length && y < list2.length && z < combinedArray.length)		//While each index is less than their array lengths
		{			
			if(list1[x].compareTo(list2[y]) <= 0)									//If list1[x] is before list2[y]
			{
				combinedArray[z] = list1[x];										//The next value of combinedArray will = list1[x]
				x++;
			}
			
			else if(list1[x].compareTo(list2[y]) > 0)								//Else if list2[y] is before list1[x]
			{
				combinedArray[z] = list2[y];										//The next value of combinedArray will = list2[y]
				y++;
			}
			z++;
		}
		
		if(x == list1.length)														//If at the end of list1
		{
			for(int n = y; n < list2.length; n++)									//Loops through second array
			{
				combinedArray[z] = list2[n];										//Next value of combinedArray is going to be front the second array b/c no more values are present in the first array
				z++;
			}
		}
		
		if(y == list2.length)														//If at end of list2
		{
			for(int m = x; m < list1.length; m++)									//Loops through first array
			{
				combinedArray[z] = list1[m];										//Next value of combined array is going to be from the first array b/c no more values are present in the second array
				z++;
			}
		}
		return combinedArray;														//Returns the merged sorted array
	}
	
	public static int partition(int[] list)
	{
		int pivot = list[0];														//The value of the pivot
		int pivLoc = 0;																//Location of pivot
		int i = list.length - 1;
		for(int x = 1; x < list.length - 1; x++)									//Loops through the array
		{
			if(list[x] <= pivot)													//If current index of array is less than or equal to the pivot
			{
				swap(list, x, x-1);													//Swap the current value and the value before
				pivLoc = x;
			}
			else if(list[x] > pivot & i > x)										//If current index of array is greater than pivot and the last index of array is greater than current index of the array
			{
				swap(list, x, i);													//Swap the current value and the last value in the array
				i--;
				x--;
			}
		}
		return pivLoc;																//Returns the end location of the pivot
	}

	public static void main(String[] args) 											//Testing code for Lab 3.2
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
	
	public static void swap(int list[], int index1, int index2)						//Swap helper method
	{
		int x = list[index1];
		list[index1] = list[index2];
		list[index2] = x;
	}
}
