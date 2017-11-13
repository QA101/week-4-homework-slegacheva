package hw4;

public class Method10 {
	public static void main(String[] args) {
	int a = 10;
	int b = 5;
	int c = 15;
	System.out.println("Minimum number is " + minimum(a, b, c));
	}
	public static int minimum(int a, int b, int c)
	{
	int min = Math.min(a,Math.min(b,c));
	return min;
	} //end

}
