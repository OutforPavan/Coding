package practice.streams;

import java.util.Objects;

/** Result type for problem 73. */
public final class AgeExtremes {
    private final Employee youngest;
    private final Employee oldest;

    public AgeExtremes(Employee youngest, Employee oldest) {
        this.youngest = Objects.requireNonNull(youngest, "youngest");
        this.oldest = Objects.requireNonNull(oldest, "oldest");
    }

    public Employee getYoungest() { return youngest; }
    public Employee getOldest() { return oldest; }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof AgeExtremes)) return false;
        AgeExtremes that = (AgeExtremes) other;
        return youngest.equals(that.youngest) && oldest.equals(that.oldest);
    }

    @Override
    public int hashCode() { return Objects.hash(youngest, oldest); }

    @Override
    public String toString() { return "AgeExtremes{youngest=" + youngest + ", oldest=" + oldest + "}"; }
}
