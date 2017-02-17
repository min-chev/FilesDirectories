import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class CopyBytes {
    public static void main(String[] args) {
        String in = "C:\\filedirectories/FilesandStreams/input.txt";
        String out = "C:\\filedirectories/FilesandStreams/output.txt";

        try (FileInputStream fileInputStream = new FileInputStream(in);
             FileOutputStream fileOutputStream = new FileOutputStream(out)) {

            int oneByte = fileInputStream.read();
            while (oneByte >= 0) {
                if(oneByte==' '||oneByte=='\n'){
                    fileOutputStream.write(oneByte);
                }else {
                    String digits = String.valueOf(oneByte);

                    for (char c : digits.toCharArray()) {
                        fileOutputStream.write(c);
                    }
                }
                oneByte = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
