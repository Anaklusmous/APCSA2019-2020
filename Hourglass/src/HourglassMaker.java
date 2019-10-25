import java.util.*;
public class HourglassMaker {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String keepGoing = "";
		while(!keepGoing.equals("quit")) {
			System.out.print("What size hourglass do you want? ");
			int size = console.nextInt();
			firstAndLast(size);
			topHalf(size);
			bottomHalf(size);
			firstAndLast(size);
			System.out.print("Continue? Type \"quit\" to stop and \"y\" to continue. ");
			keepGoing = console.next();
			keepGoing = keepGoing.toLowerCase();
		}
		console.close();
	}
	
	public static void firstAndLast(int size) {
		System.out.print("|");
		for (int quote = 1; quote <= size; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void topHalf(double size) {
		for (int line = 1; line <= (int)(size / 2 + .5); line++) {
			for (int space = 1; space <= line; space++) {
				System.out.print(" ");
			}
			if (line == (int)(size / 2 + .5)) {
				System.out.println("||");
			}
			else {
				System.out.print("\\");
				for (int colon = 1; colon <= -2 * line + size; colon++) {
					System.out.print(":");
				}
				System.out.println("/");
		
			}
		}
	}
	public static void bottomHalf(double size) {
		for (int line = (int)(size / 2 - .5); line >= 1; line--) {
			for (int space = 1; space <= line; space++) {
				System.out.print(" ");
			}
				System.out.print("/");
				for (int colon = 1; colon <= -2 * line + size; colon++) {
					System.out.print(":");
				}
				System.out.println("\\");
		}
	}
}
