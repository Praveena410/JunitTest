package org.pageexecution;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.pomfactorty.StartPageFactory;

public class StartLoginPage extends BaseClass {

	StartPageFactory spf = new StartPageFactory();

	@Test
	public void method1() {
		// StartPageFactory spf = new StartPageFactory();
		enterdetails(spf.getUsername(), "Praveena");
		enterdetails(spf.getPassword(), "Ramesh");
		System.out.println("Method1 PraveenRamesh Success");

	}

	@Before
	public void before() {
		System.out.println("BeforeEveryTest");
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void method() {
		// StartPageFactory spf = new StartPageFactory();
		enterdetails(spf.getUsername(), "SujaySiya");
		enterdetails(spf.getPassword(), "MyLaddus");
		System.out.println("Method SujaySiyaMyLaddus Success");
	}

	@After
	public void after() {
		System.out.println("AfterEveryTest");
	}

	@Test
	public void methodA() {
		// StartPageFactory spf = new StartPageFactory();
		enterdetails(spf.getUsername(), "Vibha");
		enterdetails(spf.getPassword(), "Sana");
		System.out.println("MethodA VibhaSana Success");

	}

}
