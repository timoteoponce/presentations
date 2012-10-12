package com.mydomain.comercial_yuyo.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class ProductoEdit2Test extends SeamTest {

	@Test
	public void test_productoEdit2() throws Exception {
		new FacesRequest("/productoEdit2.xhtml") {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{productoEdit2.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{productoEdit2.productoEdit2}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{productoEdit2.value}").equals("seam");
			}
		}.run();
	}
}
