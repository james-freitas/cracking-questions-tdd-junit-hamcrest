package com.codeonblue.cracking.arrays_and_strings;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArraysAndStrings_1_1Test {

	@Test
	public void shouldTestIfAllCharactersInStringAreUnique(){
		ArraysAndStrings_1_1 question1 = new ArraysAndStrings_1_1();
		boolean result = question1.hasAllUniqueCharacters("basket");
		assertThat(result, is(equalTo(true)));
	}
	
	
}
