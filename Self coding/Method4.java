package hw4;

import java.util.Scanner;

public class Method4 {
	public static void main(String[] args){
		Scanner console  = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = console.nextInt();
		System.out.println("Product of " + a + " is " + product(a));
		} //end main
		public static int product(int number)

		{
		int product = 1, r = 0, q = 0;
		while( number > 0)
		{
			r = number%10;
			q = number/10;
			product = product * r ;
			number = q;
			}
			return product;
			}

}
