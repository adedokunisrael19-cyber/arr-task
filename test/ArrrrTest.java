import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrrrTest {

    @Test
    public void testThatTheSquareIsReturned(){
        int[] arr = {3,2,7,1,4};
        int[] expected ={1,4,9,16,49};
        int[] actual = Arr.sortedNumbers(arr);
        assertArrayEquals(expected, actual);
    }

}