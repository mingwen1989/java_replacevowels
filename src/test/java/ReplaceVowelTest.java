import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ReplaceVowelTest {

  @Test
  public void calculateNumber_vowelOutput_basic() {
    ReplaceVowel replaceVowel = new ReplaceVowel();
    String expected = "h-ll-";
    assertEquals(expected, replaceVowel.runReplaceVowel("hello"));
  }

  @Test
  public void calculateNumber_vowelOutput_moderate() {
    ReplaceVowel replaceVowel = new ReplaceVowel();
    String expected = "H-ll-, - -m h-ppy.";
    assertEquals(expected, replaceVowel.runReplaceVowel("Hello, I am happy."));
  }

  @Test
  public void calculateNumber_vowelOutput_long() {
    ReplaceVowel replaceVowel = new ReplaceVowel();
    String expected = "B-l--v- y-- c-n -nd y--'r- h-lfw-y th-r-. Th--d-r- R--s-v-lt";
    assertEquals(expected, replaceVowel.runReplaceVowel("Believe you can and you're halfway there. Theodore Roosevelt"));
  }
}
