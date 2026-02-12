/*
3️) Contains Duplicate
Given an integer array nums, return true if any value appears at least twice.
Example
Input: [1,2,3,1] → true
Input: [1,2,3,4] → false
*/

import java.util.*;

public class ContainsDuplicate{
	public static void main(String x[]){
	
	int[] a = {1,2,3,1};
	boolean isDuplicate=false;

/*
	for(int i=0;i<a.length;i++){
	  for(int j=i+1;j<a.length;j++){
		if(a[i] == a[j]){
		   isDuplicate=true;
		   break;
		}
	  }
	}
	System.out.println(isDuplicate);
*/

// OR 
	HashSet<Integer> hs = new HashSet<>();

	for(int i=0;i<a.length;i++){
	    if(hs.contains(a[i])){
		isDuplicate=true;
		break;
	    }
	  hs.add(a[i]);
	}
	System.out.println(isDuplicate);
	}
}