package app.test;

import org.junit.Test;

import app.StringUtil;
import org.junit.Assert; 

public class StringUtilTest {
	
	@Test
	public void testIsVazio() {
		boolean b;
	
		b = StringUtil.isVazio("abc");
		Assert.assertFalse(b);
		
		b = StringUtil.isVazio(null);
		Assert.assertTrue(b);
		
		b = StringUtil.isVazio("");
		Assert.assertTrue(b);
		
	}
	
	@Test
	public void testReverso() {
		String r = StringUtil.reverso("abcd");
		Assert.assertEquals("dcba" , r);
		
		r = StringUtil.reverso(null);
		Assert.assertNull(r);
	}

}
