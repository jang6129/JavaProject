
public class SelectionSort {
	public static void main(String[] args) {
		
	}
	
	void selectionSort(int[] list) {
	    int indexMin, temp;
	    for (int i = 0; i < list.length - 1; i++) {
	        indexMin = i;
	        for (int j = i + 1; j < list.length; j++) {
	            if (list[j] < list[indexMin]) {
	                indexMin = j;
	            }
	        }
	        temp = list[indexMin];
	        list[indexMin] = list[i];
	        list[i] = temp;
	    }
	}
}
