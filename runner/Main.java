package runner;

import Showboard.Show;
import Showboard.ShowBoard;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Show> shows = new ArrayList<>();

        shows.add(new Show("American Crime history", 9.5));
        shows.add(new Show("Judgement time", 4.4));
        shows.add(new Show("Big Wash", 3.2));
        shows.add(new Show("Windows", 4.4));
        shows.add(new Show("House 2", 0.3));

        ShowBoard showBoard = new ShowBoard();
        showBoard.setShowBoard(shows);
        showBoard.getShowBoardFromMax();
        System.out.println();
        showBoard.getShowBoardFromMin();


    }
}