package belajar.io;

import java.io.*;

public class BacaFileDemo {
    public static void main(String[] xx) throws Exception {
        FileReader f = new FileReader("src/main/resources/halo.txt");
        BufferedReader b = new BufferedReader(f);
        String data = b.readLine();
        while(data != null){
            System.out.println(data);
            data = b.readLine();
        }
        
        b.close();
        f.close();
    }
}
