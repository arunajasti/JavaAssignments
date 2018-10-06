package assignment02;

import java.util.Scanner;

public class Celsiusprogram1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Celsius value");
		double celsius=sc.nextDouble();
		
		double farenheit= (celsius * 9 / 5) + 32;
		System.out.println(celsius + " °C = " + farenheit + " °F");
		sc.close();
		
		
	}

}
