/*
18) Top K Frequent Elements
Return the k most frequent elements.
Example
Input: [1,1,1,2,2,3], k=2 → [1,2]
*/

import java.util.*;

public class KFrequentElement{
    public static void main(String x[]){

/*
	int[] a ={1,1,1,2,2,3};
	int k=2;
	int n=a.length;

	int[] freq = new int[n];  // frequency array [3,3,3,2,2,1]

	// count the frequency of each element 
	for(int i=0;i<n;i++){
	  for(int j=0;j<n;j++){
	 	if(a[i] == a[j]){
		   freq[i]++;
		}
	  } 
	}

	// print top k frequent 

	for(int i=0;i<k;i++){
	  int max=0;
	  for(int j=1;j<n;j++){
		if(freq[j] > freq[max]){
		   max=j;
	     	}
	  }
	 System.out.println(a[max]);

	// same element frequency 0
	for(int j=0;j<n;j++){
	  if(a[j] == a[max]){	// jo pan max element print kela tya che freqency to element -1 ne mark kara y cha then 2nd 2 ye so tya la print kela and tya la pan -1 ne replace kel 
	     freq[j] = -1;
	  }
	}
	
	}
*/

	// OR using hashmap 
	
	int[] a ={1,1,1,2,2,3};
	int k=2;

	HashMap<Integer,Integer> map = new HashMap<>();

// Count the Frequency of the each arra element and store in MAP 
	 for(int i : a){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

	Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
	for(Map.Entry<Integer,Integer> e:entry){
	  if(e.getValue() >= k){
		System.out.println(e.getKey());
	  }
	}


/*
        // Find top k frequent
        for(int i=0;i<k;i++){
            int maxkey = 0;
            int maxfreq = -1;

            for(int key : map.keySet()){
                if(map.get(key) > maxfreq){
                    maxfreq = map.get(key);
                    maxkey = key;
                }
            }
            System.out.println(maxkey);
            map.put(maxkey, -1);
        }
*/
    }
}