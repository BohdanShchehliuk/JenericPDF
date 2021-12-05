package Additional;

public class MyClass <T>{
   public static < T> void factoryMethod(T t) {
System.out.println(t.toString());
   }
    public static void main(String[] args) {
        factoryMethod(new Double(3.14)); // Нічого не зрозумів)
    }
}
