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
}
