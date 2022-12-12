package org.pageexecution;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.pomfactorty.StartPageFactory;

public class FinishLoginPage extends BaseClass {

	StartPageFactory spf = new StartPageFactory();

	
	@Ignore
	@Test
	public void method1() {
		// StartPageFactory spf = new StartPageFactory();
		enterdetails(spf.getUsername(), "Revathi");
		enterdetails(spf.getPassword(), "Karthi");
		System.out.println("Method1 RevathiKarthi Success");

	}

	@Before
	public void before() {
		System.out.println("BeforeEveryTest");
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void method() {
		// StartPageFactory spf = new StartPageFactory();
		enterdetails(spf.getUsername(), "Priya");
		enterdetails(spf.getPassword(), "Kannan");
		System.out.println("Method PriyaKannan Success");
	}

	@After
	public void after() {
		System.out.println("AfterEveryTest");
	}

	@Test
	public void methodA() {
		// StartPageFactory spf = new StartPageFactory();
		enterdetails(spf.getUsername(), "Lakshitha");
		enterdetails(spf.getPassword(), "Yathrika");
		System.out.println("MethodA LakshithaYathrika Success");

	}

}
