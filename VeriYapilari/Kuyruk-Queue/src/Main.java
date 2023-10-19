
public class Main {
    public static void main(String[] args) {

        //Queue s = new Queue(10);
        Stack1 s = new Stack1(10);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);

        s.yazdir();

        s.pop();
        s.yazdir();
        s.pop();
        s.yazdir();
    }

}