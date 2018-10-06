package assignment01;

import java.util.Scanner;

public class Summation02 {

	public static void main(String[] args) 
	{
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int value=sc.nextInt();

int sum=0;
for(int i=0;i<=value;i++)
{
	
	sum=sum+i;
	System.out.print(sum + " ");// print is use for print values in one line
	                            // println is use for print the values one by one
}
System.out.println("\n Sum is " + sum);

sc.close();
	}

}
