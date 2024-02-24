package in.ak.basic;

import java.util.Arrays;
import java.util.HashSet;

public class newArray {

	public static void main(String[] args)
	{
		int arr1[]= {1,2,34,56,67,4,4,23};
		int arr2[]= {6,78,98,89,4,23};
		int result[]=removeDuplicate(arr1,arr2);
		System.out.println(Arrays.toString(result));

	}

	private static int[] removeDuplicate(int[] arr1, int[] arr2) {
		HashSet<Integer>hashSet=new HashSet<>();
		for (int element:arr1) {
			hashSet.add(element);
		}
		for (int element:arr2) {
			hashSet.add(element);
		}
     int resultArray[]=new int[hashSet.size()];
     int inted=0;
     for(int element:hashSet) {
    	 resultArray[inted]=element;
    	 inted++;
     }
		return resultArray;
	}

}
