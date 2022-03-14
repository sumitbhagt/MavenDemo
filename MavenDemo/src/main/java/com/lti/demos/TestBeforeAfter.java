package com.lti.demos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBeforeAfter {
	@Test
	public void testadd()
	{
		Calculator c=new Calculator();
		int r=c.add(300,200);
		Assertions.assertEquals(500,r);
		
	}

}
