/*
13) Isomorphic Strings
Two strings are isomorphic if characters map one-to-one.
Example
Input: "egg", "add" → true	
 	e-a -> map
	g-d -> map
	g-d -> map
 
Input: "foo", "bar" → false
	f-b -> map
	o-a -> map
	o-r -> mismatch mhaje aadhe chya step la o-a hot tar hya pan step la o-a ch lag t hot dusr nako character asl tar mismatch 
________________________________________
एका string मधल्या प्रत्येक character ला दुसऱ्या string मधला एक unique character match होतो.
*/

import java.util.*;

public class Q13IsomorphicStrings{
   public static void main(String x[]){
	
	String s1 ="egg";	// he isomorphic aahe 
	String s2 ="add";

	if(s1.length() != s2.length()){		// length different NOT isomorphic 
	  System.out.println(false);
	  return;
	}

	char[] map1 = new char[256];		// to store the character 
	char[] map2 = new char[256];

	boolean valid = true;

	for(int i=0;i<s1.length();i++){		// loop start from the s1 string 
	   char ch1 = s1.charAt(i);
	   char ch2 = s2.charAt(i);

	   if(map1[ch1] == 0 && map2[ch2] == 0){	// map1 chya array madhe and 2 chya array madhe 0 asle tar he charater store kara y che alternate map1 chya array madhe 2nd string che character store kara  y che and map2 array madhe s1 string che character store kara y che 
		map1[ch1] = ch2;
		map2[ch2] = ch1;
	   }
	   else if(map1[ch1] != ch2 || map2[ch2] != ch1){	// check kel array 1 che character array 2 chya character sobat match hotat ka nahi jar nasle hot tar false 
		valid=false;
		break;
	   }
	}
	System.out.println(valid?"true":"false");
   }
}