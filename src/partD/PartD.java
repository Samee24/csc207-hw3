package partD;

public class PartD
{
  
  /**
   * Produces a rhyme with a fixed structure based on the 
   * input name.
   */
  
  public static String nameGame(String name)
  {

    int i = 0;
    int j = 0;
    char letter;
    char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

    // Loop through the characters in the strings.
    while (j == 0)
      {
        i++; // Skip the first character.
        // Check if the character is equal to a vowel.
        // Break if true and exit the while loop.
        for (int k = 0; k <= 4; k++)
          {
            letter = name.charAt(i);
            if (letter == vowels[k])
              {
                j = 1;
                break;
              }
          }
      } // End while loop
    
    // Get the rest of the string starting from the vowel.
    String turtle = name.substring(i);
    
    // Concatenate strings and produce the rhyme.
    String rhyme =
        name + "!" + "\n" + name + ", " + name + " bo B" + turtle
            + " Bonana fanna fo F" + turtle + "\nFee fy mo M" + turtle + ", "
            + name + "!\n";
    System.out.print(rhyme);
    return rhyme;
  } // End nameGame(String name)
} // End class Part D


// Citations 
// http://www.tutorialspoint.com/java/java_string_substring.htm
// http://stackoverflow.com/questions/11229986/get-string-character-by-index-java
