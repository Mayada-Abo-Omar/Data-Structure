import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mayada");
        names.add("Mona");
        names.add("Sara");
        names.add(1, "Ali");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.indexOf("Mona"));
        System.out.println(names.contains("Sara"));
        names.set(2, "Omar");
        Collections.sort(names);
        ArrayList<String> extra = new ArrayList<>();
        extra.add("Youssef");
        extra.add("Nour");
        names.addAll(extra);
        names.remove("Mayada");
        names.remove(0);
        System.out.println(names);
    }
}