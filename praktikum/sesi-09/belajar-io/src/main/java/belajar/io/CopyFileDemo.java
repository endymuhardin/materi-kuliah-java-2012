package belajar.io;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] xx) throws Exception {
        FileReader asal = new FileReader("src/main/resources/halo.txt");
        FileWriter tujuan = new FileWriter("target/halo.txt");
        
        int data = asal.read();
        while(data != -1){
            tujuan.write(data);
            data = asal.read();
        }
        
        asal.close();
        tujuan.close();
    }
}
