public class Result {
    private int max;
    private int min;
    private long count;

    public Result(int max, int min, long count) {
        this.max = max;
        this.min = min;
        this.count = count;
    }

    public int getMax() { return max; }
    public int getMin() { return min; }
    public long getCount() { return count; }
}

