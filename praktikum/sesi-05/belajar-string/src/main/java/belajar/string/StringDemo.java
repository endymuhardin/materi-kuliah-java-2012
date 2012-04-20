package belajar.string;

public class StringDemo{
	public int jumlahHuruf(String input){
		return input.length();
	}
	
	public String potong(String input, int mulai){
		return input.substring(mulai);
	}
	
	public String potong(String input, int mulai, int sampai){
		return input.substring(mulai,sampai);
	}
	
	public boolean ketemu(String sumber, String yangMauDicari){
		return sumber.indexOf(yangMauDicari) != -1;
	}
	
	public String ganti(String sumber, String yangMauDiganti, 
						String yangMenggantikan){
		return sumber.replaceAll(yangMauDiganti, yangMenggantikan);
	}
}