// Add +1 at the array element so it's becomes as output like array is 1,2,3,5 and output is 1,2,3 6

import java.util.*;
public class Add1AtArrSoItBecomePluseOneArr2ndRound{
   public static void main(String x[]){
	
	int[] a = {1,2,3,5};

	for(int i=0;i<a.length;i++){	// this loop traverse through a whole array 

		if(i == a.length-1){	// check the index == last element of array if yes then add +1 in the last element of the array 
		   a[i]+=1;
		}
		System.out.println(a[i]);	// and print 
	}
	
   }
}