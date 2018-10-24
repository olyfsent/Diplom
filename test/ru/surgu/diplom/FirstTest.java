package ru.surgu.diplom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTest {

	@Test
	void firstOperation() {
		First first = new First();
		assertEquals(first.firstOperation(), "Hello world");
	}
}