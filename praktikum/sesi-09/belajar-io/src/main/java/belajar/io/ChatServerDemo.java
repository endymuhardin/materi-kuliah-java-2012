package belajar.io;

import java.io.*;
import java.net.*;

public class ChatServerDemo {
    public static void main(String[] xx) throws Exception {
        Integer port = 12345;
        ServerSocket server = new ServerSocket(port);
        
        System.out.println("Server siap di port "+port);
        
        Socket client = server.accept();
        System.out.println("Menerima koneksi dari IP "+client.getInetAddress());
        
        InputStream dataDariClient = client.getInputStream();
        BufferedReader bacaData 
            = new BufferedReader(new InputStreamReader(dataDariClient));
            
        PrintWriter tulisData = new PrintWriter(client.getOutputStream());
            
        String data = bacaData.readLine();
        while(data != null){
            System.out.println("["+client.getInetAddress()+"] : "+data);
            tulisData.println("[SERVER] : Anda mengirim "+data);
            tulisData.flush();
            data = bacaData.readLine();
            
        }
        tulisData.close();
        bacaData.close();
        dataDariClient.close();
        client.close();
    }
}
