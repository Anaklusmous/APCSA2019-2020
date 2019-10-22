import java.util.*;
public class ProcessingNumbers {
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you want to input?");
		int totalNum = userInput.nextInt();
		System.out.println("Enter the first number");
		int max = userInput.nextInt();
		int min = max;
		int maxEven = max;
		int evenSum = 0;
		boolean evenFound = false;
		if (max % 2 == 0) {
			maxEven = max;
			evenSum = max;
			evenFound = true;
		}
		int next = max;
		for (int i = 2; i <= totalNum; i++) {
			System.out.println("Enter the next number");
			next = userInput.nextInt();
			if (next > max) {
				max = next;
			}
			else if (next < min) {
				min = next;
			}
			if (next % 2 == 0) {
				evenSum += next;
				if (evenFound = false) {
					maxEven = next;
					evenFound = true;
				}
				if (next > maxEven) {
					maxEven = next;
				}
			}
		}
		userInput.close();
		if (evenFound == true) {
			System.out.println("min = " + min + ", max = " + max + ", max even number = " + maxEven + ", sum of even numbers = " + evenSum);
		}
		else {
			System.out.println("min = " + min + ", max = " + max + ". No even number found");
		}
	}
}
