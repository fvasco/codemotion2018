package jug.java;

import javax.annotation.Nonnull;
import java.util.Objects;

public final class Ton {
    private final int mass;

    public Ton(int mass) {
        this.mass = mass;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ton ton = (Ton) o;
        return mass == ton.mass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass);
    }

    public int getMass() {
        return mass;
    }

    @Nonnull
    public Ton plus(final Ton other) {
        return new Ton(mass + other.mass);
    }

    @Override
    public String toString() {
        return Integer.toString(mass) + " ton";
    }
}
