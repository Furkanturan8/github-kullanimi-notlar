import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // elementler artan sırayla sıralanıyor ve null kabul etmez

        TreeSet tree = new TreeSet();

        tree.add(10);
        tree.add(1);
        tree.add(5);
        tree.add(7);
        tree.add(11);
        tree.add(10); // eklesen bile kabul etmez çünkü set'lerde gruplama gibi bir tane aynı değerden olması kafi! Kısaca tekrarlanan verilere izin yok!

        try{
            tree.add(null); // hata verir
        }catch (Exception e){
            System.out.println(e.toString());
        }

        tree.forEach(data -> System.out.println(data)); // 1 5 7 10 11


    }
}