package com.oops;
/*

create class Employee having data memebers eid ,ename ,salary
create getDetails () and display
in Main() create 5 objects of Employee and call get

*/

class Person {
    // data members Person class
    String name, email;
    int age;

    // member function
    void getDetails(String name1, String email1, int age1)

    {
        name = name1;
        email = email1;
        age = age1;
    }

    // member function
    void display() {
        System.out.println(name + "\t" + email + "\t" + age);
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("in main");

        // creating object of Person call p1
        Person p1 = new Person();
        p1.getDetails("dharmishtha", "dharmishtha@gmail.com", 30);
        p1.display();

        Person p2 = new Person();
        p2.getDetails("janvi", "janvi@gmail.com", 20);
        p2.display();

    }
}
