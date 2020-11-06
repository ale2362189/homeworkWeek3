package homeworkWeek3;

import java.util.Arrays;

public class arraysAndMeathods {

	public static void main(String[] args) {

		/*
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93.
		 *
		 * a.	Programmatically subtract the value of the first element in the array 
		 * from the value in the last element of the array (i.e. do not use ages[7] in your code). 
		 * Print the result to the console.
		 * 
		 * b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
		 * (works for arrays of different lengths).
		 * 
		 * c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */

		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 47};
		
		int firstAge = ages[0];
		int lastAge = ages[ages.length -1];
		int total = 0;

		for (int age : ages) {
			total += age;
		}
		System.out.println("Result for 1.b :  " + (lastAge - firstAge));
	
		System.out.println("Result for 1.c: " + (total /= ages.length));

		/*
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */

		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		int sum = 0;
		for (String name : names) {
			sum += name.length();

		}
		// 2. a
		System.out.println("Result for 2.a:  " + (sum / names.length));
		System.out.print("Result for 2.b:  ");
		String str = " ";

		for (int i = 0; i < names.length; i++) {
			// 2. b
			System.out.print(names[i] + str);
		}
		// next println just for formating

		System.out.println(" ");
		
		
// 3.	How do you access the last element of any array?
		
		System.out.println(template(3) + " arrayName[arrayname.length -1]");
		
// 4.	How do you access the last element of any array? 		
		
		System.out.println(template(4) +" arrayName[0]");
		
		
/*
 * 5. Create a new array of int called nameLengths. write loop to iterate over
 * the previously created names array and add the length of each name to the
 * nameLengths array
 */
	
	//private static int[] arrayLengths(String[] names) {
	
		int[] nameLengths = new int[names.length];
		
			System.out.print(template(5));
			for(int i = 0; i < names.length; i++) {
				String name = names[i];
				nameLengths[i] = name.length();

			
			System.out.print(nameLengths[i] + str);
		}

	/*
	 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
	 * of all the elements in the array. Print the result to the console.
	 */
		System.out.println();
		int all = 0;
	for(int nameLength : nameLengths) {
		all += nameLength;
		}
		System.out.println(template(6) + (all));
	
		
	
		
		
		System.out.println(template(7) + repeater("hello", 3));

		System.out.println(template(8) + createFullName("Alex", "Nelson"));

		System.out.println(template(9) + over100(ages));

		double[] fancyNumbers = new double[6];
		fancyNumbers[0] = 34.87;
		fancyNumbers[1] = 17.43;
		fancyNumbers[2] = 29.77;
		fancyNumbers[3] = 23.16;
		fancyNumbers[4] = 51.43;
		fancyNumbers[5] = 6.88;

		double[] moreNumbers = new double[5];
		moreNumbers[0] = 65.76;
		moreNumbers[1] = 11.23;
		moreNumbers[2] = 90.17;
		moreNumbers[3] = 21.97;
		moreNumbers[4] = 35.25;

		System.out.println(template(10) + arrayAverage(fancyNumbers));

		System.out.println(template(11) + firstAverageGreater(fancyNumbers, moreNumbers));

		boolean isHotOutSide = true;
		double moneyInPocket = 20;

		System.out.println(template(12) + willBuyDrink(isHotOutSide, moneyInPocket));

		System.out.println(template(13) + "See what I did there? lol");
	}	
	
	/*
	 * 7. Write a method that takes a String, word, and an int, n, as arguments and
	 * returns the word concatenated to itself n number of times. (i.e. if I pass in
	 * “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	 */
	

	public static String repeater(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		
		}

	/*
	 * 8. Write a method that takes two Strings, firstName and lastName, and returns
	 * a full name (the full name should be the first and the last name as a String
	 * separated by a space).
	 */
	public static String createFullName(String x, String y) {
			return x + " " + y;
		}

	/*
	 * 9. Write a method that takes an array of int and returns true if the sum of
	 * all the ints in the array is greater than 100.
	 */
	public static boolean over100(int[] numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum += number;
			}
			return (sum > 100);
		}

	/*
	 * 10. Write a method that takes an array of double and returns the average of
	 * all the elements in the array.
	 */

	public static double arrayAverage(double[] prices) {
			int total = 0;
			for (double price : prices) {
				total += price;
			}
			return (total /= prices.length);
		}

	/*
	 * 11. Write a method that takes two arrays of double and returns true if the
	 * average of the elements in the first array is greater than the average of the
	 * elements in the second array.
	 */
	public static boolean firstAverageGreater(double[] X, double[] Y) {
			double sumA =0;
			double sumB = 0;
			double averageA = 0;
			double averageB = 0;
			
			for (double x : X) {
				sumA += x;
				averageA = sumA / X.length;
			}
			for (double y : Y) {
				sumB += y;
				averageB = sumB / Y.length;
			}
			return (averageA > averageB);
		}

	/*
	 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
	 * a double moneyInPocket, and returns true if it is hot outside and if
	 * moneyInPocket is greater than 10.50.
	 */
	public static boolean willBuyDrink(boolean x, double y) {
			return (x && y > 10.50);
		}

	/*
	 * 13. Create a method of your own that solves a problem. In comments, write
	 * what the method does and why you created it.
	 * 
	 * After the second problem I realized concatenating text plus my answer could be simplified 
	 * with a method. It actually made the concatenation simpler and saved a lot of time 
	 */

	public static String template(int x) {
		return "Result for problem " + x + ": ";
		}

}
