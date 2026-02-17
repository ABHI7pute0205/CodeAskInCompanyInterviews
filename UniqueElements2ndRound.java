// find out unique elements from an array 

import java.util.*;
public class UniqueElements2ndRound{
   public static void main(String x[]){
	
	int[] a = {1,2,3,1,4,2};

// print only elemetns which has count 1 i.e. 3 and 4 

	for(int i=0;i<a.length;i++){

	   int cnt=0;	

		for(int j=0;j<a.length;j++){
		   if(a[i]==a[j]){		// count the occurance of the each element in the array 
			cnt++;
		   }
		}
	if(cnt==1){		// and only print the elements which has count 1  
	   System.out.println(a[i]);
	}
	}


// This prints the elements which has frequency 1 
/*
	for(int i=0;i<a.length;i++){
	   boolean duplicate=false;

	   for(int j=0;j<i;j++){
		if(a[i] == a[j]){
		  duplicate=true;
		  break;
		}
	   }
	 if(!duplicate){
		System.out.print(a[i]+" ");
	 }
	}	
*/
   }
}