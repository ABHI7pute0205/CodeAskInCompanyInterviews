/*
12) Word Pattern
Check if a string follows a given pattern.
Example
pattern = "abba"
      a   b   b   a      --> a-> dog  b-> cat b-> cat -> dog    ---> true   yat la jar last a la dusr kahi ast fish vagere tar false returnkel ast
s = "dog cat cat dog" → true
_______________________________________________
Pattern मधला प्रत्येक character घ्यायचा.
Sentence मधला word घ्यायचा.
Check करायचं:
Same character = same word असायला हवा.
Different character = different word असायला हवा.
______________________________________________
Pattern letter आणि word मध्ये one-to-one mapping असायला हवी.
Same letter → same word.
Order change झाला तर invalid.

*/

import java.util.*;

public class Q12WordPattern{
   public static void main(String x[]){

	String pattern = "abba";
	String s = "dog cat cat dog";
/*
	String map[] = new String[256];	// this is to check the each character 

	int i=0,j=0;
	boolean valid=true;		// initially we consider it follow the pattern 


	while(i<pattern.length() && j<s.length()){	// he loop pattern and string word chya length parent execute hoil i.e. start to end 
	   
	  String word=""; // this is to extract word from string s manually

	  while(j<s.length() && s.charAt(j) != ' '){   //je loop string chya length parent execute kel and && tya string madhle each character check kel te != space aadhe ka jar asla tar te character combined karun word create kela  
		word += s.charAt(j);
		j++;
	  }	
	  j++; 	// this is to skip the space between the words  | var ti loop madhe space bhetli ka ti space skip karun part next word create kar nya sathi while chya baher ekda j++ kela to skip the space 

	  char p = pattern.charAt(i);	// ek word create zala ka tya pattern madhun single character extract kela and 

	  if(map[p]==null){	// to jo  string cha array create kela ye tya t check kel he je extracted character tya array madhe aahe ka jar nasla tar loop madhe enter hoil 

		for(int k=0;k<256;k++){		// this loop is to traverse the 256 string character array 

		   if(map[k] != null && map[k].equals(word)){	// to array jar != null asla tar and tya array madhl characer equals to word jar asla tar valid pattern match nahi kar t so false and stop further execution 
			valid=false;
			break;
		   }
		}
		map[p]=word;
	  } 
	  else if(!map[p].equals(word)){		// to pattern cha extracted character equals  word jari nasla tari valid false
		valid=false;
		break;
	  }
	  i++;		// this is to check the other character of the pattern 
	}
	if(i != pattern.length() || j<s.length()){	// pattern madhe jar jast character asle tari valid false 
	   valid=false;
	}
	System.out.println(valid?"true":"false");
*/
	// OR 


	HashMap<Character,String> map = new HashMap<>();
	
	String[] words = s.split(" ");

	if(pattern.length() != words.length){ 	// words is an array so to get size of array we use simple 'length'
	  System.out.println(false);
	  return;
	}

	for(int i=0;i<pattern.length();i++){
	  char p = pattern.charAt(i);	// take a single character from the pattern 
	  String w = words[i];		// take a single word from the string array

	  if(map.containsKey(p)){
		if(!map.get(p).equals(w)){
		   System.out.println(false);
		   return;
		}
	  }
	  else{
		if(map.containsValue(w)){
		   System.out.println(false);
		   return; 
		}
	   map.put(p,w);
   	  }
	}
	System.out.println(true);

   }
}