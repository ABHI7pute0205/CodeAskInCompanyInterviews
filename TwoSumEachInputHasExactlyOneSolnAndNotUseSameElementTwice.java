/*
1)	Two Sum
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
You may assume each input has exactly one solution, and you may not use the same element twice.
Example
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/
import java.util.*;

public class TwoSumEachInputHasExactlyOneSolnAndNotUseSameElementTwice{
	public static void main(String x[]){

	  int nums[] = {2,7,11,15};
	  int target=22;

// optimised code 	

	  HashMap<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<nums.length;i++){
		// diff = 9-2 [7]  2 store at 0th index 
		// diff = 9-7 [2]  2 is already presnt then print that element 
		  int  diff = target-nums[i];

			if(map.containsKey(diff)){
		 	 System.out.println("index : "+map.get(diff)+","+i);
			 break;
			}
	// number of array stored at index 0,1,2 etc
			map.put(nums[i],i);
		}


	// OR
/*
	for(int i=0;i<nums.length;i++){
	  for(int j=i+1;j<nums.length;j++){
		if(nums[i] + nums[j] == target){
		  System.out.println("index : "+i+","+j);
		  break;
		}
  	  }
	}
*/	
	}
}