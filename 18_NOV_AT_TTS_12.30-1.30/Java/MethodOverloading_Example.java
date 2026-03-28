package core;
class MyClass
{
	int addition(int m1,int m2)
	{
		return m1+m2;
	}
	int addition(int n1,int n2,int n3,int n4)
	{
		return n1+n2+n3+n4;
	}
}
public class MethodOverloading_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj=new MyClass();
		System.out.println(obj.addition(12, 23,34,3));
		System.out.println(obj.addition(12, 23));
	}

}
