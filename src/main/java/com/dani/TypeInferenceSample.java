package com.dani;

import java.util.List;
import java.util.stream.Collectors;

public class TypeInferenceSample {

	public static void main(String[] args) {
		var daysOfWeek = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
		
		var daysLengths = daysOfWeek.stream().map(d -> d.length()).collect(Collectors.toList());
		
		System.out.println(daysLengths);
	}
}
