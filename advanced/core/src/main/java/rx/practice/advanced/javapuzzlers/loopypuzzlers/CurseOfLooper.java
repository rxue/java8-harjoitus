package rx.practice.advanced.javapuzzlers.loopypuzzlers;

public class CurseOfLooper {
    public static void main(String[] args) {
        Integer i = new Integer(0);
        Integer j = new Integer(0);
        while(i<=j && j>=i && i != j) {
            System.out.println("endless :D");
        }
    }
}
