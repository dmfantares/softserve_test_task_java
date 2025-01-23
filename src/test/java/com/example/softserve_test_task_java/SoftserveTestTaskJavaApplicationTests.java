package com.example.softserve_test_task_java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.softserve_test_task_java.utils.DuplicatedCharactersValidator;
import org.junit.jupiter.api.Test;

class SoftserveTestTaskJavaApplicationTests {

	@Test
	public void testDuplicatedCharacters() {
		String actual = "AABBCCD112233";
		String expected = "ABCD123";
		assertEquals(expected, DuplicatedCharactersValidator.optimizedDeleteDuplicatesFrom(actual));
	}

	@Test
	public void testNoDuplicatedCharacters() {
		String actual = "ABCD123";
		String expected = "ABCD123";
		assertEquals(expected, DuplicatedCharactersValidator.optimizedDeleteDuplicatesFrom(actual));
	}

	@Test
	public void testEmptyNoDuplicatedCharacters() {
		String actual = "";
		String expected = "";
		assertEquals(expected, DuplicatedCharactersValidator.optimizedDeleteDuplicatesFrom(actual));
	}

	@Test
	public void testNullString() {
		String actual = null;
		String expected = "";
		assertEquals(expected, DuplicatedCharactersValidator.optimizedDeleteDuplicatesFrom(actual));
	}

	@Test
	public void testTriplicatedCharacters() {
		String actual = "AAABBBCCCDDD11223333";
		String expected = "ABCD123";
		assertEquals(expected, DuplicatedCharactersValidator.optimizedDeleteDuplicatesFrom(actual));
	}

}
