import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ALLCAPITALS {
    public static void main(String[] args) {
        String inputPath = "C:\\filedirectories/Files-and-Streams/input.txt";
        String outPath = "C:\\filedirectories/Files-and-Streams/output.txt";

        Path path = Paths.get(inputPath);

        try (BufferedReader bufferedReader = Files.newBufferedReader(path);
             PrintWriter printWriter = new PrintWriter(outPath)){
            String line = bufferedReader.readLine();
            while (line != null) {
                String linenew = line.toUpperCase();
                printWriter.println(linenew);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
