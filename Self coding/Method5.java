package hw4;

import java.util.Scanner;

public class Method5 {
	public static void main(String[] args){
		int a = 2;
		int b = 5;
		System.out.println("Swap number of " + a + " " + b + " is " +swap (a, b));
		} 
		public static String swap(int a, int b)

		{
			
			int temp = 0;
			String swap = "";
			temp = a;
			a = b;
			b = temp;
			swap = a + " " + b;
			return swap;
			} 


}
