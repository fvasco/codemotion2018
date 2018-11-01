package jug.java;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Company {

    @Nonnull
    private final String name;

    @Nonnull
    public static IntStream getCodes() {
        return IntStream.range(1_000, 50_001);
    }

    public Company(@Nonnull String name) {
        Objects.requireNonNull(name);
        if (name.isEmpty()) {
            throw new IllegalArgumentException(("Empty name"));
        }
        this.name = name;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public Stream<Train> getTrains() {
        return getCodes().mapToObj((code) -> Util.makeTrain(this, code));
    }
}
