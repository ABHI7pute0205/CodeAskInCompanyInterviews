/*
11)  Valid Parenthesis String (* allowed)
Given a string with '(', ')', and '*', return true if it can be valid.
* can be '(', ')', or empty.
Example
Input: "(*))" → true
*/

import java.util.*;
public class Q11ValidParenthesis{
    public static void main(String x[]){

	String s = "(*))";

	int low=0 , high=0;
	boolean valid = true;

	for(int i=0;i<s.length();i++){
	    char ch = s.charAt(i);

		if(ch == '('){	// bracket jar open asle tar both low , high ++ increse hotat 
		  low++;
		  high++;
		}
		else if(ch == ')'){	// bracket jar close asle tar  low , high -- decrese kara y ch 
		  low--;
		  high--;
		}
		else{	// jar * asla tar he execute hoil 
		   low--;
		   high++;
		}

		if(high<0){	//  low jar < less than 0 asla tar valid false and break 
		   valid=false;
		   break;
		}

		if(low < 0){	// low jar < less than 0 asla na tar low che value 0 ne  initialise kara y che 
		   low=0;
		}
	}
	if(valid && low == 0){    	// jar valid asle and low ==0 jar asla tar true 
	   System.out.println("true");
	}
	else{
	   System.out.println("false");
	}

    }
}