package belajar.datetime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Konversi{
	private Locale id=new Locale("id");
	public String dateKeString(Date input, String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format,id); // butuh pattern untuk format tanggalnya
		return sdf.format(input);
	}
}