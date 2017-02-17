import java.io.*;
import java.util.HashMap;

public class MergeTwoFiles {
    public static void main(String[] args) {

        String firstFilePath = "C:\\filedirectories/words.txt";
        String secondFilePath = "C:\\filedirectories/text.txt";
        String thirdFile = "C:\\filedirectories/output.txt";


            try (BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFilePath));
                 BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFilePath));
                 PrintWriter writer = new PrintWriter(thirdFile)) {

                int code = firstFileReader.read();

                while (code != -1) {
                    writer.print((char)code);
                    code = firstFileReader.read();
                }

                code = secondFileReader.read();

                while (code != -1) {
                    writer.print((char)code);
                    code = secondFileReader.read();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}




