package assignment01;

import java.util.Scanner;

public class AreanRadius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float pi=3.14f;
		
		System.out.println("Enter the Radius value");
		 double radius=sc.nextDouble();
		 
		 double perimeter=2*radius*pi;
		 System.out.println("Perimeter = " + perimeter);
		 
		 double area=radius*radius*pi;
		 System.out.println("Area = " + area);
		
		sc.close();
		

	}

}
