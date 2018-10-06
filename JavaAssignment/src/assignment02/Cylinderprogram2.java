package assignment02;

import java.util.Scanner;

public class Cylinderprogram2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	double pi=3.14; 
	
	System.out.println("Enter the Radius value");
	double radius=sc.nextDouble();
	
	System.out.println("Enter the Length");
	double length=sc.nextDouble();
	
	double area=radius*radius*pi;
	double volume=area*length;
	
	System.out.println("Area of Cylinder is : " + area);
	System.out.println("Volume of Cylinder is : " + volume);
	
	sc.close();
	}

}
