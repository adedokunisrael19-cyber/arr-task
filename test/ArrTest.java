import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrTest {

    @Test
    public void testThatTheSquareIsReturned(){
        int[] arr = {1,5,3,2,4};
        int[] expected ={1,4,9,16,25};
        int[] actual = Arr.sortedNumbers(arr);
        assertArrayEquals(expected, actual);
    }

}