/*
14) Longest Substring Without Repeating Characters
Return the length of the longest substring without repeating characters.
Example
Input: "abcabcbb" → 3
*/

import java.util.*;

public class Q14LongestSubstring{
 	public static void main(String x[]){

	String s="abcabcbb";
	
/*
	int max=0;
	for(int i=0;i<s.length();i++){
	   int[] visited = new int[256];	// this is to check duplicate if found then store in this array 

	   int len=0;	// to count the length of the continious sequence 

	   for(int j=i;j<s.length();j++){	// start from the first character of the outer loop 
		char ch = s.charAt(j);

		if(visited[ch] == 1){		// check this character ya chya aadhe aale l hot ka i.e.  tya cha count jar equal to 1 asla tar aal hot and break loop
			break;
		}

		visited[ch]=1;	// jar nasl aale l tar tya cha count = 1 mark kara y cha and 
		len++;		// substring che length increse kara y che 
	   }
	if(len>max){	// check kel substring che length aadhe chya max length peksha greater aahe ka  asle tar update and print 
	   max=len;
	}
	}
	System.out.println(max);
*/

// OR 

	HashSet<Character> set = new HashSet<>();
	int start=0,max=0;

	for(int end=0;end<s.length();end++){
	    while(set.contains(s.charAt(end))){		// check kar t give character set madhe aahe ka nahi 
		set.remove(s.charAt(start));		// asl tar starting ch remove hot  
		start++;
	    }
	set.add(s.charAt(end));		// set madhe fakt continous character store hotat 

	int len = end - start + 1;

	if(len > max){
	   max=len;
	}
	}
	System.out.println(max);

	}
}