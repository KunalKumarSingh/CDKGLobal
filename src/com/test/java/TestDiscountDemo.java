package com.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.java.DiscountDemo;

public class TestDiscountDemo {
	
	@Test
	public void testFindFinalAmount()
	{
		assertEquals(1000,DiscountDemo.findFinalAmount(1000));
		assertEquals(13500,DiscountDemo.findFinalAmount(15000));
		assertNotSame(14000,DiscountDemo.findFinalAmount(15000));
		
	}

}
