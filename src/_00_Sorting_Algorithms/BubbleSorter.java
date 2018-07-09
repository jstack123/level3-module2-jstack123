package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[j]<array[i]) {
					temp = array[i];
					array[i] = array[j];
			 	array[j] = temp;
					display.updateDisplay();
				}
			}
		}
		
	}
	
}
