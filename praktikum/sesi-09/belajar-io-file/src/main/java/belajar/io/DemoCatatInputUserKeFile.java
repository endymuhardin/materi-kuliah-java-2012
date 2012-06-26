package belajar.io;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;

public class DemoCatatInputUserKeFile{
    public static void main(String[] xx) throws Exception {
        // 1. Sumbernya adalah yang diketik user di terminal
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        // 2. Output ke file
        File f = new File("target/hasil-ketik.txt");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);

        // 3. Baca data, sampai ada tulisan stop
        String data;
        while(!"stop".equals(data = br.readLine())){
            pw.println(data);
        }
        
        // 4. Jangan lupa close
        br.close();
        is.close();
        pw.close();
        fw.close();
    }
}
