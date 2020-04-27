package com.devops.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.devops.training.JenkinsCalculator;

public class JenkinsCalculatorTest {
	
	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.addNumbers(5, 5));
	}
	
	@Test
	public void subttractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5, myCalc.subtractNumbers(10, 5));
	}

}
