package com.meleemistress.smc_take2.smc_core;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import example_1.Example1;
import example_1.Example1Context;
public class Example1Test {

	@Test
	public void testHello() throws Exception{
		Example1 ex = mock(Example1.class);
		Example1Context ctx = new Example1Context(ex);
		ctx.EOS();
		verify(ex).Acceptable();
		
	}
	
	@Test
	public void testGoodString() throws Exception {
		Example1 ex = new Example1();
		assertTrue(ex.CheckString("000001"));
		
	}
	
	@Test
	public void testBadString() throws Exception {
		Example1 ex = new Example1();
		assertFalse(ex.CheckString("10"));
	}
}
