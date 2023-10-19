import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /* element() : Kuyruğun başındaki veriyi verir, ama onu kuyruktan atmaz.
           offer(E e) : Mümkünse verilen veriyi kuyruğa ekler.
           peek() : Kuyruğun başındaki veriyi verir ama onu kuyruktan atmaz. Elementten farkı ise boş olduğunda hata vermeyip null döndürmesidir.
           remove() : Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar.
        */

        Queue q = new LinkedList();

        q.add("Furkan");
        q.add("Yusuf");
        q.offer("Kerem");
        q.offer("Sena");

        q.forEach(data -> System.out.println(data));

        System.out.println("remove() : " + q.remove());
        System.out.println("element() : " + q.element());
        System.out.println("peek() : " + q.peek());

        q.forEach(data -> System.out.println(data));

    }
}