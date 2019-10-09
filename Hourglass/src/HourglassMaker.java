import java.util.*;
public class HourglassMaker {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What size hourglass do you want? ");
		int size = console.nextInt();
		int subtractCount = 2;
		firstAndLast(size);
		for (int line = 1; line <= size - 1; line++) {
			if (line <= size / 2) {
				for (int space = 1; space <= line; space++) {
					System.out.print(" ");
				}
			}
			else {
				for (int space = line - subtractCount; space >= 1; space--) {
					System.out.print(" ");
				}
				subtractCount += 2;
			}
			if (line < size / 2) {
				System.out.print("\\");
			}
			else if (line == size / 2){
				System.out.print("|");
			}
			else {
				System.out.print("/");
			}
			for (int colon = 1; colon <= Math.abs(-2 * line + size); colon++) {
				System.out.print(":");
			}
			if (line < size / 2) {
				System.out.println("/");
			}
			else if (line == size / 2){
				System.out.println("|");
			}
			else {
				System.out.println("\\");
			}
		}
		firstAndLast(size);
		console.close();
	}
	
	public static void firstAndLast(int size) {
		System.out.print("|");
		for (int quote = 1; quote <= size; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
}
