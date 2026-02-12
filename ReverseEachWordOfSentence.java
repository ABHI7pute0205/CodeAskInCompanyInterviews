/*
Q3. Reverse Each Word in a Sentence but Keep Word Order. 
Example: 
Input → "Java is fun" 
Output → "avaJ si nuf" 
*/

public class ReverseEachWordOfSentence{
	public static void main(String x[]){

	String str = "Java is Fun";

// split the each word from the string using Space and Store in a String Array 
	String[] words = str.split(" ");
	
// loop traverse upto length of the words i.e. the number of the words present in the string array 
	for(int i=0;i<words.length;i++){

// store the reverse word 
	  String rev = "";

// this loop traverse from end of the each word to the 0th index meanse this is the reverse loop 
		for(int j=words[i].length()-1;j>=0;j--){
		   rev = rev + words[i].charAt(j);		// array madh ly each word la reverse order madhe store kel 
		}
	   System.out.print(rev+" ");		// and print the reverse word 
	} 	

	}
}