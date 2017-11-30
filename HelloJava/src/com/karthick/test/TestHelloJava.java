package com.karthick.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.karthick.java.HelloJava;

public class TestHelloJava {

	@Test
	public void testHelloJava() {
		HelloJava hj = new HelloJava();
		int result = hj.addTwo(2, 3);
		assertEquals(2, result);
	}

}
