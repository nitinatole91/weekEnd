package com.testapp;

import java.util.Arrays;

public class LoadCSV2 {
	public static void main(String[] args) {
//		6.	Check if a string is a palindrome or not.
		String str="nitoin";
		String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(str.equals(reversed)? str+" is a palindrome." : str+" is not a palindrome.");
		
//		7.	Count the number of vowels and consonants in a string.
        String input ="dasdsd";
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {  // Check if letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
        
//        8.	Find the first non-repeating character in a string.
        String str1="dsfnjnsnd";
        int[] count = new int[256]; // Array to store count of characters

       
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
        }
        
        char result = '\0';
        for (int i = 0; i < str1.length(); i++) {
            if (count[str1.charAt(i)] == 1) {
                result = str1.charAt(i);
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        
//        9.	Reverse each word in a given string.  
       String reples="this is word";
        
        String[] words = reples.split(" ");  // Split string by spaces
        StringBuilder resultB = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();  // Reverse each word
            resultB.append(reversedWord).append(" ");
        }

        // Trim trailing space and print result
        System.out.println("Reversed words string: " + resultB.toString().trim());

//        10.	Check if two strings are anagrams.
        
        String str3="word";
        String str2="drow";
        
        // Remove spaces and convert to lowercase
        str3 = str3.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str3.length() != str2.length()) {
            System.out.println("Not anagrams (different lengths).");
        } else {
            // Convert strings to char arrays and sort
            char[] arr3 = str3.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr3);
            Arrays.sort(arr2);

            // Compare sorted arrays
            if (Arrays.equals(arr3, arr2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }


		
		
	}

}
