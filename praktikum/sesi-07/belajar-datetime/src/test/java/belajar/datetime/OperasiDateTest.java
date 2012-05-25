package belajar.datetime;
import java.util.Date;
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
	
	
	
	
}