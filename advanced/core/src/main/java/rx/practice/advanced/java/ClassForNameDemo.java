package rx.practice.advanced.java;

public class ClassForNameDemo {

    public static void main(String[] args) {

        String className = "rx.practice.advanced.java.Person";
        try {
            Class.forName(className);
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Class.forName(className);

    }
}
