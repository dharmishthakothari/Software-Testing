package basic;

import java.util.Scanner;

public class conditionalStmt1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int no;
	System.out.println("Enter number ");
	no=scan.nextInt();
	if(no%2==0)
	{
		System.out.println("Number is even ");
	}else
	{
		System.out.println("Number is Odd");
	}
}
}
