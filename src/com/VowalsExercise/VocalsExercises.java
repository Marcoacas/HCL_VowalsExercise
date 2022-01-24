package com.VowalsExercise;

public class VocalsExercises {

	public static void main(String[] args) {
		VocalsExercise("happy new year 2022");

	}
	
	public static void VocalsExercise(String sentence) {
		int countVocals = 0;
		System.out.println("The length of  your string is: " + sentence.length());
		for(int i=3; i<sentence.length();i=i+3) {
			if(sentence.charAt(i-1) == 'a' ||
			   sentence.charAt(i-1) == 'e' ||
			   sentence.charAt(i-1) == 'i' ||
			   sentence.charAt(i-1) == 'o' ||
			   sentence.charAt(i-1) == 'u') {
				countVocals =+1;
				System.out.println("The vowel in position " + (i-1) + " is " + sentence.charAt(i-1));
			}
		}
		System.out.println("There is " + countVocals + " vowels in your sentence");
	}

}
