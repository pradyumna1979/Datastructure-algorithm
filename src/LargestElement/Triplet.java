package LargestElement;

public class Triplet<u,v,w> {
    private final u  first;
    private final v  second;
    private final w  third;
    public Triplet(u first, v second,w third) {
        this.first=first;
        this.second=second;
        this.third = third;
    }

    public u getFirst() {
        return first;
    }

    public v getSecond() {
        return second;
    }

    public w getThird() { return third;}

    @Override
    public String toString() {
        return "Triplet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
