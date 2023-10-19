import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("java");
        list.add("c#");
        list.add(1,"pyhton");

        list.forEach(data -> System.out.println(data));

    }
}