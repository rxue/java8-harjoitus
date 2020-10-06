package rx.practice.advanced.transmodule;

import rx.practice.api.ValueObject;

public class ApiModuleCall {
    public static void main(String[] args) {
        ValueObject o = new ValueObject("value");
        System.out.println(o.getValue());
    }
}
