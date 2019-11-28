package Week5;

import java.util.Arrays;
public class binary_search_find {
		   public static void main(String[] args) {

		      // initializing unsorted array
		      Object arr[] = {11, 12, 34, 55, 66, 77, 88};

		      // sorting array
		      Arrays.sort(arr);

		      // let us print all the elements available
		      System.out.println("The sorted array is:");
		      for (Object number : arr) {
		         System.out.println(number);
		      }

		      // entering the value to be searched
		      int searchVal = 77;

		      int retVal = Arrays.binarySearch(arr,searchVal);

		      System.out.println("The index of " + searchVal + " is :" + retVal);
		   }
		}