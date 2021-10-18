package com.dani;

public class SwitchExpressionSample {

	public static void main(String[] args) {
		
		var dayNbr = 0;
		
		var dayOfWeek = switch(dayNbr) {
		case 0 -> {
			System.out.println("Adding this line for complex case");
			yield "Sunday";
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> throw new IllegalArgumentException();
		};
		System.out.println("dayNbr: %d, dayOfWeek: %s".formatted(dayNbr, dayOfWeek));
	}
}
