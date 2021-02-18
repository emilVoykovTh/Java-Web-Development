package StreamsAndFileDirectories;

import java.io.*;

public class MergeTwoFiles {
    private static final String input1 = "src/StreamsAndFileDirectories/resources/inputOne.txt";
    private static final String input2 = "src/StreamsAndFileDirectories/resources/inputTwo.txt";
    private static final String outputPath = "src/StreamsAndFileDirectories/resources/output.txt";

    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(input1));
             BufferedReader reader2 = new BufferedReader(new FileReader(input2));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))){

            String line = reader1.readLine();
            while (line != null){
                writer.println(line);
                line = reader1.readLine();
            }
            line = reader2.readLine();
            while (line != null){
                writer.println(line);
                line = reader2.readLine();
            }




        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
