package belajar.io;

import java.io.*;
import java.net.*;

public class NetClientDemo {
    public static void main(String[] xx) throws Exception {
        String server = "localhost";
        Integer port = 12345;
        
        Socket koneksiKeServer = new Socket(server, port);
        OutputStream dataKeServer = koneksiKeServer.getOutputStream();
        PrintWriter tulisData = new PrintWriter(dataKeServer);
        
        tulisData.println("Baris 1");
        tulisData.println("Baris 2");
        tulisData.close();
        dataKeServer.close();
        koneksiKeServer.close();
    }
}
