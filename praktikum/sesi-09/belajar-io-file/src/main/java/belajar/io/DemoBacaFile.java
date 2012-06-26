package belajar.io;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class DemoBacaFile {
    public static void main(String[] xx) throws Exception {
        // 1. File yang akan dibaca
        File f = new File("src/main/resources/lirik-cherrybelle-beautiful.txt");
        
        // 2. Buat object FileReader
        FileReader fr = new FileReader(f);
        
        // 3. Bungkus dengan BufferedReader
        BufferedReader br = new BufferedReader(fr);
        
        // 4. Selama datanya ada (readLine tidak null), 
        // baca dan tampilkan
        String data;
        while((data = br.readLine()) != null){
            System.out.println(data);
        }
        
        // 5. Data habis, tutup file sebelum exit
        br.close();
        fr.close();
    }
}
