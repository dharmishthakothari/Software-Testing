public class Area_Class implements Area_Interface {
    @Override
    public float findCircle(int radius) {
        // TODO Auto-generated method stub
        return pi * radius;
    }

    @Override
    public int findRectangle(int l, int w) {
        // TODO Auto-generated method stub
        return l * w;
    }

    @Override
    public int findSquare(int side) {
        // TODO Auto-generated method stub
        return side * side;
    }

    public static void main(String[] args) {
        Area_Class obj = new Area_Class();
        System.out.println(obj.findCircle(2));
        System.out.println(obj.findRectangle(10, 3));
        System.out.println(obj.findSquare(12));

    }

}
