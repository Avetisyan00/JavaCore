package book.chapter13;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length != 2) {
            System.out.println("Usage: CopyFile somewhere");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Input/output error: " + e);
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
            }catch (IOException e2){
                System.out.println("File closing error");
            }
        }
    }
}
