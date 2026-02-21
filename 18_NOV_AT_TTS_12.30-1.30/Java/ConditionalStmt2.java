package basic;

import java.util.Scanner;

public class ConditionalStmt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number");
		number=obj.nextInt();
		if(number>=10 && number<=99)
		{
			System.out.println("Number is 2 digit ");
		}else if(number>=100 && number<=999)
		{
			System.out.println("Number is 3 digit ");
			
		}else
		{
			System.out.println("Invalid");
		}
	}

}
