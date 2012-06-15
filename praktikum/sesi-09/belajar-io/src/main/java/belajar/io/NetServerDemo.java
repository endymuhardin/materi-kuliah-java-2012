package belajar.io;

import java.io.*;
import java.net.*;

public class NetServerDemo {
    public static void main(String[] xx) throws Exception {
        Integer port = 12345;
        ServerSocket server = new ServerSocket(port);
        
        System.out.println("Server siap di port "+port);
        
        Socket client = server.accept();
        System.out.println("Menerima koneksi dari IP "+client.getInetAddress());
        
        InputStream dataDariClient = client.getInputStream();
        BufferedReader bacaData 
            = new BufferedReader(new InputStreamReader(dataDariClient));
            
        String data = bacaData.readLine();
        while(data != null){
            System.out.println(data);
            data = bacaData.readLine();
        }
        bacaData.close();
        dataDariClient.close();
        client.close();
    }
}
