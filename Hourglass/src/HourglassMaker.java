/*Harrison Dong
 * 10/29/19
 * Prints hourglass of any size, odd or even. Uses scanner for user input on size
 * All extra credit features attempted. Only 10 print statements*/
import java.util.*;
public class HourglassMaker { //main method calls first and last line methods and top and bottom half.
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String keepGoing = "";
		while(!keepGoing.equals("quit")) {
			System.out.print("What size hourglass do you want? "); //Hourglass size input
			int size = console.nextInt();
			firstAndLast(size);
			topHalf(size);
			bottomHalf(size);
			firstAndLast(size);
			System.out.print("Continue? Type \"quit\" to stop and \"y\" to continue. "); //Continue or not?
			keepGoing = console.next();
			keepGoing = keepGoing.toLowerCase();
		}
		console.close();
	}
	
	public static void firstAndLast(int size) {//prints both first and last line of hourglass
		System.out.print("|");
		for (int quote = 1; quote <= size; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void topHalf(double size) { //Prints the top half
		for (int line = 1; line <= (int)(size / 2 + .5); line++) {
			Spaces(line);
			if (line == (int)(size / 2 + .5)) {
				System.out.println("||");
			}
			else {
				Slashes("backward", false);//calls to other methods to reduce number of prints
				Colons(line, size);
				Slashes("forward", true);
		
			}
		}
	}
	public static void bottomHalf(double size) { //Prints the bottom half
		for (int line = (int)(size / 2 - .5); line >= 1; line--) {
			Spaces(line);
			Slashes("forward", false);//calls to other methods to reduce number of prints
			Colons(line, size);
			Slashes("backward", true);
		}
	}
	public static void Spaces(int line) {//Method in charge of printing the spaces before each line. Accepts line number value
		for (int space = 1; space <= line; space++) {
			System.out.print(" ");
		}
	}
	public static void Colons(int line, double size) { //Method in charge of printing the colons in each line.
		for (int colon = 1; colon <= -2 * line + size; colon++) {//Accepts line number value and size of hourglass.
			System.out.print(":");
		}
	}
	public static void Slashes(String forOrBack, boolean lastSlash) {//Method that prints each slash before and after each line
		String forSlash = "/";
		String backSlash = "\\";
		if (forOrBack == "forward") {
			if (lastSlash == true) { //If this is last slash of line, add new line
				forSlash += "\n";
			}
			System.out.print(forSlash);
		}
		else if (forOrBack == "backward") {
			if (lastSlash == true) { //If this is last slash of line, add new line
				backSlash += "\n";
			}
			System.out.print(backSlash);
		}
	}
}
