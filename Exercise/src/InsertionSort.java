
public class InsertionSort {
	public static void main(String[] args) {
		int array[] = {7, 3, 2, 8, 9, 4};
		insertionSort(array);
		for (int n : array) {
			System.out.println(n);
		}
	}
	
	public static void insertionSort(int[] arr)
	{
	   for(int index = 1 ; index < arr.length ; index++){
	      int temp = arr[index];
	      int aux = index - 1;
	      while( (aux >= 0) && ( arr[aux] > temp ) ) {
	         arr[aux+1] = arr[aux];
	         aux--;
	      }
	      arr[aux + 1] = temp;
	   }
	}
}

