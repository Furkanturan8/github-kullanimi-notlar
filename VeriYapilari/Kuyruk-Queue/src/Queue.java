import java.util.Arrays;

public class Queue {

    int [] queue;
    int es; //eleman sayisi

    public Queue(int boyut){
        queue = new int[boyut];
        es = 0;
    }

    public void push(int a){
        if(es == queue.length)
            System.out.println("Kuyruk dolu!");
        else
            queue[es++] = a; // eleman eklendi
    }

    public int pop(){
        int r = queue[0];

        for (int i = 0; i<es-1; i++){
            queue[i] = queue[i+1]; // sola kaydırdık elemanları
        }
        queue[--es] = 0; // kuyruktaki son elemanı 0 yaptık
        return r;
    }

    public void yazdir(){
        System.out.println(Arrays.toString(queue));
    }

}
