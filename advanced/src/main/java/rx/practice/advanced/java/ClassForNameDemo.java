package rx.practice.advanced.java;

public class ClassForNameDemo {
    static {
        System.out.println("load");
    }

    public static void main(String[] args) {
        try {
            String className = "rx.practice.advanced.java.ClassForNameDemo";
            Class.forName(className);
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
