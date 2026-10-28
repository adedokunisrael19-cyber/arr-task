import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestSentenceTest {

    @Test
    public void testThatShortestWordIsAde() {
        String expected = "ade";
        String statement = "ade such very amazing";
        String actual = ShortestSentence.getShortestWord(statement);
        assertEquals(expected, actual);
    }


    @Test
    public void testThatPickthefirstShortestWord() {
        String expected = "such";
        String statement = "such very amazing";
        String actual = ShortestSentence.getShortestWord(statement);
        assertEquals(expected, actual);
    }
}