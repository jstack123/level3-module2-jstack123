package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = new String[4];
		words[0] = "car";
		words[1] = "tree";
		words[2] = "school";
		words[3] = "sports";
		assertEquals(2,_00_LinearSearch.linearSearch(words, "school"));
		assertEquals(3,_00_LinearSearch.linearSearch(words, "sports"));
		assertEquals(0,_00_LinearSearch.linearSearch(words, "car"));
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 8;
		array[2] = 25;
		array[3] = 32;

		assertEquals(1,_01_BinarySearch.binarySearch(array, 0, array.length-1, 8));
		assertEquals(3,_01_BinarySearch.binarySearch(array, 0, array.length-1, 32));
		assertEquals(2,_01_BinarySearch.binarySearch(array, 0, array.length-1, 25));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = new int[4];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		
		assertEquals(1,_02_InterpolationSearch.interpolationSearch(array, 1));
		assertEquals(3,_02_InterpolationSearch.interpolationSearch(array, 3));
		assertEquals(0,_02_InterpolationSearch.interpolationSearch(array, 0));
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = new int[4];
		array[0] = 0;
		array[1] = 15;
		array[2] = 23;
		array[3] = 47;
		
		assertEquals(2,_03_ExponentialSearch.exponentialSearch(array, 23));
		assertEquals(3,_03_ExponentialSearch.exponentialSearch(array, 47));
		assertEquals(0,_03_ExponentialSearch.exponentialSearch(array, 0));
	}
}
