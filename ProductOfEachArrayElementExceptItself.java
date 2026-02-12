/*
16) Product of Array Except Self
Return an array where each element is product of all elements except itself.
Do not use division.
Example
Input: [1,2,3,4] → [24,12,8,6]
*/

import java.util.*;

public class ProductOfEachArrayElementExceptItself{
	public static void main(String x[]){

	int[] a = {1,2,3,4,5};

	int[] res = new int[a.length];	// this is to store product if each array element 

	for(int i=0;i<a.length;i++){	// loop goes through each array element |	1

	   int product=1;

	   for(int j=0;j<a.length;j++){   // this loop is also goes to each array element 1
		if(i != j){		  // and here we check self element nako again and again 1 != 1  false  mhaje he product calculate nahi honar exit from loop and check another element  
		   product = product * a[j];
		}
	   }	  
	  res[i]=product;
	}

	for(int n:res){
	  System.out.println(n);
	}	

	}
}