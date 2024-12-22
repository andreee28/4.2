import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WordCountTest {

    @Test
    public void testLimaKata() {
        String input = "Nama Saya Andre    Johann Jonnius";
        int result = WordCount.wordCount(input);
        System.out.println("Hasil testLimaKata: " + result);
        assertEquals(5, result);
    }

    @Test
    public void testNolKata() {
        String input = "";
        int result = WordCount.wordCount(input);
        System.out.println("Hasil testNolKata: " + result);
        assertEquals(0, result);
    }

    @Test
    public void testTigaKata() {
        String input = "Nama      Saya Abdul";
        int result = WordCount.wordCount(input);
        System.out.println("Hasil testTigaKata: " + result);
        assertEquals(3, result);
    }
}
