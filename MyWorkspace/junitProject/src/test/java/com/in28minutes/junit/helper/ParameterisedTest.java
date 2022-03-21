package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParameterisedTest {
	StringHelper o=new StringHelper();
	private boolean expectedOutput;
	private String input;
	public ParameterisedTest(String input,String expectedOutput)
	{
		System.out.println(input);
		this.input=input;
		if(expectedOutput.equals("true"))
		{
			this.expectedOutput=true;
		}
		else
		{
			this.expectedOutput=false;
		}
		
	}
	@Parameters
	public static Collection<String[]> testCases()
	{
		String [][] ob= {{"AABBAA","true"},{"ABC","false"}};
		return Arrays.asList(ob);
	}
	@Test
	public void test() {
		assertEquals(expectedOutput,o.areFirstAndLastTwoCharactersTheSame(input));
	}

}
