package belajar.datetime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.joda.time.DateTime;

public class OperasiDate{
	public Date tambah(Date input, Integer izay){
		DateTime d=new DateTime(input);
		return d.plusDays(izay).toDate();
	}
}