package rx.practice.ocakasi.modifier;

public class StaticIsLoadedBeforeNonStatic {
    static {
        System.out.println("I am in the static block, so I should be the first to be printed");
    }
    {
        System.out.println("I am in the non-static block, so I will always be loaded after the static block");
    }
    public static void main(String[] args) {
        StaticIsLoadedBeforeNonStatic test = new StaticIsLoadedBeforeNonStatic();
    }
}
