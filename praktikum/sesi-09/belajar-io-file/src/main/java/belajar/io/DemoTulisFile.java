package belajar.io;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DemoTulisFile{
    public static void main(String[] xx) throws Exception {
        // 1. File tujuan
        File f = new File("target/output.txt");
        
        // 2. File Writer
        FileWriter fw = new FileWriter(f);
        
        // 3. Bungkus dengan PrintWriter
        PrintWriter pw = new PrintWriter(fw);
        
        // 4. Tulis data
        pw.println("Baris pertama");
        pw.println("Baris kedua");
        pw.println("Baris ketiga");
        
        // 5. Jangan lupa close
        pw.close();
        fw.close();
    }
}
