package belajar.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMain{

	public boolean valid(String regex,String input){
		Pattern p= Pattern.compile(regex);
		Matcher m= p.matcher(input);
		return m.matches(); 
	}
	
}