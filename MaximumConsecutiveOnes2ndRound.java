/*
Maximum of consecutive ones 
Add +1 at the array element so it's becomes as output like array is 1,2,3,5 and output is 1,2,3 6
*/

import java.util.*;
public class MaximumConsecutiveOnes2ndRound{
   public static void main(String x[]){
	
	int[] a = {1,1,0,1,1,1,2};

	    int cntOnes=0;
	    int maxCnt=0;

	for(int i=0;i<a.length;i++){	// loop through whole array 
		
		if(a[i] == 1){		// check element is equal 1 or not 
		   cntOnes++;		// if yes then increse the count 
		
		  if(cntOnes>maxCnt){	// check ones count is > than maxcnt 
		    maxCnt=cntOnes;
		  }
		}
		else{
		   cntOnes=0;		// reset the cnt after one consecutive elements counts 
		}
	}
	System.out.println("Max Consecutive ones : "+maxCnt);
   }
}