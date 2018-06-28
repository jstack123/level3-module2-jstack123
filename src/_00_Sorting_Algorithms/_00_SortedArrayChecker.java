package _00_Sorting_Algorithms;

import java.util.function.BooleanSupplier;

public class _00_SortedArrayChecker {

	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	public static boolean intArraySorted(int[] unsorted) {
		int firstNum;
		int temp;

		for (int i = 0; i < unsorted.length - 1; i++) {
			firstNum = unsorted[i];
			temp = unsorted[i + 1];

			if (temp < firstNum) {
				return false;
			}
		}
		return true;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	public static boolean doubleArraySorted(double[] unsorted) {
		double firstNum;
		double temp;

		for (int i = 0; i < unsorted.length - 1; i++) {
			firstNum = unsorted[i];
			temp = unsorted[i + 1];

			if (temp < firstNum) {
				return false;
			}

		}
		return true;
	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	public static boolean charArraySorted(char[] unsorted) {
		char firstChar;
		char nextChar;

		for (int i = 0; i < unsorted.length - 1; i++) {
			firstChar = unsorted[i];
			nextChar = unsorted[i + 1];

			if (nextChar < firstChar) {
				return false;
			}
		}
		return true;
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	
	public static boolean stringArraySorted(String[] unsorted) {
		String firstWord;
		String nextWord;
		
		for (int i = 0; i < unsorted.length - 1; i++) {
			firstWord = unsorted[i];
			nextWord = unsorted[i+1];
			
			if (nextWord.compareTo(firstWord) < 1) {
				return false;
			}
		}
		return true;
	}
}
