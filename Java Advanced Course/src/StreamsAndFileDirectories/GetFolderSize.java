package StreamsAndFileDirectories;

import java.io.*;

public class GetFolderSize {
    private static final String directoryPath = "src/StreamsAndFileDirectories/resources/Exercises Resources";
    private static final String outputPath = "src/StreamsAndFileDirectories/resources/output.txt";

    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(outputPath)) {
            File folder = new File(directoryPath);

            int bytes = 0;
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    bytes += file.length();
                }
            }
            writer.println("Folder size: " + bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
