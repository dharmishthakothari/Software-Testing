public class ClassExample1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.getDetails();
        p.display();
    }
}

class Person {
    int c_no;
    String name, address;

    void getDetails() {
        c_no = 124;
        name = "maitri";
        address = "Paldi";
    }

    void display() {
        System.out.println(name + c_no + address);
    }
}
