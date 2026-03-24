class Product {
    String name;
    int qty;

    Product(String name1, int qty1) {
        System.out.println("In constructor ");
        name = name1;
        qty = qty1;
    }

    void display() {
        System.out.println(name + "\t" + qty);
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Product obj = new Product("TV", 12);
        obj.display();

        Product obj2 = new Product("Laptop", 20);
        obj2.display();
    }
}
