package capgemini.stream;

import java.util.Arrays;
import java.util.List;

public class Mapping_Stream{
public static void main(String[] args) {
	
	List<String> locations = Arrays.asList(new String[] {"pune","Chennai","Bangalore","Noida"});
	System.out.println("Word length for locations:");
	locations.stream().map(String::length).forEach(System.out::print);
	
	//locations.stream().map(City::new).forEach(System.out::print);
	
}
}
