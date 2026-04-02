abstract class Shape {
    abstract int getArea();
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int getArea() {
        // TODO Auto-generated method stub
        return length * width;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1, 23);
        System.out.println(r.getArea());
    }

}