package com.nithin.springbootpractice.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "anarchy", "watermelon");

		// Predicates for filtering
		Predicate<String> startsWithA = word -> word.startsWith("a");
		Predicate<String> hasLengthGreaterThan3 = word -> word.length() > 3;

		// Combine predicates with 'and'
		Predicate<String> combinedPredicate = startsWithA.and(hasLengthGreaterThan3);
		
		
		List<String> filteredWords = words.stream().filter(combinedPredicate).collect(Collectors.toList());
		System.out.println(filteredWords);
		
		Predicate<String> orPredicate = startsWithA.or(hasLengthGreaterThan3);
		filteredWords = words.stream().filter(combinedPredicate).collect(Collectors.toList());

		System.out.println(filteredWords);
	}

}
