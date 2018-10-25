package com.codeonblue.cracking.arrays_and_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataStructures {

	
	public HashMap<Integer, Student> buildMap(Student[] students) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for (Student s: students) {
			map.put(s.getId(), s);
		}
		return map;
	}
	
	public ArrayList<String> merge(String[] words, String[] more){
		ArrayList<String> sentence = new ArrayList<>();
		for(String w: words) sentence.add(w);
		for(String w: more) sentence.add(w);
		return sentence;
	}
	
	public ArrayList<String> mergeUsingAddAll(String[] words, String[] more){
		ArrayList<String> sentence = new ArrayList<>();
		sentence.addAll(Arrays.asList(words));
		sentence.addAll(Arrays.asList(more));
		return sentence;
	}
	
	// Question: What is the running time of this code?
	public String makeSentence(String[] words){
		StringBuffer sentence = new StringBuffer();
		for(String w: words) sentence.append(w);
		return sentence.toString();
	}
	/*
		Answer: O(n^2), where n is the number of letters in 
		sentence. Here’s why: each time you append a string 
		to sentence, you create a copy of sentence and run 
		through all the letters in sentence to copy them over.
		If you have to iterate through up to n characters 
		each time in the loop, and you’re looping at least n 
		times, that gives you an O(n^2) run time. Ouch!
	*/
	
}
