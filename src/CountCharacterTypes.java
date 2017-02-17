import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountCharacterTypes
{
    public static void main(String[] args) {
        String inputPath = "C:\\filedirectories/Files-and-Streams/input.txt";
        String outPath = "C:\\filedirectories/Files-and-Streams/output.txt";

        Path path = Paths.get(inputPath);

        try (BufferedReader bufferedReader = Files.newBufferedReader(path);
             PrintWriter printWriter = new PrintWriter(outPath)){
            String line = bufferedReader.readLine();
            long vowels = 0;
            long punctuation = 0;
            long consonants = 0;
            while (line != null) {
                for (Character c : line.toCharArray()) {
                    if(c!=' '){
                        if(c =='a'|| c =='e' || c =='i'|| c =='o' || c =='u'){
                            vowels++;
                        }else if(c =='!'|| c ==','|| c =='.' || c =='?'){
                            punctuation++;
                        }else{
                            consonants++;
                        }
                    }
                }
                line = bufferedReader.readLine();
            }
            printWriter.println("Vowels: " + vowels);
            printWriter.println("Consonants: " + consonants);
            printWriter.println("Punctuation: " + punctuation);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
