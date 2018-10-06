package assignment02;

import java.util.Scanner;

public class PoundstoKGprogram04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Pound value");
		double pound=sc.nextDouble();
		
		double kg=pound*0.454;
		System.out.println(pound + " Pound = " + kg + " KG");
		sc.close();
		

	}

}
