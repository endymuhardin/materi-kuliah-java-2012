package belajar.regex;

import org.junit.*;
import static org.junit.Assert.*;

public class RegexTest{
	@Test
	public void testValidasiEmail(){
		RegexMain rm = new RegexMain();
		assertTrue(rm.valid("\\w+@\\w+\\.[a-zA-Z]{2,}","febrycool@bandwidth.com"));
	}
	
	@Test
	public void testValidasiEmail2(){
		RegexMain rm = new RegexMain();
		assertTrue(rm.valid("\\w+@\\w+\\.[a-zA-Z\\.]{2,}","febrycool@bandwidth.co.id"));
	}
	@Test
	public void testValidasiEmail3(){
		RegexMain rm = new RegexMain();
		assertTrue(rm.valid(".+@\\w+\\.[a-zA-Z\\.]{2,}","febry.cool@bandwidth.co.id"));
	}
	
	@Test
	public void testValidasiEmail4(){
		RegexMain rm = new RegexMain();
		assertFalse(rm.valid(".+@\\w+\\.[a-zA-Z\\.]{2,}",
		"ijay@.com"));
	}
	@Test
	public void testValidasiEmail5(){
		RegexMain rm = new RegexMain();
		assertFalse(rm.valid(".+@\\w+\\.[a-zA-Z\\.]{2,}",
		"@google.co.id"));
	}
	@Test
	public void testValidasiEmail6(){
		RegexMain rm = new RegexMain();
		assertFalse(rm.valid(".+@\\w+\\.[a-zA-Z\\.]{2,}",
		"budi.com@gmail"));
	}
	@Test
	public void testValidasiTgl1(){
		RegexMain rm = new RegexMain();
		assertTrue(rm.valid("[0-3][0-9]\\s[a-zA-z]{3}\\s[0-2][0-9]{3}",
		"19 fbr 1992"));
	}
	
	@Test
	public void testValidasiTgl2(){
		RegexMain rm = new RegexMain();
		assertTrue(rm.valid("[0-3]?[0-9]\\s[a-zA-z]{3}\\s[0-2][0-9]{3}",
		"9 fbr 1992"));
	}
	@Test
	public void testValidasiTgl3(){
		RegexMain rm = new RegexMain();
		assertFalse(rm.valid("[0-3]?[0-9]\\s[a-zA-z]{3}\\s[0-2][0-9]{3}",
		"fbr 19 1992"));
	}
	
	
	
}