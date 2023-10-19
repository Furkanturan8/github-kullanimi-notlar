import java.util.Arrays;

public class Stack1 {
    int [] stack;
    int es; //eleman sayisi

    public Stack1(int boyut){
        stack = new int[boyut];
        es = 0;
    }




    public void push(int a){
        if(es == stack.length)
            System.out.println("Yığıt dolu!");
        else
            stack[es++] = a; // eleman eklendi
    }

    public int pop(){
        int r = stack[es-1];

        stack[--es] = 0; // kuyruktaki son elemanı 0 yaptık
        return r;
    }

    public void yazdir(){
        System.out.println(Arrays.toString(stack));
    }

}


