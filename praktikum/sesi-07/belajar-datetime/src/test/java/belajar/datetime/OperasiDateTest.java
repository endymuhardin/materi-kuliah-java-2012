package belajar.datetime;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.junit.*;
import static org.junit.Assert.*;

public class OperasiDateTest{
	@Test
	public void testTambahTanggal(){
		Konversi k = new Konversi();
		OperasiDate od=new OperasiDate();
		Date hariIni=new Date();
		Date besok=od.tambah(hariIni,1);
		System.out.println("besok="+k.dateKeString(besok,"EEEEEE, dd-MMM-yyyy"));
		}
	
	
	@Test
	public void hitungSelisihHari() throws Exception {
		Date hariIni = new Date();
		Date dulu = new SimpleDateFormat("dd-MM-yyyy").parse("10-02-2012");

		// konversi dulu menjadi DateTime
		DateTime dtHariIni = new DateTime(hariIni);
		DateTime dtDulu = new DateTime(dulu);

		// hitung selisih hari
		Integer selisih = Days.daysBetween(dtHariIni, dtDulu).getDays();
		System.out.println("Selisih hari : "+selisih);
	}
	
}
