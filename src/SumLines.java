import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumLines {
    public static void main(String[] args) {
        String inputPath = "C:\\filedirectories/Files-and-Streams/input.txt";

        Path path = Paths.get(inputPath);

        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(inputPath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum+=c;
                }

                System.out.println(sum);
                line = bufferedReader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
