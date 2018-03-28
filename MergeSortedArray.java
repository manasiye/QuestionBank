import java.util.ArrayList;

public class MergeSortedArray {
	//using extra space 

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 8, 10, 100 };
		int[] arr2 = { 17, 18, 19, 21, 1001 };
		int[] arr3 = merge(arr1, arr2);
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

	public static int[] merge(int[] arr1, int[] arr2) {

		int[] mergedArray = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			} else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		// merge additional elements left in arr1.
		while (i < arr1.length) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		// merge additional elements left in arr2.
		while (j < arr2.length) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		return mergedArray;
	}
}