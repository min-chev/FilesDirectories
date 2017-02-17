import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders {
    public static void main(String[] args) {
        final String stringPath = "C:\\filedirectories/Files-and-Streams";

        File file = new File(stringPath);

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(file);

        int counter = 1;
        while (!queue.isEmpty()){
            File currentdir = queue.poll();
            File[] nestedFiles = currentdir.listFiles();
            for (File nestedFile : nestedFiles) {
                if(nestedFile.isDirectory()){
                    queue.offer(nestedFile);
                    counter++;
                }
            }
            System.out.println(currentdir.getName());
        }
        System.out.println(counter + " folders");

    }
}
