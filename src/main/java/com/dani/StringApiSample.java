package com.dani;

public class StringApiSample {

	public static void main(String[] args) {
		String str = "";

		System.out.println("""
				str: "" """);
		System.out.println("str.isEmpty()" + str.isEmpty());
		System.out.println("str.isBlank()" + str.isBlank());

		str = " ";

		System.out.println("""
				str: " " """);
		System.out.println("str.isEmpty()" + str.isEmpty());
		System.out.println("str.isBlank()" + str.isBlank());
		
		str = """
				line1
					line2
				 line3""";
		System.out.println("str: \n%s".formatted(str));
		System.out.println("str.lines().count(): " + str.lines().count());
	}
}
