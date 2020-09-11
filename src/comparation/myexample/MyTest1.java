package comparation.myexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MyTest1 {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        Worker work1 = new Worker(666, "Vagram", 222);
        Worker work2 = new Worker(2112, "Kesha", 12123);
        list.add(work1);
        list.add(work2);
        System.out.println(list);
    }

}

class Worker {
    int id;
    String name;
    int price;

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + "$" +
                '}';
    }


    public Worker(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



}
