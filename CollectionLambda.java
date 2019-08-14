package capgemini.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionLambda {
public static void main(String[] args) {
	List<String> cities = new ArrayList<>();
	cities.add("pune");
	cities.add("Bangalore");
	cities.add("Mumbai");
	cities.add("Chennai");
	
	//cities.Stream().distinct().forEach(city->System.out::println(city));
	
	/*List<String> collect = cities.stream().distinct().collect(Collectors.toList());
	System.out.print(collect);*/
	
	Set<String> set = cities.stream().collect(Collectors.toSet());
	System.out.println(set);
	
	//cities.parallelStream().forEach(System.out::println);
	//cities.stream().distinct().
	
	//cities.forEach(System.out::println);
}
}
