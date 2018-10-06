package assignment01;

public class Summation {

	public static void main(String[] args) {

		int value = 9;
		int sum = 0;

		for (int i = 1; i <= value; i++)
		{

			sum = sum + i;
			System.out.print(sum + " ");

		}
		System.out.println("\n sum is " + sum);// \n is use for to print the text on next line

	}

}
