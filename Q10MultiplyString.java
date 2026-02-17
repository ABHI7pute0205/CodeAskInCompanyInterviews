/*
10)  Multiply Strings
Multiply two non-negative numbers represented as strings without converting to integers.
Example
Input: "123", "456" → "56088"

*/

public class Q10MultiplyString{
   public static void main(String args[]){

	String n1="123";
	String n2="456";

	int[] res = new int[n1.length()+n2.length()];

	for(int i=n1.length()-1;i>=0;i--){	// last digit of the  string num1 = 3
	   for(int j=n2.length()-1;j>=0;j--){	// last digit of the  string num2 = 6

		int dig1 = n1.charAt(i) - '0';	// eith 0 jar substract nahi kel tar te ascii value sobat operaions perform kar t	
		int dig2 = n2.charAt(j) - '0';
	
		int mul = dig1*dig2;

	// he je multuiplication aal te last chya ch index la store kar y ch tya sathi : indexOf i=2 + indexOf j=2 + 1 : i.e. 5 mhanje result array madhe he multiplicaion 5th index la store kara y ch 
		int sum = mul + res[i + j + 1];

/* Carry handle : 
sum = 18 + res[5]
    = 18

res[5] = 8
res[4] = 1 			Array now: [0,0,0,0,1,8]
*/
		res[i + j + 1] = sum % 10;   // find division 
		res[i + j] += sum/10;	    // store in result and remove last digit 
	   }
	}
	String ans = "";
	for(int x:res){
	   if(!(ans.length()==0 && x==0)){
		ans = ans + x;
	   }
	}
	if(ans.equals("")){
	   ans="0";
	}
	System.out.println(ans);

   }
}