import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String words = "C:\\filedirectories/words.txt";
        String text = "C:\\filedirectories/text.txt";

        HashMap<String, Integer> Map = new HashMap<>();

        try (BufferedReader scanner = new BufferedReader(new FileReader(words));
             BufferedReader scanner2 = new BufferedReader(new FileReader(text))) {

            String line = "";

            while((line = scanner.readLine())!=null){
                String[] wordsLine = line.split("\\s++");
                for (String s : wordsLine) {
                    if (!Map.containsKey(s)) {
                        Map.put(s, 0);
                    }
                }
            }

            while((line = scanner2.readLine())!=null){

                String[] wordsLine2 = line.split("\\s++");

                for (String s : wordsLine2) {
                    for (String s1 : Map.keySet()) {
                        if(s.toLowerCase().equals(s1.toLowerCase())){
                            Map.put(s1, Map.get(s1)+1);
                        }
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        Map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry ->
                System.out.println(entry.getKey() +" - " + entry.getValue())

        );
    }
}
