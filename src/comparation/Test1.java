package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("David");
        list.add("Armine");
        list.add("Andranik");
        list.add("Soso");
        System.out.println("Перед сортировки " + list);
        Collections.sort(list);
        System.out.println("После сортировки " + list);

    }
}
