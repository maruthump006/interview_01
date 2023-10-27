package org.reverse;

public class ReverseString {
	public static void main(String[] args) {
		String originalString = "Inmakes Infotech", ReverseName = "";
		// GET ORIGINAL STRING
		System.out.println("ORIGINAL STRING : " + originalString);
		for (int i = 0; i < originalString.length(); i++) {
			char ch = originalString.charAt(i);// extracts each char
			ReverseName = ch + ReverseName;// add each char
		}
		//get reverse string
		System.out.println("REVERSE NAME : " + ReverseName);

	}
}
