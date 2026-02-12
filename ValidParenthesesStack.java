/*
2)	Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
A string is valid if:
•	Open brackets are closed by the same type.
•	Open brackets are closed in the correct order.
Example
Input: "()[]{}" → true
Input: "(]" → false

*/

import java.util.*;
public class ValidParenthesesStack{
	public static void main(String x[]){


	 String s = "()[]{}";

	 Stack<Character> stack = new Stack<>();
	 Boolean valid=true;

	for(int i=0;i<s.length();i++){
	  char ch = s.charAt(i);
	  if(ch=='(' || ch=='{' || ch=='['){	// initially push this all open braces in the stack | he element open braces sagle stack madhe gele so aata string madhe sagle close value i.e. ) ] } he ch rahile     so thats why ch = ) } ] he ch yeil 
		stack.push(ch);
	  }
	  else{
		if(stack.isEmpty()){		// check stack is empty or not if empty then false 
		 valid=false;
		 break;
		}
		char top = stack.pop();		// pop i.e. remove the top element of the stack and store in a top 

		if((ch==')' && top !='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){	// compaire the braces which are in a stack and in a string jar ) brace and brace from stack i.e ( are equal or NOT  
		   valid = false;
		   break;
		}
	  }
	}
	if(!stack.isEmpty())	// check if stack is NOT Empty then valid equal's false meanse stack madhe kahi braces rahile ye ki extra hote and compaire kara y che rahile 
	  valid=false;

	System.out.println(valid);

	}
}