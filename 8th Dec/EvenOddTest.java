package com.main.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.EvenOdd;

public class EvenOddTest {
		@Test
		public void test() {
			//assertEquals(true,EvenOdd.findEvenOdd(4));
			//assertEquals(true,EvenOdd.findEvenOdd(5));
			assertEquals(false,EvenOdd.findEvenOdd(4));

		}
	}
