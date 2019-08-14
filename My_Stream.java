package capgemini.stream;

import java.util.function.Consumer;

public class My_Stream {
	public static void main(String[] args) {
		//generate an int array of 10
		int[] a= new int[10];
		//a[]={17,24,37,49,51,65,73,87,93,10};
		
		//fill it with random numbers between 0-100
		for (int index = 0; index < a.length; index++) {
			a[index]= (int)(Math.random()*100);
			//System.out.println(a[index]);
		//	My_Stream<int> a[] =System.out::println;
			
		}
		//print it

		for (int index = 0; index < a.length; index++) {
			System.out.println(a[index]);
		}
		
		System.out.println("Consumer in action....");
		Consumer<Integer> consumer= (Integer value) ->System.out.println(value);
		
		for (int index = 0; index < a.length; index++) {
			consumer.accept(a[index]);
		}
	}

}
