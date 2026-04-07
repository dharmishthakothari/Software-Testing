import java.util.ArrayList;

public class arrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(222);
        list.add(23);
        list.add(222);
        // list.add(123);
        // list.add("dharmishtha");
        // list.add(23.45f);
        // list.add(11.23);
        // list.add(4535);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
