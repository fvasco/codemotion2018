package jug.java;

import javax.annotation.Nonnull;
import java.util.Objects;

public final class Train {

    private final int code;

    @Nonnull
    private final Type type;

    @Nonnull
    private final Ton weight;

    Train(final int code, @Nonnull final Type type, @Nonnull final Ton weight) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(weight);
        this.code = code;
        this.type = type;
        this.weight = weight;
    }

    public final int getCode() {
        return this.code;
    }

    @Nonnull
    public final Type getType() {
        return this.type;
    }

    @Nonnull
    public final Ton getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return code == train.code &&
                type == train.type &&
                Objects.equals(weight, train.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, weight);
    }

    @Override
    public String toString() {
        return "Train{" +
                "code=" + code +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
