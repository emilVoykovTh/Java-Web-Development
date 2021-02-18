package StreamsAndFileDirectories;

import java.io.*;
import java.util.Locale;

public class AllCapitals {
    private static final String inputPath = "src/StreamsAndFileDirectories/resources/input.txt";
    private static final String outputPath = "src/StreamsAndFileDirectories/resources/output.txt";
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); PrintWriter writer = new PrintWriter(outputPath)){
            String line = reader.readLine();

            while (line != null){
                writer.println(line.toUpperCase());
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
