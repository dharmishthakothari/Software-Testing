abstract class Sample {

    abstract void greet();

    void display() {
        System.out.println("in display");
    }

}

class Sample1 extends Sample {
    void greet() {
        System.out.println("In greet");
    }
}

public class EmployeeClass {

    public static void main(String[] args) {

        Sample1 obj = new Sample1();
        obj.greet();
    }
}
