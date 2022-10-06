package rx.practice.advanced.effectivejava.generalprogramming;

import java.util.Comparator;

class PreferPrimitiveTypesToBoxedPrimitives {
    static Comparator<Integer> incorrectNaturalOrder = (i,j) -> (i<j) ? -1 : (i == j ? 0 : 1);
    public static void main(String[] args) {
        System.out.println("Result is expected to be 0, but actual result is " + incorrectNaturalOrder.compare(42, 42));
        System.out.println("Result is expected to be 0, but actual result is " + incorrectNaturalOrder.compare(150,150));
    }

}
