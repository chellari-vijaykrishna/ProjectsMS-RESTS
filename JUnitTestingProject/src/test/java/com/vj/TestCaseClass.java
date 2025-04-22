package com.vj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestCaseClass {

	private static TestingJUnit service;
	
	private static StringReverseClass  rev;

	@BeforeAll
	public static void creatObject() {
		service = new TestingJUnit();
		rev = new StringReverseClass();
	}

	@Test
	public void addTest() {
		int a = service.add(1, 3);
		assertEquals(a,4);
	}

	
	@ParameterizedTest
	@ValueSource(strings ={"madam","CaC"})
	public void testReverseString(String res) {
		boolean resu = rev.ifStringReverse(res);
		assertTrue(resu);
	}
	
	
	@Test
	public void Ex() {	
		assertThrows(IllegalArgumentException.class,()-> rev.changeToInteger("123r"));
	}
	
	@Test
	public void Exx() {	
		assertThrows(IllegalArgumentException.class,()-> rev.changeToInteger(null));
	}
	
	@Test
	public void Excx() {	
		Integer res = rev.changeToInteger("264");
		assertEquals(264,res);
	}
	

	@Test
	public void addSub() {
		int a = service.sub(3, 1);
		assertEquals(2,a);
	}
	
	@Test
	public void addMul() {
		int a = service.mul(3, 1);
		assertEquals(3,a);
	}
	
	
	@AfterAll
	public static void tear() {
		service = null;
		rev = null;
	}
}
