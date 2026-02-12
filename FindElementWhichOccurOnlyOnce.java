/*

8️) Single Number
Every element appears twice except one. Find that single one.
Example
Input: [4,1,2,1,2] → 4

*/

import java.util.*;

public class FindElementWhichOccurOnlyOnce{
	public static void main(String x[]){

// same element aala ka element cancel i.e. original madhun substract 
	int[] a = {4,1,2,1,2};	
/*
	int uniqueOneEle=0;
	
	for(int i=0;i<a.length;i++){
	   uniqueOneEle = uniqueOneEle ^ a[i];
	}
	System.out.println(uniqueOneEle);
*/
	HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }
            else{
                map.put(a[i], 1);
            }
        }
/*
        // entrySet use
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();

        for(Map.Entry<Integer,Integer> m : set){
            if(m.getValue() == 1){		// value mhanje tya element che frequency 
                System.out.println(m.getKey());  // element print
            }
        }
*/
// OR
	for(Integer key:map.keySet()){	// keySet() is method which is stores all key of hashMap in a set i.e.set store unique elements  
	  if(map.get(key) ==1){		// using .get() check is this key value is 1 if 1 then print 
                System.out.println(key);  
	  }
	}
	

	}
}

/*
yat ans=0 ye and array chya 0 index cha element cha XOR madhe sequencially jar chal lo tar element add hot jatat previous element madhe 
e.g.
0^4
4^1 = 5
5^2 = 7
7^1 = 6  // yat 1 ha already aala ye array madhe so to substract kara y cha i.e. ans =6
6^2 = 4  // 2 ha pan already exist ye array madhe aale la ye so to substract kela ans =4 

*/

/*
   0 1 2 3 4
a=[4,1,2,1,2]
ans=0

Step 1:
ans = 0 ^ 4 = 4

Step 2:
ans = 4 ^ 1 = 5


(binary operation internally)

Step 3:
ans = 5 ^ 2 = 7

Step 4:
ans = 7 ^ 1 = 6


(1 cancel)

Step 5:
ans = 6 ^ 2 = 4


(2 cancel)

⭐ Final Output
4

Ultra Simple Explanation
4,1,2,1,2

1 cancel
2 cancel

remaining = 4

*/