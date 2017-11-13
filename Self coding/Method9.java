package hw4;

public class Method9 {
		public static void main(String[] args){
			int a = 10;
			int b = 5;
			int c = 15;
			System.out.println("Maximum number is " + maximum(a, b, c));
			}
			public static int maximum(int a, int b, int c)
			{
			int max = Math.max(a,Math.max(b,c));
			return max;
			} 

	}


