package Files;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileTest {

    public static void main(String[] args) {

        long start = System.nanoTime();

        try {
            Path filePath = Path.of("D://test.txt");
            List<String> lines;

            try (var reader = Files.newBufferedReader(filePath)) {
                lines = Files.readAllLines(filePath);
            }

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();
        System.out.println("Time to read file: " + (end - start) + " nanoseconds");
    }
}
