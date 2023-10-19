import java.util.Arrays;

public class Dizi {

    int [] dizi;
    int es; // eleman sayisi

    public Dizi(int boyut){
        dizi = new int[boyut];
        es=0;
    }


    public void ekle(int a){
        if(es>=dizi.length){
            System.out.println("Dizi dolu!");
        }else {
            dizi[es++] = a;
        }
    }

    public void siraliEkle(int a){
        if(es>= dizi.length)
            System.out.println("Dizi Dolu!");
        else {
            int i = 0;
            for(i= (es-1) ; i>=0 && dizi[i]> a ; i--){
                dizi[i+1] = dizi[i];
            }
            dizi[i+1] = a;
            es++;
        }
    }

    public void siraliGuncelle(int eski, int yeni){
        sil(eski);
        siraliEkle(yeni);
    }

    public int arama(int a){
        for(int i=0; i<es; i++){
            if(dizi[i] == a)
                return i;
        }
        return -1;
    }
    public void sil(int a){
        int indis = this.arama(a);

        if(indis == -1)
            System.out.println("Silmek İstediğiniz Eleman Yok");
        else {
            for(int i=indis; i<es-1; i++){
                dizi[i]=dizi[i+1];
            }
            dizi[--es] = 0; // eleman sayisini azalttık kalan boş kısımlar 0 a atandı!
        }
    }

    public void guncelle(int eski, int yeni){
        int indis = this.arama(eski);
        if(indis == -1)
            System.out.println("Güncellemek istediğiniz eleman yok");
        else {
            dizi[indis]= yeni;
        }

    }

    public void yazdir(){
       // System.out.println(Arrays.toString(dizi));
        System.out.print("[");
        for(int i=0; i<dizi.length; i++)
            System.out.print(dizi[i] + ", ");

        System.out.print("]\n");
    }


}
