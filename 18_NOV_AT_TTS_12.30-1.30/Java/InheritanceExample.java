package core;

class Vehical
{
	int no_of_wheel;
	String model;
	Vehical(String model1,int no_of_wheel1)
	{
		model=model1;
		no_of_wheel=no_of_wheel1;
	}
	public void display()
	{
		System.out.println(model+"\t"+no_of_wheel);
	}
		
}
class Car extends Vehical
{
	String type,brand;
	
	Car(String model,String type1,String brand1,int no_of_wheels)
	{
		super(model,no_of_wheels);
		type=type1;
		brand=brand1;
	}
	public void display()
	{
		super.display();
		System.out.println(type+"\t"+brand);
	}
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj=new Car("SUV","petrol","Hyudai",4);
		obj.display();
		
		Car obj1=new Car("Sedan","Deisel","TATA", 4);
		obj1.display();
		
		Vehical obj2=new Vehical("schooter",2);
		obj2.display();
		
		

	}

}
