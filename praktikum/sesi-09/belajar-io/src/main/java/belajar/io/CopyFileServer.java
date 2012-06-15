package belajar.io;

import java.io.*;
import java.net.*;

public class CopyFileServer {
    public static void main(String[] xx) throws Exception {
        Integer port = 12345;
        ServerSocket server = new ServerSocket(port);
        
        System.out.println("Upload server siap di port "+port);
        
        Socket client = server.accept();
        System.out.println("Menerima koneksi dari IP "+client.getInetAddress());
        
        InputStream dataDariClient = client.getInputStream();
        
        String fileTujuan = "target/upload-halo.txt";
        FileWriter tujuan = new FileWriter(fileTujuan);
        
        int data = dataDariClient.read();
        while(data != -1){
            tujuan.write(data);
            data = dataDariClient.read();
        }
        
        client.close();
        tujuan.close();
        
        System.out.println("File sudah disimpan di "+fileTujuan);
    }
}
