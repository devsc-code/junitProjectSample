package com.in28minutes.junit.helper;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;

public class StringHelperTest {
	
	StringHelper ob=new StringHelper();
	
	@Before
	public void before() {
		System.out.println("at before");
	}
	
	@After
	public void After() {
		System.out.println("at After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@beforeClass");
	}
	
	@Test
	public void test1TruncateAInFirst2Positions() {
		assertEquals("CD",ob.truncateAInFirst2Positions("AACD"));
	}
	
	@Test(timeout=700)
	public void test2TruncateAInFirst2Positions() {
		for(int i=0;i<1000000;i++)
		assertEquals("CD",ob.truncateAInFirst2Positions("ACD"));
	}

}


