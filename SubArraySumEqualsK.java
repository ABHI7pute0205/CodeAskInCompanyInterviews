/*
20) Subarray Sum Equals K
Return the total number of subarrays whose sum equals k.
Example
Input: nums=[1,1,1], k=2 → 2
*/

import java.util.*;

public class SubArraySumEqualsK{
	public static void main(String x[]){

	int[] a = {1,1,1};
	int k=2;

	int cnt=0;

	for(int i=0;i<a.length;i++){

	   int sum=0;

	   for(int j=i;j<a.length;j++){   // this loop start from ith array index and goes through each array element 
		sum = sum + a[j];
		if(sum == k){		// and in this if the sum == k i.e. target then increase the count 
		  cnt++;
		}
	   }
	}

	System.out.println(cnt);		// and print the count 
	}
}