package org.pageexecution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.w3c.dom.ls.LSOutput;

@RunWith(Suite.class)
@SuiteClasses({ FinishLoginPage.class, StartLoginPage.class })

public class TotalExecution {

	public static void main(String[] args) {

		Result run = JUnitCore.runClasses(FinishLoginPage.class, StartLoginPage.class);
		System.out.println(run.getFailureCount());
		System.out.println(run.getRunCount());
		System.out.println(run.getIgnoreCount());
		System.out.println(run.getRunTime());
		System.out.println(run.wasSuccessful());
			
	}
	 
 }