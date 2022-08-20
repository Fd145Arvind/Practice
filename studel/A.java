package com.Stream_java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		  List<Integer> list=Arrays.asList(1,2,2,3,4,5,6,7,1);
		  
		  Set<Integer> set=new LinkedHashSet<Integer>();
		  
		  
		  // 1.  Remove Duplicate using java 8
		  List<Integer> removeDuplicate = list.stream().distinct().collect(Collectors.toList());
		  System.out.println("Remove Duplicate using java 8");
		  removeDuplicate.stream().forEach(s->System.out.print(s+","));
		  
		  System.out.println("\n"+"______________");
		  //2. Find first Duplicate
		 Integer firstDuplicate = list.stream().filter(s->!set.add(s)).findFirst().orElse(null);
		 System.out.println("First Duplicate using java 8");
		 System.out.println(firstDuplicate);
		 
		 System.out.println("\n"+"______________");
		 //3. Reverse Using java 8
		 Collections.reverse(removeDuplicate); 
		 System.out.println("Reverse element using java 8");
		 removeDuplicate.stream().forEach(s->System.out.print(s+","));

		 System.out.println("\n"+"______________");
		 //4. Print value in between 3 to 6
		 System.out.println("Print valu in between 3 to 6");
		removeDuplicate.stream().forEach(s->{if(s<6 && s>3) {System.out.print(s+",");} });
		
		//5. Even no using java 8
		System.out.println("\n"+"______________");
		 System.out.println("Even no using java 8");
		removeDuplicate.stream().filter(s-> (s%2==0)).forEach(s->System.out.print(s+","));
		
		//6. Odd no using java 8
				System.out.println("\n"+"______________");
				 System.out.println("Odd no using java 8");
				removeDuplicate.stream().filter(s-> (!(s%2==0))).forEach(s->System.out.print(s+","));
				
		//7.Find highest No From List
				System.out.println("\n"+"______________");
				 System.out.println(" Find highest No From List using java 8");
				Integer max = removeDuplicate.stream().findFirst().orElse(0);
				System.out.println(max);
				
		//8.Find highest No From List
				System.out.println("\n"+"______________");
				 System.out.println(" Find highest No From List using java 8");
			
				removeDuplicate.stream().skip(1).limit(1).forEach(s->System.out.println(s));
				
				// 8. map
				 removeDuplicate.stream().map(s-> s+1).collect(Collectors.toList());
				
				 List<Integer> collect = list.stream().sorted(Comparator.comparing(t ->t.toString() ).reversed()).collect(Collectors.toList());
						 
				System.out.println(collect);
				
	    //9.Print Duplicate From List
				Set<Integer> duplicate = list.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
				System.out.println("\n"+"______________");
				duplicate.forEach(s->System.out.print(s+","));
	}

}
