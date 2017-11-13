package hw4;

public class Method8 {
	public static void main(String[] args){
		int n = 4;
		System.out.println("Factorial of " + n + " is " +factorial(n));
		} 
		public static int factorial(int n)
		{
		int f = 1;
		for(int i = 1; i <= n; i++)
		{
		f = f * i;
		}
		return f;
		} //end

}
