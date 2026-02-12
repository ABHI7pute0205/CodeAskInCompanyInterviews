// find the union of the array 


import java.util.*;

public class UnionOfArray{
	public static void main(String x[]){

	int[] a={1,2,3,4};
	int[] b={2,4,5,7};

	HashSet<Integer> set = new HashSet<>();

	for(int num:a){
		set.add(num);
	}

	for(int num:b){
		set.add(num);
	}

	System.out.println(set);
	}
}