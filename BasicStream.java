package capgemini.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class BasicStream {
	public static void main(String[] args) {
		Integer[] nums = new Integer[10];
		for (int index = 0; index < nums.length; index++) {
			nums[index]= (int) (Math.random()*100);
			
		}
		nums = new Integer[]{1,2,3,4,5,5,4,3,2,1};
		//obtaianing a stream
		Stream<Integer> stream0 = Arrays.stream(nums);
		
		//consumer ->lambda Expression
		//stream0.forEach((value) ->System.out.println(value));
		//stream0.forEach(System.out::print);
		
		//stream0.distinct().forEach(System.out::println);
		//stream0.distinct().limit(3).forEach(System.out::println);
		
		//print odd numbers only..
		//Predicate<Integer> oddPredicate = (value)-> value%2==0;
		//stream0.filter(oddPredicate).forEach(System.out::println);
				//long count =stream0.count();
		//print min
				//stream0.sorted().limit(1).forEach(System.out::println);
				
				//print max
			//using comparator
		Comparator<Integer> comp = (num1,num2)->(num1>num2?1:num2>num1?-1:0);
		Optional<Integer> optionalMax = stream0.max(comp);
		// Optional<Integer> optionalMax= stream0.max((num1,num2)->(num1>num2?1:num2>num1?-1:0));
		// System.out.println(optionalMax.get());
	}

}
