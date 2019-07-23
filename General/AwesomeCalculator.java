package General;


public interface AwesomeCalculator {
	/**
	 * basic addition
	 */
	int getSum(int augend, int addend);

	/**
	 * basic addition of multiple summands
	 * 
	 * @return sum of all ints in the array
	 */
	// int getSum(int... summands);

	/**
	 * basic subtraction
	 */
	double getDifference(double minuend, double subtrahend);

	/**
	 * basic multiplication
	 */
	double getProduct(double multiplicand, double multiplier);

	/**
	 * basic multiplication of multiple factors
	 */
	// double getProduct(double... factors);

	/**
	 * @return semi-worded answer to the division of dividend and divisor
	 * 
	 *         sample, getQuotientAndRemainder(17, 5) returns "3 remainder 2"
	 */
	String getQuotientAndRemainder(int dividend, int divisor);

	/**
	 * @return equivalent value of fahrenheit in celsius
	 * 
	 *         sample, toCelsius(212) => 100.0
	 */
	double toCelsius(int fahrenheit);

	/**
	 * @return equivalent value of celsius in fahrenheit
	 * 
	 *         sample, toFahrenheit(100.0) => 212.0
	 */
	double toFahrenheit(int celsius);

	/**
	 * @return equivalent value of pounds in kilogram
	 * 
	 *         sample, toKilogram(154) => 69.8532
	 */
	double toKilogram(double lbs);

	/**
	 * @return equivalent value of kg in pounds
	 * 
	 *         sample, toPound(53.37) => 117.66071
	 */
	double toPound(double kg);

	/**
	 * A palindrome is a string that reads the same both forward and backward.
	 * 
	 * For simplicity, assume that length of str is always 5.
	 * 
	 * @return true if str is a palindrome, else false
	 * 
	 *         sample, "level" -> true, "river" -> false
	 */
	boolean isPalindrome(String str);
}
