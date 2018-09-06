package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string
 *
 *  @author Bob
 *  @author Katia Lucas
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
  /**
   * The constructor, takes in the persons
   * name
   * @param pname the person's real name
   */
  public Person4(String pname) {
    name = pname;
  }
  /**
   * This method should return a string
   * where each character is 1 greater
   * than its previous value.  So
   * given "abc123" it should return
   * "bcd234".
   *
   * @param input the string to be modified
   * @return the modified string
   */
  private String calc(String input) {
    String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    String[] inputArray = new String[input.length()];
    int counter = 0;

    for (char current : input.toCharArray()) {
      inputArray[counter] = String.valueOf(current);
      counter++;
    }

    String output = "";
    String newLetter = "";
    String newNumber  = "";

    for (String current : inputArray) {
      if (current.matches("[a-z]")) {
        for (int i = 0; i < alphabet.length; i++) {
          if (current.equalsIgnoreCase("z")) {
            newLetter = "a";
            output += newLetter;
            break;
          } else if (current.equalsIgnoreCase(alphabet[i])) {
            newLetter = alphabet[i + 1];
            output += newLetter;
          }
        }
      } else if (current.matches("[0-9]")) {
        int newValue = Integer.valueOf(current);

        if (current.equalsIgnoreCase("9")) {
          newNumber = "0";
          output += newNumber;
        } else {
          newValue += 1;
          newNumber = String.valueOf(newValue);
          output += newNumber;
        }
      }
    }
    return output;
  }

  /**
   * Return a string rep of this object
   * that varies with an input string
   *
   * @param input the varying string
   * @return the string representing the
   *         object
   */
  public String toString(String input) {
    return name + calc(input);
  }
}

