package belajar.io;

import java.io.*;
import java.net.*;

public class CopyFileClient {
    public static void main(String[] xx) throws Exception {
        FileReader asal = new FileReader("src/main/resources/halo.txt");
        
        String server = "localhost";
        Integer port = 12345;
        
        Socket koneksiKeServer = new Socket(server, port);
        OutputStream dataKeServer = koneksiKeServer.getOutputStream();
        
        int data = asal.read();
        while(data != -1){
            dataKeServer.write(data);
            data = asal.read();
        }
        
        asal.close();
        koneksiKeServer.close();
        
        System.out.println("File sudah dikirim, cek folder tujuan di server");
    }
}
