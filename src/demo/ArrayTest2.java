package demo;

import java.util.Arrays;
import java.util.List;

public class ArrayTest2 {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Lambda Expression
//		ls.forEach(a -> System.out.println(a));

		// API
		ls.stream().sorted().forEach(x -> System.out.println(x));

	}

}
