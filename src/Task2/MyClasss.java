package Task2;

import java.util.ArrayList;
import java.util.List;

public class MyClasss<T> {
    List<T> list = new ArrayList<>();

    public void add(T name) {
        list.add(name);
    }
    public void add(int position, T name) {
        if (position > list.size() || position < 0) {
            return;
        } else {
            list.add(position, name);
        }
    }
    public int ingexOf(T name) {
        return list.indexOf(name);
    }
    public List<T> getList() {
        return list;
    }
    public static void main(String[] args) {
        MyClasss<String> list = new MyClasss<>();
        list.add("Щеглюк");
        System.out.println(list.getList());
        list.add(1, "Богдан");
        System.out.println(list.getList());
        System.out.println(list.ingexOf("Богдан"));
    }
}
