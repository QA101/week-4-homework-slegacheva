package hw4;

public class Method3 {

			public static void main(String[] args) {
			// TODO Auto-generated method stub

				int a = 7;
				System.out.println("First seven square numbers :");
				System.out.println(square(a));
				} //end main
				public static String square(int a)
				{
				String square = "";
				for(int i = 1; i <= a; i++)
				{
				square = square + " " + (i*i);

				}
				return square;

		}

	}


