package com.org.pages;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B {

	@Test
	private void methodA() {
		SoftAssert softAssert = new SoftAssert();
		// TODO Auto-generated method stub
		System.out.println("A");
		softAssert.assertTrue(false);
		softAssert.assertTrue(true);
		softAssert.assertAll();

	}
	@DataProvider(name = "data")
	private Object[][] data() {
		// TODO Auto-generated method stub

		Object[][] a = new Object[3][1];
	}
}
