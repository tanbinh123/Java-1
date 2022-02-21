/*
 * Exceptions are basically "Exceptional Events";
 * Creating an exception object and handing it to the runtime system is called throwing an exception.
 * Problem Occurs -> Exception created -> e thrown -> e handled;
 */

package main.com.exceptions;

public class BasicException {
    public static void main(String[] args) {
        int a = Integer.parseInt("102");
        System.out.println(a);

        try {
            // code for situation that might cause any problem
            int b = Integer.parseInt("Pants");
            System.out.println(b);
        } catch (Exception e) {
            // Exception that will be printed once the error (exception) is generated;
            System.out.println("Hey, I cannot do this man!");
        }
        // Finally will always run, no matter if the code goes to 'try' or it goes to 'catch';
        // Even if the 'try' had a 'return' statement; 'Finally' will always run;
        finally {
            System.out.println("I am finally; I always run!");
        }
        System.out.println(magicOfReturn());
    }

    public static int magicOfReturn() {
        // Finally will always override the code block in 'try' block;
        try {
            return 3;
        }
        catch (Exception e) {
            return 4;
        }
        finally {
            return 5;
        }
    }
}
