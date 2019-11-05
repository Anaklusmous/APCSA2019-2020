package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner console = new Scanner(System.in);
    	String stop = "";
    	String expression = "";
    	while (!stop.equals("quit")) {
    		System.out.println("Input your expression");
    		expression = console.nextLine();
    		System.out.println(produceAnswer(expression));
    		System.out.println("Continue? Enter \"quit\" to quit and \"y\" to continue");
    		stop = console.nextLine();
    	}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] fracOpFrac = input.split(" ");
        return fracOpFrac[2];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}