package LoopsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForLoop {
	

	public static void main(String [] args){
	
	
		
	List <Integer> grades = new ArrayList<>();
	
	grades.add(90);
	grades.add(75);
	grades.add(85);
	grades.add(100);
	
	System.out.println("Before the sort");
	for(int index=0; index<grades.size(); index++){
		System.out.println(grades.get(index));
	}
	System.out.println("---------------------------");
	Collections.sort(grades);
	System.out.println("After sort");
	System.out.println(grades);
	
	System.out.println("------------------------------");
	System.out.println("Sum using while loop");
	int index=0;
	int sum=0;
	while(index<grades.size()) {
		
		int netSum=grades.get(index);
		sum+=netSum;
		System.out.println(sum);
		index++;
	}
	
	
	System.out.println("----------------------------");
	System.out.println("Sum using do-while while resetting sum to 0");
	int i=0;
	sum=0;
	do {
		int netSum=grades.get(i);
		sum+=netSum;
		System.out.println(sum);
		i++;
	}while(i<grades.size());
	
	}
}
