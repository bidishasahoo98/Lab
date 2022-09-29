/*Problem 5. 
Write a Java program to find common elements from three sorted (in 
non-decreasing order) arrays.*/

package Assignment;
public class ArrayCommonElement {

	public static void main(String[] args) {
		int arr1[] = {1, 4, 25, 55, 78, 99};
		int arr2[] = {2, 3, 4, 34, 55, 68, 75, 78, 100};
		int arr3[] = {4, 55, 62, 78, 88, 98};
		int i = 0, j = 0, k = 0, x = 0;
		System.out.print("Array1: "); //print 1st array
		for(x = 0; x < arr1.length; x++) {
		System.out.print(arr1[x] + " ");
		}
		System.out.print("\nArray2: "); //print 2nd array
		for(x = 0; x < arr2.length; x++) {
		System.out.print(arr2[x] + " ");
		}
		System.out.print("\nArray3: "); //print 3rd array
		for(x = 0; x < arr3.length; x++) {
		System.out.print(arr3[x] + " ");
		}
		System.out.println(); //print new line
		System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
		if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {   // if the integers appointed by i, j and k are equal
		System.out.print(arr1[i] + " ");  // prints the common integer
			 // increases i, j and k by 1
			i++;
			j++;
			k++;
			}else if (arr1[i] < arr2[j]) {
			i++;
			}else if (arr2[j] < arr3[k]) {
			j++;
			}else {
			k++;
			}
}}}
				          	            
	               
	               
	                
	               	            
	            
	            /*
	             * otherwise, if arr1[i] < arr2[j]
	             * we have already found one smaller integer
	             * which is arr1[i]
	             */
	           
	            /*
	             * otherwise, if arr2[j] < arr3[k]
	             * we have got a smaller integer
	             * which is arr2[j]
	             */
	          	            
	            /*
	             * otherwise, we consider arr3[k] to be smaller
	             */
	          	
