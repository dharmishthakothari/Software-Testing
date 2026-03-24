class A {
    void greet() {
        System.out.println("Good Morning ");
    }
}

class B extends A {

}

public class Inheritance_Example1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.greet();
    }
}
