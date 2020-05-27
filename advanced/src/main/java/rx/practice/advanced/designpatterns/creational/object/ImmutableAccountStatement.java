package rx.practice.advanced.designpatterns.creational.object;

import java.util.Optional;

public class ImmutableAccountStatement {
    private final String id;
    private final String name;
    private ImmutableAccountStatement(Builder builder) {
        id = builder.id;
        name = builder.name.orElse("");
    }
    public static class Builder {
        private final String id;//required
        private Optional<String> name;
        public Builder(String id) {
            this.id = id;
            name = Optional.empty();
        }
        public Builder setName(String name) {
            this.name = Optional.of(name);
            return this;
        }
    }
}
