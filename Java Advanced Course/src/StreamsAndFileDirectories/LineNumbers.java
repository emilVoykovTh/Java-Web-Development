package StreamsAndFileDirectories;

import java.io.*;

public class LineNumbers {
    private static final String inputPath = "src/StreamsAndFileDirectories/resources/inputLineNumbers.txt";
    private static final String outputPath = "src/StreamsAndFileDirectories/resources/output.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); PrintWriter writer = new PrintWriter(outputPath)){
            String line = reader.readLine();
            int counter = 1;
            while (line != null){
                writer.println(counter + ". " + line);
                counter++;
                line = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
