package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ex01 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test1.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeUTF('안녕하세요');

        }
    }
}
