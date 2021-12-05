package Task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MyDictionary<Tkey, Tvalue> {
    Map<Tkey, Tvalue> list = new HashMap<Tkey, Tvalue>();
    public void add(Tkey key, Tvalue tvalue) {
        list.put(key, tvalue);
    }
    public Tvalue indexOf(Tkey key) {
        return list.get(key);
    }

    public int size() {
        return list.size();
    }

    public <Tkey, Tvalue> void show() {
        list.toString();
    }
    public static void main(String[] args) {
        MyDictionary<String, Integer> list = new MyDictionary<>();
        list.add("Bohdan", 5);
        list.add("Sanya", 33);
        list.add("Vasya", 51);
        list.add("Oleg", 25);
        System.out.println(list.size());
        System.out.println(list.indexOf("Sanya"));
    }
}
