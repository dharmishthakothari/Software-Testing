package basic;

import java.util.Scanner;

public class ArithmaticOperation {
	
	
	public static void main(String args[])
	{
		//Object creation 
		Scanner scan=new Scanner(System.in);
		int no1,no2,ans;
		System.out.println("Enter number 1");
		no1=scan.nextInt();
		
		System.out.println("Enter number 2 ");
		no2=scan.nextInt();
		

		ans=no1+no2;
		
		System.out.println("Addition is "+ans);
		
		
		boolean ans1=no1>no2;
		System.out.println(" Greater then  "+ans1);
		ans1=no1<no2;
		System.out.println("Less then "+ans1);
		
		
		
	}

}
