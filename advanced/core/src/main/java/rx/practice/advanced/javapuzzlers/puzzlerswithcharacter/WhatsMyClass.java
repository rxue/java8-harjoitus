package rx.practice.advanced.javapuzzlers.puzzlerswithcharacter;

import java.util.regex.Pattern;

/**
 * Puzzle 20: What's My Class
 * Key takeway: String.replaceAll takes a regular expression as its first parameter, not a literal sequence of characters
 */
public class WhatsMyClass {
    public static void main(String[] args) {
        System.out.println(WhatsMyClass.class.getName().replaceAll(".", "/") + ".class");
        System.out.println(WhatsMyClass.class.getName().replaceAll("\\.", "/") + ".class");
        System.out.println("Better solution is to use java.util.Pattern.quote (added in Java SE 5): " + WhatsMyClass.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");

    }
}
