package assignment01;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Width Value");
double w=sc.nextDouble();

System.out.println("Enter the Height value");
double h=sc.nextDouble();

double Area=w*h;
System.out.println("Area of Rectangle is " + Area);

double Perimeter=(w+h)*2;
System.out.println("Perimeter of Rectangle is " + Perimeter);
sc.close();


	}

}
