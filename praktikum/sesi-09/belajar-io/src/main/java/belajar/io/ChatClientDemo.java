package belajar.io;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClientDemo {
    public static void main(String[] xx) throws Exception {
        String server = "localhost";
        Integer port = 12345;
        
        Socket koneksiKeServer = new Socket(server, port);
        OutputStream dataKeServer = koneksiKeServer.getOutputStream();
        PrintWriter tulisData = new PrintWriter(dataKeServer);
        
        BufferedReader bacaData 
            = new BufferedReader(new InputStreamReader(koneksiKeServer.getInputStream()));
        
        // ambil data dari command line
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Silahkan ketik pesan. Ketik stop untuk berhenti");
        
        String data = input.readLine();
        
        while(!"stop".equalsIgnoreCase(data)){
            tulisData.println(data);
            tulisData.flush();
            System.out.println(bacaData.readLine());
            data = input.readLine();
        }
        
        bacaData.close();
        tulisData.close();
        dataKeServer.close();
        koneksiKeServer.close();
    }
}
