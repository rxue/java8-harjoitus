package rx.practice.advanced.designpatterns.immutable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
    protected String id;
    private String lastName;
    private String firstName;
    public String getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("lastName", lastName)
                .append("firstName", firstName)
                .toString();
    }
}
