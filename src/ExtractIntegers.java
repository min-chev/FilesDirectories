import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
            String inputPath = "C:\\filedirectories/FilesandStreams/input.txt";
        String outPath = "C:\\filedirectories/FilesandStreams/output.txt";

        try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
                 PrintWriter writer = new PrintWriter(outPath)) {
                while (scanner.hasNext()) {
                    if (scanner.hasNextInt())
                        writer.println(scanner.nextInt());
                    scanner.next();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}

