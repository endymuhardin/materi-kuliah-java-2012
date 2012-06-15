package belajar.io;

import java.io.*;

public class TulisFileDemo {
    public static void main(String[] xx) throws Exception {
        FileWriter f = new FileWriter("target/hasil.txt");
        f.write("baris 1\r\n");
        f.write("baris 2\r\n");
        f.write("baris 3\r\n");
        f.write("baris 4\r\n");
        f.close();
    }
}
