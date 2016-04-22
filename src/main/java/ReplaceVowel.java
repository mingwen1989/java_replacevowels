import java.util.ArrayList;
import java.util.HashMap;

public class ReplaceVowel {

  public static String runReplaceVowel(String userString) {

    HashMap<String, String> vowelLookUp = new HashMap<String, String>();
    vowelLookUp.put("a", "-");
    vowelLookUp.put("e", "-");
    vowelLookUp.put("i", "-");
    vowelLookUp.put("o", "-");
    vowelLookUp.put("u", "-");
    vowelLookUp.put("A", "-");
    vowelLookUp.put("E", "-");
    vowelLookUp.put("I", "-");
    vowelLookUp.put("O", "-");
    vowelLookUp.put("U", "-");

    char[] charArray = userString.toCharArray();
    String vowelOutput = new String();

    for (int i = 0 ; i < charArray.length ; i++) {
      String letters = Character.toString(charArray[i]);
      if ( vowelLookUp.get(letters) != null ) {
        vowelOutput += vowelLookUp.get(letters);
      } else {
        vowelOutput += letters;
      }
  } return vowelOutput;

  }
}
