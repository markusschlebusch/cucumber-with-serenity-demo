package de.adesso.maschl.webtest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class PhantomJS {

	
	  @Test
	  public void shouldHavePhantomJsBinary() {
	    String binary = System.getProperty("phantomjs.binary.path");
	    System.out.println(binary);
	    assertNotNull(binary);
	    assertTrue(new File(binary).exists());
	  }
	
}
