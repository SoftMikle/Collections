package Showboard;

public class Show implements Comparable<Show> {
    private String name;
    private Double popularityIndex;

    public Show(String name, Double popularityIndex) {
        this.name = name;
        if (popularityIndex < 0 || popularityIndex > 10.0) throw new IllegalArgumentException();
        this.popularityIndex = popularityIndex;
    }

    public String getName() {
        return name;
    }

    public Double getPopularityIndex() {
        return popularityIndex;
    }

    public void setPopularityIndex(Double popularityIndex) {
        this.popularityIndex = popularityIndex;
    }

    @Override
    public String toString() {
        return "Show " + getName() + " has " + getPopularityIndex() + " rating";
    }

    public int compareTo(Show show) {
        return this.popularityIndex.compareTo(popularityIndex);
    }
}
