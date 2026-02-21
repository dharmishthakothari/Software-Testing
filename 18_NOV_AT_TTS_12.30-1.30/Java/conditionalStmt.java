package basic;

import java.util.Scanner;

public class conditionalStmt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age ");
		int age;
		age=scan.nextInt();
		
		if(age>18)
		{
			System.out.println("User is eligible for voting ");
		}else
		{
			System.out.println("User is not eligible for voting ");
		}
		
		int no;
		System.out.println("Enter number ");
		no=scan.nextInt();
		if(no>0)
		{
			System.out.println("no is positive");
		}else if(no<0)
		{
			System.out.println("no is nagative");
		}
		else
		{
			System.out.println("Zero");
		}
		
		
	}

}
