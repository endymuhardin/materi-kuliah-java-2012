package belajar.string;

import org.junit.*;
import static org.junit.Assert.*;

public class StringDemoTest{
	@Test
	public void testPanjangString(){
		StringDemo sd = new StringDemo();
		String nama = "endy";
		assertTrue(sd.jumlahHuruf(nama) == 4);
	}
	
	@Test
	public void testPotongString(){
		StringDemo sd = new StringDemo();
		String nama = "endy muhardin";
		assertEquals("y muhar", sd.potong(nama, 3, 10));
		assertEquals("din", sd.potong(nama, 10));
	}
	
	@Test
	public void testCariString(){
		StringDemo sd = new StringDemo();
		String nama = "endy muhardin";
		assertTrue(sd.ketemu(nama, "endy"));
		assertFalse(sd.ketemu(nama, "dadang"));
	}
	
	@Test
	public void testGantiString(){
		StringDemo sd = new StringDemo();
		String nama = "dadang";
		assertEquals("dudung", sd.ganti(nama, "a", "u"));
	}
}