package _01_Searching_Algorithms;

public class _01_BinarySearch {
	// Binary searches are good for sorted data because it
	// can potentially take a lot less time than a linear search,
	// especially if the data set is very large.

	// Because binary search is a recursive algorithm, the
	// binarySearch method will take in two extra integer parameters
	// to define the start and end position of the search.

	// 1. Complete the steps in the binarySearch method.
	// We can assume array is already sorted
	public static int binarySearch(int[] array, int start, int end, int value) {
		// 2. if start is greater than end, then
		// do steps 3 - 6.
		if (end>=start) {
			int mid = start + (end-start) / 2;
			if (array[mid] == value) {
				return mid;
			}
			if (array[mid] > value) {
				return binarySearch(array, start, mid - 1, value);

			}
			return binarySearch(array, mid + 1, end, value);
		}
		return -1;

		// 3. create an integer called mid and set it equal
		// to the half way point between start and end

		// 4. if the array element at mid is equal to value
		// then return mid

		// 5. if the array element at mid is greater than value
		// then return the value returned from a call to the
		// binarySearch method. Pass in start and mid - 1
		// for the end variable.

		// 6. return the value returned from a call to the binarySearch
		// method. Use mid + 1 as the start, and pass in end.

		// 7. return -1 because the value was not found

	}
}
