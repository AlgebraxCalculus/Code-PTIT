public class Pair implements Comparable<Pair> {
    private int first, second;
    public Pair (int first, int second) {
        this.first = first;
        this.second = second;
    }
    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }
    @Override
    public int compareTo(Pair o) {
        if (first == o.first) {
            return second - o.second;
        }
        return first - o.first;
    }
}
