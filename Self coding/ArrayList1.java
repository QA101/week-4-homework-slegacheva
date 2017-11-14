package hw4;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList1 flowThrough = new ArrayList1();
		
		int [] arr = {1, 2, 3, 4};
		System.out.println(ArrayInput(arr));
		int [] arr1 = {8, 10, 16};
		System.out.println(ArrayInput(arr1));

	}
	public static int sumEvenIndexes(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return sumEvenIndexesB(numsList);
	}

	public static int sumEvenIndexesB(ArrayList<Integer> numsList) 
	{     
  int a = 0;
  for(int i = 0; i < numsList.size(); i++) {
	  if (i%2 == 0) {
		  a += numsList.get(i);
	  }
  }
  return a;
	}
	public static int ArrayInput(int[] num) {
		return sumEvenIndexes(num);
	}
	

}
