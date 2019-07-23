package General;
public class Demo {

	public static boolean isPalindrome(String str) {

		for (int index = 0, lastIndex = str.length() - 1; index < lastIndex; index++) {
			if (str.charAt(index) != str.charAt(lastIndex - index)) {
				return false;
			}

		}

		return true;
	}

	public void forLoop() {
		// For Loop 1
		for (int counter = 0; counter < 13; counter++) {
			System.out.println("Channel: " + (counter + 1));
		}
		System.out.println("Channel maxed out.");

	}

	public void forLoop4() {
		// For Loop Variation 4
		for (int x = 0; x < 5; x++) {

			for (int y = 0; y < 10; y++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void forLoop3() {
		// For Loop Variation 3
		for (char letter = 'a'; letter <= 'z'; letter++) {
			System.out.print(letter + " ");
		}
	}

	public void forLoop2() {
		// For loop variation 2
		int counter = 0;
		for (; counter < 13;) {
			System.out.println("Channel: " + (++counter));
		}
		System.out.println("Channel maxed out.");
		System.out.println(counter);
	}

	public void nestedForLoopExample() {
		for (int x = 0; x < 5; x++) {

			for (int y = 0; y < 10; y++) {
				System.out.print("*");
				System.out.println("x value " + x + " y value: " + y);

			}
			System.out.println();
			System.out.println("value of y first level loop");
		}

	}

	public void breakExample() {
		char findCharacter = 'j';
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int pos = 0;

		for (; pos < alphabet.length(); pos++) {

			System.out.print("Searching...");
			char currentLetter = alphabet.charAt(pos);
			if (currentLetter == findCharacter) {
				break;
			}
			System.out.println(" Not found.");
		}
		System.out.println(" " + findCharacter + " is found at  " + pos);

	}

	public void continueExample() {
		char findChar = 'e';
		String phrase = "she sells seashells by the seashore";
		int findCharCount = 0;

		for (int pos = 0; pos < phrase.length(); pos++) {

			if (phrase.charAt(pos) != findChar) {
				continue;
			}
			findCharCount++;

		}

		System.out.println("Found " + findCharCount + " " + findChar + "'s on the phrase");

	}

	// Return Example
	// Stop printing the line if ctr goes beyond 3.
	public void printNLines(int n) {
		for (int ctr = 0; ctr < n; ctr++) {
			System.out.println(ctr + "--------------------------------------");
			if (ctr >= 3) {
				return;
			}
		}

		System.out.println("End");
	}

	// Return example 2
	// Simply return the conversion of Farenheit to Celcius
	public double celsiusToFarenheit(double celsius) {
		return celsius * (1.8) + 32;
	}

	public int fibonacci(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public void arrayExample() {
		// int Array declaratiion
		int[] intArray;

		// instantiate an array of 5 int
		intArray = new int[5];

		// initialize each element of the array
		intArray[0] = 100;
		intArray[1] = 100;
		intArray[2] = 100;
		intArray[3] = 100;
		intArray[4] = 100;

		// accessing elements of the array
		System.out.println(intArray[0]);
		System.out.println(intArray[4]);
		// ArrayIndexOutOfBounds
		System.out.println(intArray[5]);

	}

	public void arrayExample2() {
		// another way of initializing arrays
		int[] arrLiterals = { 101, 102, 103 }; // indeces 0 to 2
		int[] emptyIntArr = {};
		String[] strLitArr = { "one", "two", "three", "four" };
		String str = "Hello";
		String[] strArr = { "World", "How", str, "are", " ", "you" + "?" };
		Object[] objArr = { new Object(), new Object() };
		emptyIntArr = arrLiterals;

		System.out.println("Square has " + strLitArr[3] + strArr[4] + "sides");
		System.out.println(arrLiterals[1]);
		System.out.println(emptyIntArr[0]);
		System.out.println(strArr[2] + strArr[1] + strArr[5]);
		System.out.println(objArr[0]);

	}

	public void arrayMultiD() {
		int[][] room = new int[3][];
		int[] floor0 = new int[3];
		int[] floor1 = { 100, 101, 102, 103 };
		int[] floor2 = { 200, 201 };

		room[0] = floor0;
		room[1] = floor1;
		room[2] = floor2;

		System.out.println(room[0][2]);
		System.out.println(room[2][0]);
		System.out.println(room[1][2] + "" + room[2][1]);

	}

	public void arrayTraverse() {
		int[] number = new int[10];
		// for loop to initialize every element
		for (int i = 0; i < number.length; i++) {
			number[i] = i;
		}

		// for loop to display every element
		for (int i = 0; i < number.length; i++) {
			System.out.println("Element at index " + i + ": " + number[i]);
		}

	}

	public int getTotal(int[] number) {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;
	}

	public void getTotalTest() {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(getTotal(number));
	}

	public void printBoard(char[][] board) {
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				System.out.println(board[x][y]);
			}
			System.out.println();
		}
	}

	public void printBoardTest(String[] args) {
		char[][] board = new char[3][3];
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				board[x][y] = '-';
			}
		}
		printBoard(board);
	}

	public static void main(String[] a) {

		// List<String> words = new ArrayList<String>();
		//
		// words.add("Hello");
		// words.add("HeroMode");
		// words.add("XxxXxxX");
		// words.add("hitherehtih");
		// words.add("Right here should I stand");
		//
		// for (String word : words) {
		// System.out.println("Word: " + word + " " + (isPalindrome(word) ? " is
		// Palindrome" : " is non-palindrome"));
		//
		// }

		Demo demo = new Demo();

		// demo.forLoop();

		// demo.forLoop2();

		// demo.forLoop3();
		//
		// demo.forLoop4();

		// demo.nestedForLoopExample();
		//
		// demo.breakExample();
		//
		// demo.continueExample();
		//
		// //demo.printNLines(5);
		//
		// demo.printNLines(2);

		// Hometown usual daytime temperature of 35 degrees celcius
		double manilaTemp = demo.celsiusToFarenheit(35);

		System.out.println("Manila Temp in Farenheit is " + manilaTemp + " degrees");

		// Warsaw usual daytime temperature of 9 degrees celcius
		double warsawTemp = demo.celsiusToFarenheit(9);
		System.out.println("Warsaw Temp in Farenheit is " + warsawTemp + " degrees");
		//
		// // Try Fibonacci
		// demo.fibonacci(5);

	}
}
