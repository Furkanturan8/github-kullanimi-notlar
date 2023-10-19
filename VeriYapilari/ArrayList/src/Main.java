import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList country = new ArrayList();

        country.add("Bursa");
        country.add("İstanbul");
        country.add("Bursa");
        country.add("İzmir");

        country.add(0,"Denizli"); // indexe göre

        country.remove(4); // izmir silinir

        country.forEach(data -> System.out.println(data));

    }
}