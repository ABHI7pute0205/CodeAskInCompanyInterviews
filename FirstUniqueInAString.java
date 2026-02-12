/*
4️) First Unique Character in a String
Given a string s, return the first non-repeating character.
If none exists, return _.
Example
Input: "leetcode" → "l"
Input: "aabb" → "_"

*/

import java.util.*;

public class FirstUniqueInAString{
    public static void main(String x[]){

	String str = "leetcode";

/*
// why linkedHashMap -> because it maintains the insertion order of each element in a map 
	HashMap<Character,Integer> map = new LinkedHashMap<>();

	for(int i=0;i<str.length();i++){
	  char ch = str.charAt(i);
	   if(map.containsKey(ch)){
		map.put(ch,map.get(ch)+1);
	   }
	   else{
		map.put(ch,1);
	   }
	}
	System.out.println(map);

	boolean found=false;

	Set<Map.Entry<Character,Integer>> set = map.entrySet();
	for(Map.Entry<Character,Integer> e:set){
	   if(e.getValue()==1){
		System.out.println("First Unique Character : "+e.getKey());
		found=true;
		break;
	   }
	}
	if(!found){
	   System.out.println("_");
	}
*/

	for(int i=0;i<str.length();i++){
	   int count=0;

	   for(int j=0;j<str.length();j++){
		if(str.charAt(i) == str.charAt(j)){	// check the current Character is equal with the next if yes then increse the count if not then move on next 
		   count++;
		}
	   }
	if(count==1){		// check the character which has the count ==1 and print it and stop execution 
	   System.out.println(str.charAt(i));
	   return ;
	}
	}
	System.out.println("_");
	

    }
}