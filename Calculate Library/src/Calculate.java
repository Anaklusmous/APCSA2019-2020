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
		return whole + "_" + num + "/" + den;
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
	
	//A call to isDivisibleBy determines whether one number is divisible by another
	//Accepts 2 integers and returns a boolean
	public static boolean isDivisibleBy(int mainNum, int factor) {
		if (factor < 0) {
			throw new IllegalArgumentException("factor must be greater than 0"); 
		}
		if (mainNum % factor == 0) {
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
	//A call to max determines the the maximum out of two doubles
	//Accept 2 doubles and returns 1 double
	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	//A call to max determines the the maximum out of three doubles
	//Accept 3 doubles and returns 1 double
	public static double max(double num1, double num2, double num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		}
		else if (num2 > num1 && num2 > num3){
			return num2;
		}
		else {
			return num3;
		}
	}
	//A call to min determines the the smallest out of two integers
	//Accept 2 integers and returns 1 integer
	public static int min(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	//A call to round2 rounds a double to 2 decimal places
	//Accept 1 double and returns a double
	public static double round2(double number) {
		number = (number * 100);
		if (number < 0) {
			number = (number - 0.5);
			number = (int)number;
		}
		else {
			number = (number + 0.5);
			number = (int)number;
		}
		return number / 100;
	}
	
//PART 3

	//A call to exponent raises a number to an exponent
	//Accept 1 double and 1 integer and returns a double
	public static double exponent(double base, int exp) {
		double answer = 1;
		for (int i = 0; i < absValue(exp); i++) {
			answer *= base;
		}
		if (exp < 0) {
			return 1 / answer;
		}
		else {
			return answer;
		}
	}
	//A call to factorial finds the factorial of a number
	//Accept 1 integer and returns an integer
	public static int factorial(int number) {
		int answer = 1;
		if (number < 0) {
			throw new IllegalArgumentException("Number must be greater than 0"); 
		}
		for (int i = 1; i <= number; i++) {
			answer *= i;
		}
		return answer;
	}
	//A call to isPrime determines if a number is a prime number
	//Accept 1 integer and returns a boolean
	public static boolean isPrime(int integer) {
		int divisibleCounter = 0;
		for (int i = 1; i <= integer; i++) {
			if (isDivisibleBy(integer, i) == true) {
				divisibleCounter += 1;
			};
		}
		if (divisibleCounter > 2) {
			return false;
		}
		else {
			return true;
		}
	}
	//A call to gcf determines the greatest common factor of two numbers
	//Accept 2 integers and return an integer
	public static int gcf(int integer1, int integer2) {
		int commonFactor = 1;
		double bigger = max(integer1, integer2);
		double smaller = min(integer1, integer2);
		for (int i = 1; i <= (int)bigger; i++) {
			if (isDivisibleBy((int)bigger, i) == true) {
				if (isDivisibleBy((int)smaller, i) == true) {
					commonFactor = i;
				}
			}
		}
		return commonFactor;
	}
	//A call to sqrt square roots a number
	//Accept 1 double and returns a double
	public static double sqrt(double number) {
		double educatedGuess = number / 2;
		if (number < 0) {
			throw new IllegalArgumentException("Number must be greater than 0"); 
		}
		while (((educatedGuess * educatedGuess) - number) >= .005 || ((educatedGuess * educatedGuess) - number) <= -.005) {
			educatedGuess = 0.5 * (number / educatedGuess + educatedGuess);
		}
		return round2(educatedGuess);
	}
	//A call to quadForm finds the roots of a quadratic equation
	//Accepts 3 integers and returns 1 String
	public static String quadForm(int a, int b, int c) {
		double root1 = 0;
		double root2 = 0;
		if (discriminant(a, b, c) < 0) {
			return "no real roots";
		}
		else if (discriminant(a, b, c) > 0) {
			root1 = (-b + sqrt(discriminant(a, b, c)))/ (2 * a);
			root2 = (-b - sqrt(discriminant(a, b, c)))/ (2 * a);
			return round2(root1) + " and " + round2(root2);
		}
		else {
			root1 = -b / (2 * a);
			return round2(root1) + "";
		}
	}
}
