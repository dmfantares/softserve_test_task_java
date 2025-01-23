package com.example.softserve_test_task_java;

import com.example.softserve_test_task_java.utils.DuplicatedCharactersValidator;

public class SoftserveTestTaskJavaApplication {

	public static void main(String[] args) {

		var givenString = "AABBCCD112233";
		System.out.print(DuplicatedCharactersValidator.optimizedDeleteDuplicatesFrom(givenString));

	}
}
