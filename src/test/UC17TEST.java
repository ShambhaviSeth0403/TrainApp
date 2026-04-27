import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UC17TEST {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        assertArrayEquals(expected, UC17.sortBogieNames(arr));
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        assertArrayEquals(expected, UC17.sortBogieNames(arr));
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};
        String[] expected = {"AC Chair","First Class","General"};

        assertArrayEquals(expected, UC17.sortBogieNames(arr));
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        assertArrayEquals(expected, UC17.sortBogieNames(arr));
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};
        String[] expected = {"Sleeper"};

        assertArrayEquals(expected, UC17.sortBogieNames(arr));
    }
}