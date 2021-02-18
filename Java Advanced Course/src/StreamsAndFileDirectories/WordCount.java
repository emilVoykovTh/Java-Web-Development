package StreamsAndFileDirectories;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    private static final String inputPath = "src/StreamsAndFileDirectories/resources/words.txt";
    private static final String readPath = "src/StreamsAndFileDirectories/resources/text.txt";
    private static final String outputPath = "src/StreamsAndFileDirectories/resources/Exercises Resources/results.txt";

    public static void main(String[] args) {
        try (BufferedReader wordReader = new BufferedReader(new FileReader(inputPath));
             BufferedReader textReader = new BufferedReader(new FileReader(readPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            String[] words = wordReader.readLine().split("\\s+");
            Map<String, Integer> wordOccurrences = new LinkedHashMap<>();

            for (String word : words) {
                wordOccurrences.put(word, 0);
            }
            String line = textReader.readLine();

            while (line != null) {
                String[] sentence = line.split("\\s+");
                for (String word : sentence) {
                    if (wordOccurrences.containsKey(word)) {
                        wordOccurrences.replace(word, wordOccurrences.get(word) + 1);
                    }
                }
                line = textReader.readLine();
            }

            for (String key : wordOccurrences.keySet()) {
                writer.println(String.format("%s - %d", key, wordOccurrences.get(key)));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
