package com.task;

import java.util.HashMap;

public class Question_Three {
	public static void main(String[] args) {
		String str = "Heyy my name is Tina khachane.";

		// Create a HashMap to store word counts
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		String[] words = str.split("\\s+");

		for (String word : words) {
			// Remove any punctuation marks from the word
			word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

			if (word.length() > 0) {
				// Update the count in the HashMap
				wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
			}
		}

		// Display the word counts
		System.out.println("Word counts:");
		for (String word : wordCountMap.keySet()) {
			System.out.println(word + ": " + wordCountMap.get(word));
		}

		// Total number of words
		int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total number of words: " + totalWords);
	}
}
