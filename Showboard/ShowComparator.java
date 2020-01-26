package Showboard;

import java.util.Comparator;

public class ShowComparator implements Comparator<Show> {
    public int compare(Show show1, Show show2) {
        if (show1.getPopularityIndex() < show2.getPopularityIndex()) {
            return -1;
        }
        if (show1.getPopularityIndex() == show2.getPopularityIndex()) {
            return 0;
        }
        return 1;


    }
}
