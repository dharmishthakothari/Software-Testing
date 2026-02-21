package basic;

import java.util.Scanner;

public class Age_criteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		System.out.println("Enter age ");
		Scanner scan=new Scanner(System.in);
		age=scan.nextInt();
		
		if(age>=0 && age<=2)
		{
			System.out.println("Infant");
		}else if(age>2 && age<=18)
		{
			System.out.println("Minor");
		}else if(age>18 && age<=50)
		{
			System.out.println("Adult");
		}else if(age>50 && age<=70)
		{
			System.out.println("Senior ");
		}
		else
		{
			System.out.println("Super Senior");
		}
		

	}

}
