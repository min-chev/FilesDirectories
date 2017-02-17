import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) {
        String inputPath = "C:\\filedirectories/Files-and-Streams/input.txt";

        Path path = Paths.get(inputPath);

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line = bufferedReader.readLine();
            long sum = 0;
            while (line != null) {
                for (char c : line.toCharArray()) {
                    sum+=c;
                }

                line = bufferedReader.readLine();
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
