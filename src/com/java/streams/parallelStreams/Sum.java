package src.com.java.streams.parallelStreams;

public class Sum {
    
    private int total;

    public Sum(int total) {
        this.total = total;
    }

    public void add(int value) {
        total += value;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
