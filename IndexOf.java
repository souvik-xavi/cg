package com.cg;

public class IndexOf {
	public static void main(String[] args) {
	    String str1 = "Learn Java";
	    int result;

	    // getting index of character 'J'
	    result = str1.indexOf('J');
	    System.out.println(result); // 6

	    // the first occurrence of 'a' is returned
	    result = str1.indexOf('a');
	    System.out.println(result); // 2

	    // character not in the string
	    result = str1.indexOf('j');
	    System.out.println(result); // -1

	    // getting the index of "ava"
	    result = str1.indexOf("ava");

	    System.out.println(result); // 7

	    // substring not in the string
	    result = str1.indexOf("Java");

	    System.out.println(result); // 6

	    // index of empty string in the string
	    result = str1.indexOf(" ");

	    System.out.println(result); // 5
	}

}
