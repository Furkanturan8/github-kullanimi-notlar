import java.util.Iterator;

public class HashSet {
    public static void main(String[] args) {

        /* HashSet : hashleyerek bellek sırasına sıralar. f(x) = 2x * x * mod7 ye göre bellekte sıralama yapsın

        Java’da küme(set) arayüzünün en önemli özelliği veri tekrarına izin vermeyerek uniqe elemanlar üretmemize olanak sağlıyor olmasıdır.
        Ek olarak List arayüzü gibi doğrudan index erişimine izin vermez fakat ilk ve son elemanına doğrudan erişebiliriz.
        Ayrıca null değerli elemanlar içerebilir, içerdiği null değerleri eşsiz hashcode ile barındırır.
        HashSet arayüzü verileri düzensiz sıralar, performans olarak tasarruf etmenizi sağlar.
        */
        java.util.HashSet h = new java.util.HashSet<>();

        h.add(19);
        h.add("12 String");
        h.add(false);
        h.add(12.0);
        h.add(null);

        System.out.println("Boyutu : " + h.size());
        System.out.println("12.0 Var mı?(h.contains) : " + h.contains(12.0));
        Iterator itr = h.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        // h.forEach (item -> System.out.println(item + " ")); yukarıdaki ile aynı


    }
}