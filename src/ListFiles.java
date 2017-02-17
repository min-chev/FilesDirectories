import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class ListFiles {
    public static void main(String[] args) {
        final String stringPath = "C:\\filedirectories/FilesandStreams";

        File file = new File(stringPath);

        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                if(!file1.isDirectory()){
                    System.out.printf("%s: %s\n", file1.getName(), file1.length());
                }
            }
        }
    }
}
