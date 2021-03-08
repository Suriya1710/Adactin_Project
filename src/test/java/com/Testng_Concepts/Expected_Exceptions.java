package com.Testng_Concepts;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public static void array_Datas() {

		int a[] = new int [2];
		
		a[0] = 10;
		a[1] = 20;
		
		System.out.println(a[23]);
	}
	
	

}
