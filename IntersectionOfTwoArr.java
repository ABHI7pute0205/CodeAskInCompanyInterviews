/*
7️) Intersection of Two Arrays
Return the intersection of two arrays as unique elements.
Example
Input: [1,2,2,1], [2,2] → [2]
*/


import java.util.*;

// common elements from both array means intersection 

public class IntersectionOfTwoArr{
	public static void main(String x[]){

	int[] a = {1,2,2,1};
	int[] b = {2,2};

	HashSet<Integer> hs = new HashSet<>();
	HashSet<Integer> res = new HashSet<>();

	// initially add all elements of the array-1 in the hashset
	for(int i=0;i<a.length;i++){
	    hs.add(a[i]);
	}	

	// this loop for the array-2 and check the array-2 elements are in the array-1 or not if yes then add this element in the res array and print result array 
	for(int j=0;j<b.length;j++){
	   if(hs.contains(b[j])){
		res.add(b[j]);
	   }
	}
	System.out.println(res);
	}
}



/*
boolean found = false;

	for(int i=0;i<a.length;i++){
	
	  boolean alreadyPrinted=false;

	 // check duplicate in same array
	  for(int k=0;k<i;k++){
		if(a[i]==a[k]){
		  alreadyPrinted=true;
		  break;
		}
	  }

	  if(alreadyPrinted){
		continue;
	  }

	  for(int j=0;j<b.length;j++){
		if(a[i] == b[j]){
			found=true;
	 		System.out.print(" "+a[i]);
			break;
		}
 	  }
	}	
	if(!found){
	 System.out.println("No Common element found...");	  
	}
*/