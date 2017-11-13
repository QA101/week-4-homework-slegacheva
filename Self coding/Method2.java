package hw4;

public class Method2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a = 10;
			System.out.println("First ten odd :");
			System.out.println(odd(a));
			} //end main
			public static String odd(int a)
			{
			String odd = "";
			for(int i = 1; i <= a; i++)
			{
			odd = odd + " " + (2*i - 1);

			}
			return odd;

	}

}
