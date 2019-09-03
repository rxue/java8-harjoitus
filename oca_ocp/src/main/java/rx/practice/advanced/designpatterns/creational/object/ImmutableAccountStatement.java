package rx.practice.advanced.designpatterns.creational.object;

import java.util.Optional;

public class ImmutableAccountStatement {
    private String id;
    private String name;
    private ImmutableAccountStatement(Builder builder) {
        name = builder.name.orElse("xxxx");
    }
    public static class Builder {
        private Optional<String> name;
        public Builder() {
            name = Optional.empty();
        }
        public Builder setName(String name) {
            this.name = Optional.of(name);
            return this;
        }
    }
}
