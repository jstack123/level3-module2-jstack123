package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
	public MergeSorter() {
		type = "Merge";
	}
	
	//1. Since this sorting algorithm uses recursion, 
	//   we'll make a helper method called mergeSort.
	//   Complete the steps in the mergeSort method.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		//20. call the mergeSort method with 0 and the length of the array minus one
		mergeSort(array, 0, array.length-1, display);
	}
	
	private void mergeSort(int[] array, int low, int high, SortingVisualizer display) {
		//1. Create a temporary integer array that is the same length as the passed in array.
		int[] tempArray = new int[array.length];
		//2. make and if statement that checks if low is less than high
		//   and put the rest of the method inside of it
		if (low<high) {
			int middle = (low+high)/2;
			mergeSort(array, low, middle, display);
			mergeSort(array, middle+1, high, display);
			
			for (int i = low; i <= high; i++) {
				tempArray[i] = array[i];
			}
			int i = low;
			int j = middle+1;
			int k = low;
			while(i<=middle && j<=high) {
				if (tempArray[i] <= tempArray[j]) {
					array[k] = tempArray[i];
					i+=1;
				} else {
					array[k] = tempArray[j];
					j+=1;
				}
				k+=1;
			}
			while (i<=middle) {
				array[k] = tempArray[i];
				k+=1;
				i+=1;
			}
			display.updateDisplay();
		}
			//3. Create an integer called middle and set it 
			//   equal to the half way
            
            //4. call the mergeSort method with low and middle
           
            //5. call the mergeSort method with middle + 1 and high
            
            //6. copy the element from the array into the temporary array,
            //   but only the elements from low to high inclusive
            
            //7. create three integers called i, j, and k and
            //   set them equal to low, middle + 1, and low respectively
            
            //8. while i is less than or equal to middle
            //   and j is less than or equal to high
            
            	//9. if temp array at i is less than or equal 
            	//   to temp array at j	
                
                	//10. set array at k equal to temp array at i
                    
                    //11. increase i by 1
                  
                //13. else
            
                	//14. set array at k equal to temp array at j
                   
                    //15. increase j by 1
                 
                //16. increase k by 1
                
            
            //17. make a while loop that runs while i is less than or equal to middle
            
            	//18. set array at k equal to temp array at i
                
                //19. increase k and i by 1
               
            
        
	}

}
