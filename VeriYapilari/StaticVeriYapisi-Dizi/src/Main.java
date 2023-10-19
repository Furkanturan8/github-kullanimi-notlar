public class Main {
    public static void main(String[] args) {

        Dizi d = new Dizi(10);
        d.yazdir();

        d.ekle(5);
        d.ekle(6);
        d.ekle(3);
        d.ekle(2);
        d.ekle(9);
        d.ekle(100);
        d.ekle(99);
        d.ekle(60);

        d.yazdir();

        System.out.println("Aradığınız elemanın indisi: "+d.arama(99));

        d.sil(9);

        d.yazdir();
        System.out.println("------------------------------------------");

        Dizi d2 = new Dizi(10);

        System.out.print("İlk Durum: ");
        d2.yazdir();

        d2.siraliEkle(10);
        d2.siraliEkle(100);
        d2.siraliEkle(8);
        d2.siraliEkle(20);
        d2.siraliEkle(11);
        d2.siraliEkle(24);
        d2.siraliEkle(101);
            System.out.print("Eklendi: ");
                d2.yazdir();

            System.out.print("Güncellendi: ");
                d2.siraliGuncelle(8,23);
                d2.yazdir();

            System.out.print("Silindi: ");
                d2.sil(11);
                d2.yazdir();

        System.out.println("Aradığınız elemanın indisi: "+d2.arama(24));
    }
}