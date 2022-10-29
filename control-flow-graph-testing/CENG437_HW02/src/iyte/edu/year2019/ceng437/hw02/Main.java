package iyte.edu.year2019.ceng437.hw02;

public class Main {

	public static void main(String[] args) {
		
		InsertionSort insertionSort = new InsertionSort();
		
		
		//***************  EXAMPLE 1  ***************************
		
		int[] arr1 = {10, 7, 3, 25, 17, 2, 92, 52}; 
		
		String arr1str = "";
		
		for(Integer num: arr1) {
			arr1str += num.toString();
			arr1str += " ";
		}
		
		System.out.println("Initial Array: " + arr1str);
		
		String arr1strSorted = "";
		
		int[] sortedArr1 = insertionSort.doInsertionSort(arr1, arr1.length);
		
		
		for(Integer num: sortedArr1) {
			arr1strSorted += num.toString();
			arr1strSorted += " ";
		}
		
		System.out.println("Resulting sorted array: " + arr1strSorted);		
		
		//***************  EXAMPLE 2  ***************************
		
		int[] arr2 = {100, 10, 20, 5, 35, 75, 90}; 
		
		String arr2str = "";
		
		for(Integer num: arr2) {
			arr2str += num.toString();
			arr2str += " ";
		}
		
		System.out.println("\n\nInitial Array: " + arr2str);
		
		String arr2strSorted = "";
		
		int[] sortedArr2 = insertionSort.doInsertionSort(arr2, arr2.length);
		
		
		for(Integer num: sortedArr2) {
			arr2strSorted += num.toString();
			arr2strSorted += " ";
		}
		
		System.out.println("Resulting sorted array: " + arr2strSorted);	
	}
	
}
