package belajar.datetime;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

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
	
	
}