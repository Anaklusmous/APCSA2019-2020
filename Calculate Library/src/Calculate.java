/*Harrison Dong
 * August 29th, 2019 4th Period
 * Group of Methods that Perform Math Calculations (a library)*/
public class Calculate {
	//PART 1
	
	//A call to square returns the square of the value passed.
	//It accepts and returns an integer
	public static int square(int number) {
		int answer = number * number;
		return answer;	
	}
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = number * number * number;
		return answer;	
	}
	//A call to average returns the average of the two values passed.
	//It accepts 2 doubles and returns one double.
	public static double average(double number1, double number2) {
		double answer = (number1 + number2) / 2;
		return answer;
	}
	//A call to average returns the average of the three values passed.
	//It accepts three doubles and returns one double.
	public static double average(double number1, double number2, double number3) {
		double answer = (number1 + number2 + number3) / 3;
		return answer;
	}
	//A call to toDegrees converts a radian value to a degree value.
	//It accepts and returns a double.
	public static double toDegrees(double number) {
		double answer = number * (180 / 3.14159);
		return answer;
	}
	//A call to toRadians converts a degree value to a radian value.
	//It accepts and returns a double.
	public static double toRadians(double number) {
		double answer = number * (3.14159 / 180);
		return answer;
	}
	/*A call to discriminant calculates the discriminant of the coefficients of a standard 
	  quadratic equation.*/
	//It accepts 3 doubles and returns 1 double.
	public static double discriminant(double a, double b, double c) {
		double answer = (b * b) - (4 * a * c);
		return answer;
	}
	//A call to toImproperFrac converts a mixed number to an Improper Fraction.
	//It accepts 3  integers and returns a string.
	public static String toImproperFrac(int whole, int num, int den) {
		int improperNum = den * whole + num;
		String answer = improperNum + "/" + den;
		return answer;
	}
	//A call to toMixedNum converts an improper fraction to a mixed number.
	//It accepts 2 integers and returns a string.
	public static String toMixedNum(int num, int den) {
		int whole = num / den;
		num %= den;
		String answer = whole + "_" + num + "/" + den;
		return answer;
	}
	//A call to foil multiplies two binomials to convert it into standard form
	//It accepts 4 integers and 1 string and returns a string
	public static String foil(int a, int b, int c, int d, String var) {
		int A = a * c;
		int B = b * c + a * d;
		int C = b * d;
		String answer = A + var + "^2 + " + B + var + " + " + C;
		return answer;
	}
	
	//PART 2
	
	//A call to isDivisibleBy etermines whether one number is divisible by another
	//Accepts 2 integers and returns a boolean
	public static boolean isDivisibleBy(int bigger, int smaller) {
		if (bigger % smaller == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	//A call to absValue determines the absolute value of a number
	//Accept 1 double and returns 1 double
	public static double absValue(double number) {
		if (number < 0) {
			return number * -1;
		}
		else {
			return number;
		}
	}
}
