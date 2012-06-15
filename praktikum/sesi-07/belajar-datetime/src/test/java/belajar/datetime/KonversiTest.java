package belajar.datetime;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class KonversiTest{
	@Test
	public void testKonversiTanggal(){
		Konversi k = new Konversi();
		System.out.println(k.dateKeString(new Date(),"EEEEEE, dd-MMM-yyyy"));
		}
	
	@Test
	public void testKonversiWaktu(){
		Konversi k = new Konversi();
		System.out.println("Waktu Saat Ini :"+k.dateKeString(new Date(),"HH: mm: ss"));
		}
	

	@Test
	public void testStringKeDate() throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date tanggal = formatter.parse("31-12-2012");
		System.out.println(tanggal);
	}

	@Test
	public void testDateKeString() throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date tanggal = new Date();
		System.out.println(formatter.format(tanggal));

		// ganti format
		System.out.println(new SimpleDateFormat("E, d M y").format(tanggal));
		System.out.println(new SimpleDateFormat("E, d MMM yyyy").format(tanggal));
		System.out.println(new SimpleDateFormat("EEEE, d MMMM yyyy").format(tanggal));

		// bahasa Indonesia
		Locale id = new Locale("id");
		System.out.println(new SimpleDateFormat("EEEE, d MMMM yyyy", id).format(tanggal));
	}
	
}
