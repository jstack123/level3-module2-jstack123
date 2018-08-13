package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class _00_MoreAndMoreTests {

	private String multiply(int a, int b) {
		int answer = a * b;
		String answerWord = "" + a + " x " + b + " = " + answer;
		return answerWord;
	}

	private boolean isPrime(int x) {
		int numFactors = x-1;
		for (int i = numFactors; i > 1 ; i--) {
			if (x%i==0) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isSquare(int y) {
		int nums = y;
		
		for (int i = nums; i > 0; i--) {
			if (y/i==i) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isCube(int z) {
		int nums = z;
		
		for (int i = nums; i > 0; i--) {
			double second = z/i;
			if (second/i==i) {
				return true;
			}
		}
		
		return false;
	}

	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	@Test
	public void PrimeTest() {

		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}
	
	 @Test
	 public void SquareTest() {
	
	 assertTrue(isSquare(4));
	 assertTrue(isSquare(144));
	 assertTrue(isSquare(64));
	 assertTrue(isSquare(10201));
	 assertTrue(isSquare(1));
	 assertFalse(isSquare(3));
	 assertFalse(isSquare(22));
	 assertFalse(isSquare(143));
	
	 }

	
	
	 @Test
	 public void CubeTest() {
	
	 assertTrue(isCube(27));
	 assertTrue(isCube(216));
	 assertTrue(isCube(729));
	 assertTrue(isCube(1));
	 assertFalse(isCube(3));
	 assertFalse(isCube(22));
	 assertFalse(isCube(143));
	
	 }


}
