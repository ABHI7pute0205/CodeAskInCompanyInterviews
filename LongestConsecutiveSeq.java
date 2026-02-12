/*
9️) Longest Consecutive Sequence
Given an unsorted array, find the length of the longest consecutive elements sequence.
Example
Input: [100,4,200,1,3,2] → 4
*/

import java.util.*;

public class LongestConsecutiveSeq{
	public static void main(String x[]){
//		    0  1  2  3 4 5  6   7   8   9   10     <-- index of an array
	int[] a = {100,4,200,1,3,2,201,202,203,204,205};

/*
	Arrays.sort(a);

	int len=1;
	int cnt=1;

	for(int i=1;i<a.length;i++){	// loop start from 1th index to array length 
	  if(a[i] == a[i-1]+1){		// check the current element is equal with the previous element if yes increse the count 
		cnt++;
	  }
	  else if(a[i] != a[i-1]){	// if current and previous not equal then reset the count  and move on next element || also avoid duplicate element 
		cnt=1;
	  }
	  if(cnt>len){		// check current count of the substring is greater than length if yes then updaet length of substring and again count count the other substring in the array 
		len=cnt;
	  }
	}
	System.out.println(len);
*/
	

	HashSet<Integer> set = new HashSet<>();
	
	for(int num:a){		// add all array elements in to the set and set store only unique elements so the duplicates are not allow here
	   set.add(num);
	}	

	int longest=0;

	for(int num:set){		// loop start from the  first element of the set 

	   if(!set.contains(num-1)){   // check 100-1=99 NOT contains in the array so we enter inside the loop and check the condition 
		int curr=num;
		int cnt=1;

		while(set.contains(curr+1)){  // 99+1=100 yes 101 NOT in array so loop break and check the other 
		  curr++;	// then increse the current 
		  cnt++;	// and cnt++  
		}
		longest=Math.max(longest,cnt);
	   }
	}
	System.out.println(longest);
	
	}
}