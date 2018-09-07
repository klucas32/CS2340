package edu.gatech.oad.antlab.person;

import java.util.Random;

/**
 * A simple class for person 2
 * <p>
 * returns their name and a
 * <p>
 * modified string
 *
 * @author Bob
 * @version 1.1
 */

public class Person2 {

    /**
     * Holds the persons real name
     */

    private String name;

    /**
     * The constructor, takes in the persons
     * <p>
     * name
     *
     * @param pname the person's real name
     */

    public Person2(String pname) {

        name = pname;

    }

    /**
     * This method should take the string
     * <p>
     * input and return its characters in
     * <p>
     * random order.
     * <p>
     * given "gtg123b" it should return
     * <p>
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */

    private String calc(String input) {
        // Person 2 put your implementation here
        String output = "";
        while (input.length() != 0) {
            if (input.length() <= 1) {
                output += input;
                input = "";
            } else {
                int randomNumber = new Random().nextInt(input.length() - 1);
                output += input.charAt(randomNumber);
                if (randomNumber == 0) {
                    input = input.substring(1);
                } else if (randomNumber == input.length() - 1){
                    input = input.substring(0, input.length() - 1);
                }else{
                    input = input.substring(0, randomNumber) + input.substring(randomNumber + 1);
                }
            }
        }
        return output;
    }

    /**
     * Return a string rep of this object
     * <p>
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     * <p>
     * object
     */
    public String toString(String input) {
        return name + calc(input);
    }
}