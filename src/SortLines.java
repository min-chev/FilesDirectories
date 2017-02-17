import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class SortLines {
    public static void main(String[] args) {
        final String inputPath = "C:\\filedirectories/FilesandStreams/input.txt";
        final String outPath = "C:\\filedirectories/FilesandStreams/output.txt";

        Path path = Paths.get(inputPath);
        Path pathOut = Paths.get(outPath);


        try {
          List<String> list =  Files.readAllLines(path);
            Collections.sort(list);
            Files.write(pathOut, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
