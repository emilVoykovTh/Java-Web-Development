package StreamsAndFileDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class CountCharacterTypes {
    private static final String inputPath = "src/StreamsAndFileDirectories/resources/input.txt";
    private static final String outputPath = "src/StreamsAndFileDirectories/resources/output.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); PrintWriter writer = new PrintWriter(outputPath)) {
            String line = reader.readLine();
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            Set<Character> punctuationMarks = Set.of(',', '.', '!', '?');
            int vowelsCount = 0;
            int consonantCount = 0;
            int punctuationMarkCount = 0;
            while (line != null) {

                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    if (vowels.contains(symbol)) {
                        vowelsCount++;

                    } else if (punctuationMarks.contains(symbol)) {
                        punctuationMarkCount++;
                    } else if (symbol != ' ') {
                        consonantCount++;
                    }
                }
                line = reader.readLine();
            }
            writer.println("Vowels: " + vowelsCount);
            writer.println("Consonants: " + consonantCount);
            writer.println("Punctuation: " + punctuationMarkCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
