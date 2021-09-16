package rx.practice.advanced.javapuzzlers.expressivepuzzlers;

public class Tweedledum {
    public static void main(String[] args) {
        short x = 0;
        int i = 123456;
        x += i; // Contains a hidden cast, x = x + i won't compile
        System.out.println(x);
    }
}
