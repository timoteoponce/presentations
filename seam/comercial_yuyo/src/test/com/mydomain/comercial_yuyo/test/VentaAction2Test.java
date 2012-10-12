package com.mydomain.comercial_yuyo.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class VentaAction2Test extends SeamTest {

	@Test
	public void test_ventaAction2() throws Exception {
		new FacesRequest("/ventaAction2.xhtml") {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{ventaAction2.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{ventaAction2.ventaAction2}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{ventaAction2.value}").equals("seam");
			}
		}.run();
	}
}
