package rx.practice.advanced.generictype;

public interface Processor<T extends CharSequence> {

    void preValidate(T x);
    T process(T x);

    static Processor get(CharSequence n) {
        if (n instanceof String)
            return new StringProcessor();
        throw new IllegalArgumentException();
    }

}
