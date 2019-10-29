/* Harrison Dong
 * October 21, 2019
 * Splits a string using the String.split() method
 */
import java.util.*;
public class Split {
	public static void main(String[] args) {
		//Testing
		String[] outputArray1 = "I like apples!".split(" ");
		System.out.println(Arrays.toString(outputArray1));
		String[] outputArray2 = "I really like really red apples!".split("really");
		System.out.println(Arrays.toString(outputArray2));
		String[] outputArray3 = "I really like really red apples!".split(" really ");
		System.out.println(Arrays.toString(outputArray3));
		String[] outputArray4 = "really I really like really red apples!".split("really");
		System.out.println(Arrays.toString(outputArray4));
		
		//Official code
		String sandwich1 = "applespineapplesbreadlettucetomatobaconmayohambreadcheese";
		String sandwich2 = "bread bread";
		System.out.println(Part1(sandwich1));
		System.out.println(Part2(sandwich2));
	}
	
	//Your task Part 1:

	/*Write a method that take in a string like

	* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

	* describing a sandwich.

	* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

	* the sandwich and ignores what's on the outside

	* What if it's a fancy sandwich with multiple pieces of bread?

	*/
public static String Part1(String sandwich) {
		if (sandwich.indexOf("bread") > 0) {
			String partSandwich = sandwich.substring(sandwich.indexOf("bread") + 5);
			if (partSandwich.indexOf("bread") > 0) {
				String[] sandwichContents = sandwich.split("bread");
				System.out.println(sandwichContents[1]);
				return sandwichContents[1];
			}
			else {
				System.out.println("Error: Not a sandwich");
			}
		}
		else {
			System.out.println("Error: Not a sandwich");
		}
		return "";
	}

	//Your task pt 2:

	/*Write a method that take in a string like

	* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

	* describing a sandwich

	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

	* the sandwich and ignores what's on the outside.

	* Again, what if it's a fancy sandwich with multiple pieces of bread?

	*/
public static String Part2(String sandwich) {
	String[] partSandwich = Part1(sandwich).split(" ");
	for (int i = 0; i < partSandwich.length; i++) {
		System.out.print(partSandwich[i]);
	}
	return "";
}
}
/*NOTES
 * split on bread
 * is there bread?
 * 	(get the index of bread)
 * 	make a substring after 1st bread
 * 	is there bread?
 * 		return [1]
 * 	else
 * 		not a sandwich
 * else
 * 	not a sandwich*/
