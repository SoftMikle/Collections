package Showboard;

import java.util.*;


public class ShowBoard {
    private List<Show> showBoard = new ArrayList<Show>();
    private ListIterator<Show> listIterator;
    private int compareMode;

    public ShowBoard() {
    }

    public ShowBoard(int n, int compareMode) {
        this.compareMode = compareMode;
        Scanner scanner = new Scanner(System.in);
        String showName;
        Double showRating;
        System.out.println("Enter " + n + " names of Shows and their rating:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of Show");
            showName = scanner.nextLine();
            System.out.println("Enter the rating of Show in 0.0 to 10.0 format");
            showRating = scanner.nextDouble();
            scanner.nextLine();
            showBoard.add(new Show(showName, showRating));
        }
    }

    public ShowBoard(List<Show> showBoard, int compareMode) {
        this.compareMode = compareMode;
        this.showBoard = showBoard;
    }

    public void setShowBoard(List<Show> showBoard) {
        this.showBoard = showBoard;
    }

    public Show getFirst(){
        if(compareMode >= 0){
            showBoard.sort(new ShowComparator());
        } else {
            showBoard.sort(new ShowComparator().reversed());
        }
        listIterator = showBoard.listIterator();
        if (!listIterator.hasNext()) throw new IndexOutOfBoundsException();
        return listIterator.next();
    }

    public void getShowBoardFromMax() {
        if(showBoard.size() < 1) throw new IllegalStateException();
        showBoard.sort(new ShowComparator().reversed());
        listIterator = showBoard.listIterator();
        Show show = new Show("", 0.0);
        while (listIterator.hasNext()){
            show = listIterator.next();
            System.out.println(show.getName() + " - " + show.getPopularityIndex());
        }
    }

    public void getShowBoardFromMin() {
        if(showBoard.size() < 1) throw new IllegalStateException();
        showBoard.sort(new ShowComparator());
        listIterator = showBoard.listIterator();
        Show show = new Show("", 0.0);
        while (listIterator.hasNext()){
            show = listIterator.next();
            System.out.println(show.getName() + " - " + show.getPopularityIndex());
        }
    }

    public int getCompareMode() {
        return compareMode;
    }

    public void setCompareMode(int compareMode) {
        this.compareMode = compareMode;
    }
}
