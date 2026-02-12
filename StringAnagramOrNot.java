/*
6️) Valid Anagram
Given two strings s and t, return true if t is an anagram of s.
Example
Input: s="anagram", t="nagaram" → true
*/


import java.util.*;

public class StringAnagramOrNot{
    public static void main(String x[]){

	String s1 = "anagram";
	String s2 = "nagaram"; 

	boolean isAnagram=true;
/*
	if(s1.length() != s2.length()){
	   System.out.println(false);
	   return;
	}	

	for(int i=0;i<s1.length();i++){		// String 1 madhla each character select kara y cha 

	   int count1=0 , count2=0;

	   for(int j=0;j<s1.length();j++){	// inner loop cha 0th index cha character check kar a cha tya ch s1 string madhe kiti vela aala ye  
		if(s1.charAt(i) == s1.charAt(j)){   // check kart string 1 madhl each character tya ch string madhe kiti vela occur zal ye and same te ch character string-2 madhe tevdhya ch veles occur zal ka nahi te check kar t 
		   count1++;
		}

		if(s1.charAt(i) == s2.charAt(j)){	// then check this character again with character in s2 is apper with that much time 
		  count2++;
		}
	   }
	   if(count1 != count2){	// 2 n he string chya each character cha count check kar t jar NOT equal asla tar not anagram 
		isAnagram=false;
		break;
	   }
	}
	System.out.println(isAnagram);

*/	
// 	OR


	HashMap<Character,Integer> map1 = new HashMap<>();

// count the frequency of the each character of the string 
	for(int i=0;i<s1.length();i++){
	   if(map1.containsKey(s1.charAt(i))){
		map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
	   }
	   else{
		map1.put(s1.charAt(i),1);
	   }
	}

// remove the charctares from the String -2 

	for(int i=0;i<s2.length();i++){
	  char ch = s2.charAt(i);

	  if(!map1.containsKey(ch)){
		System.out.println("False");
		return;	// he return kel ka code ch execution stop hot 
	  }
	map1.put(ch,map1.get(ch)-1);
	 
	}
	System.out.println(true);

/*
	TreeMap<Character,Integer> map1 = new TreeMap<>();
	TreeMap<Character,Integer> map2 = new TreeMap<>();

	for(int i=0;i<s1.length();i++){
	   if(map1.containsKey(s1.charAt(i))){
		map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
	   }
	   else{
		map1.put(s1.charAt(i),1);
	   }
	}	

	for(int i=0;i<s2.length();i++){
	   if(map2.containsKey(s2.charAt(i))){
		map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
	   }
	   else{
		map2.put(s2.charAt(i),1);
	   }
	}
	System.out.println(map1);
	System.out.println(map2);

	if(map1.equals(map2)){
		System.out.println("Anagram");
	}
	else{
		System.out.println("Not Anagram");
	}

*/

// to compaire two map's
/*
boolean isSame=true;

for(Character key: map1.keySet()){
    if(!map2.containsKey(key) ||
       !map1.get(key).equals(map2.get(key))){
        isSame=false;
        break;
    }
}
System.out.println(isSame);

*/

    }
}