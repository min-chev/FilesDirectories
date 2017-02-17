import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "C:\\filedirectories/FilesandStreams/input.txt";
        String outPath = "C:\\filedirectories/FilesandStreams/output.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             PrintWriter printWriter = new PrintWriter(outPath)) {
            String line = bufferedReader.readLine();
            int counter = 1;
            while (line != null) {
                if (counter % 3 == 0) {
                    printWriter.println(line);
                }
                counter++;
                line = bufferedReader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
