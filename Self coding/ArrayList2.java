package hw4;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4};
		System.out.println(evenCount(arr));
		int [] arr1 = {8, 10, 16};
		System.out.println(evenCount(arr1));


	}
	public static int evenCount(int[] nums) { 
         ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return evenCountB(numsList);
	}

	public static int evenCountB(ArrayList<Integer> numsList) 
	{  
	  int a = 0;
	  for (int b : numsList) {
		 if (b % 2 == 0) {
			 a++ ;
		 }
	  }
	  return a;
	  }

	}


