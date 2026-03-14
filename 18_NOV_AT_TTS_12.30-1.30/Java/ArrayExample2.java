public class ArrayExample2 {
    public static void main(String[] args) {
        String names[] = new String[15];
        names[0] = "Prayusha";
        names[1] = "Vidhi";
        names[2] = "Maitri";
        names[4] = "Sona";
        names[9] = "Dharmishtha";
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null)
                System.out.println(names[i] + "---> " + names[i].length());
        }

    }
}
