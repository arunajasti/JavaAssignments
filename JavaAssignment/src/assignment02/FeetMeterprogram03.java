package assignment02;

import java.util.Scanner;

public class FeetMeterprogram03 {

	public static void main(String[] args) {
		//1feet=0.305meter
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter feet value");
		double feet=sc.nextDouble();
		
		double meter =feet*0.305;
		System.out.println(feet + " Ft = " + meter + " meter");
		sc.close();
		

	}

}
