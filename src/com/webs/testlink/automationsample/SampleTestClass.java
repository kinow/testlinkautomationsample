package com.webs.testlink.automationsample;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import br.eti.kinoshita.tap4j.ext.testng.TestTAPReporter;

@Listeners(value={TestTAPReporter.class})
public class SampleTestClass {
	@Test
	public void PassTest(){
		assertEquals("TESTLINKSAMPLEPASS","TESTLINKSAMPLEPASS");
	}
	@Test
	public void FailureTest(){
		assertEquals("TESTLINKSAMPLEFailure","TESTLINKSAMPLEPASS");
	}
}
