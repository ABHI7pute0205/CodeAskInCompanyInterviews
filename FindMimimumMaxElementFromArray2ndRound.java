/*
	we have a given array we have a one key element from the array the task is that we have to find the minimum max element which is not present in the array & minimum max element is 5 which is not in array so the o/p is : 5
and key is 2 so aata yat 2 number missing ye and  5 and 6 and 2 chya compaire 5 ha minimum max aahe so ya sathi code kasa 
*/

import java.util.*;
public class FindMimimumMaxElementFromArray2ndRound{
   public static void main(String x[]){
	
	int[] a = {1,2,3,4,7};

// find max element 
	int max = a[0];
   	for(int i=0;i<a.length;i++){
	  if(a[i]>max){
		max=a[i];
	  }
	}
	System.out.println("Max is "+max);

//  find missing element 

	for(int i=1;i<=max;i++){
	  boolean found=false;

		for(int j=0;j<a.length;j++){

		   if(i==a[j]){		// eith array madle sagle element check kar to jo present nahi to print kar to aata 5 present nahi so 5=array madhla element false hot and loop chya baher jaun print kar t 
			found=true;
			break;
		   }
		}
	if(!found){
	  System.out.println("Missing element :"+i);
	  break;
	}
	}	


   }
}