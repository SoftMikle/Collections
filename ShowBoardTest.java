package tests;

import Showboard.Show;
import Showboard.ShowBoard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShowBoardTest {

    ShowBoard showBoard;
    @Before
    public void init(){
        List<Show> list = new ArrayList<>();
        list.add(new Show("American crime history", 8.65));
        list.add(new Show("The Apprentice", 9.83));
        list.add(new Show("American most smartest model", 7.96));
        list.add(new Show("Дом 2", 3.31));
        showBoard = new ShowBoard(list, 1);
    }

    @Test
    public void testIterationForward(){
        System.out.println(showBoard.getFirst().getPopularityIndex());
        Assert.assertEquals(3.31, showBoard.getFirst().getPopularityIndex(), 0.01);
    }

    @Test
    public void testIterationBackward(){
        showBoard.setCompareMode(-1);
        System.out.println(showBoard.getFirst().getPopularityIndex());
        Assert.assertEquals(9.83, showBoard.getFirst().getPopularityIndex(), 0.01);
    }

}
