package _02_More_Algorithms;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls += 1;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);

		for (int i = 0; i < peeps.size(); i++) {

			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = words.get(0);

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message1) {

		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains("... --- ...")) {

				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		double temp;
		for (int i = 0; i < results.size(); i++) {
			for (int j = i + 1; j < results.size(); j++) {
				double one = results.get(i);
				double two = results.get(j);

				if (one > two) {
					temp = two;
					two = one;
					one = temp;
					results.set(i, one);
					results.set(j, two);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String temp;
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = i + 1; j < unsortedSequences.size(); j++) {
				String previous = unsortedSequences.get(i);
				String next = unsortedSequences.get(j);
				if (previous.length() > next.length()) {
					temp = next;
					next = previous;
					previous = temp;
					unsortedSequences.set(i, previous);
					unsortedSequences.set(j, next);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {
				String previous = words.get(i);
				String next = words.get(j);

				if (previous.compareTo(next) > 1) {
					System.out.println("hi");
				}
			}
		}

		return words;

	}

}
