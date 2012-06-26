package belajar.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoCopyFile {
    public static void main(String[] xx) throws Exception {
        // 1. File sumber
        File sumber = new File("src/main/resources/lirik-cherrybelle-beautiful.txt");
        
        // 2. File tujuan
        File tujuan = new File("target/hasil-copy.txt");
        
        // 3. Input Stream dari file asal
        FileInputStream fis = new FileInputStream(sumber);
        
        // 4. Output Stream ke file tujuan
        FileOutputStream fos = new FileOutputStream(tujuan);
        
        // 5. Selama data sumber ada, baca dan tulis ke tujuan
        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }
        
        // 6. Selesai, jangan lupa close
        fis.close();
        fos.close();
    }
}
