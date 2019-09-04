/*Harrison Dong
 * August 29th, 2019 4th Period
 * Group of Methods that Perform Math Calculations (a library)*/
public class Calculate {
	//A call to square returns the square of the value passed.
	//It accepts and returns an integer
	public static int square(int number) {
		int answer = 0;
		answer = number * number;
		return answer;	
	}
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number * number * number;
		return answer;	
	}
	//A call to average returns the average of the values passed.
	//It accepts and returns a double.
	public static double average(double number1, double number2) {
		double answer = 0;
		answer = (number1 + number2) / 2;
		return answer;
	}
}
