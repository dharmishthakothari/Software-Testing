
class Shape {
    public int getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // public int getArea() {
    // return length * width;
    // }

}

class Square extends Shape {
    int side;

    public Square(int s) {
        side = s;
    }

    public int getArea() {
        return side * side;
    }
}

public class Poly_Example {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10, 3);

        System.out.println(obj.getArea());

        Square sq = new Square(4);
        System.out.println(sq.getArea());
    }
}
