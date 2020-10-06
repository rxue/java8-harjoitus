package rx.practice.api;

public class ValueObject {
    private final String value;
    public ValueObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
