package LargestElement;

public class Pair<u,v> {
    private final u  first;
    private final v  second;
    public Pair(u first,v second) {
        this.first=first;
        this.second=second;
    }

    public u getFirst() {
        return first;
    }

    public v getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
