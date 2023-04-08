package array;

public class Triplet<S>{
    private S first;
    private S second;
    private S third;

    public Triplet(S first, S second, S third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public S getThird() {
        return third;
    }

    public void setThird(S third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
