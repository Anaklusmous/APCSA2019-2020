/*Harrison Dong
 * August 29, 2019 4th Period
 * Calls math methods from Calculate class
 * Client code or runner code*/
public class DoMath {

	public static void main(String[] args) {
		//PART 1
		System.out.println(Calculate.square(12));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(4.2, 7.6));
		System.out.println(Calculate.average(4.2, 7.6, 2.8));
		System.out.println(Calculate.toDegrees(5));
		System.out.println(Calculate.toRadians(30.0));
		System.out.println(Calculate.discriminant(1, 13, 42));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		
		//PART 2
		System.out.println(Calculate.isDivisibleBy(8,2));
		System.out.println(Calculate.absValue(-9));
		System.out.println(Calculate.max(5, 7));
		System.out.println(Calculate.max(5, 7, 9));
		System.out.println(Calculate.min(5, 7));
		System.out.println(Calculate.round2(-5.447827));
		
		//PART 3
		System.out.println(Calculate.exponent(5.0, -3));
		System.out.println(Calculate.factorial(10));
		System.out.println(Calculate.isPrime(17));
		System.out.println(Calculate.gcf(5678, 68976));
		System.out.println(Calculate.sqrt(45876.98));
		
		//PART 4
		System.out.println(Calculate.quadForm(1, 13, 42));
	}

}
