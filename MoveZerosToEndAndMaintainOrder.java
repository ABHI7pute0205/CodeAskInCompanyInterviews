/*
5️) Move Zeroes
Move all zeros in the array to the end while maintaining the order of non-zero elements.
Example
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

import java.util.*;

public class MoveZerosToEndAndMaintainOrder{
	public static void main(String x[]){

	int[] a = {0,1,0,3,12};
	
/*
	int[] res = new int[a.length];
	int ind=0;

	for(int i=0;i<a.length;i++){
	   if(a[i] != 0){
		res[ind++]=a[i];
	   }
	}
	for(;ind<res.length;){
	   res[ind++]=0;
	}

	for(int i=0;i<res.length;i++){
	   System.out.print(" "+res[i]);
	}	
*/

// OR 
	int end=0;
	for(int start=0;start<a.length;start++){	// checks all elements or traverse through each element of the array 
	   if(a[start] != 0){
		int temp = a[end];		
		a[end] = a[start];		// a[end] ↔ a[start]
						// a[0] ↔ a[1]		Array change : [1,0,0,3,12]

		a[start] = temp;
		end++;			// end++   | end=1

	   }
	}
	for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
	}
}