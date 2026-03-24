class Person {
    int c_no;
    String name, address;

    public void getDetails(String name1, String address1, int cNo) {
        name = name1;
        address = address1;
        c_no = cNo;
    }

    void display() {
        System.out.println(name + "\t" + address + "\t" + c_no);
    }
}

class Employee extends Person {
    int salary;
    String dept;

    void getDetails1(String dept1, int sal1) {
        dept = dept1;
        salary = sal1;
    }

    void display1() {
        System.out.println(dept + "\t" + salary);
    }
}

public class Inheritance_example2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getDetails("Dharmishtha", "Paldi", 2344);
        e1.getDetails1("Software", 20000);

        e1.display();
        e1.display1();
    }
}
