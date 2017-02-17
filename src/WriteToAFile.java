import javafx.print.Collation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class WriteToAFile {
    public static void main(String[] args) {
        String in = "C:\\filedirectories/input.txt";
        String out = "C:\\filedirectories/FilesandStreams/output.txt";

        HashSet<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation, ',', '.', '!', '?');

        try (FileInputStream fileInputStream = new FileInputStream(in);
             FileOutputStream fileOutputStream = new FileOutputStream(out)) {
            int oneByte = fileInputStream.read();
            while (oneByte >= 0) {
                if (!punctuation.contains((char)oneByte)) {
                    fileOutputStream.write(oneByte);
                }

                oneByte = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
