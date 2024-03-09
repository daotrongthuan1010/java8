package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;

public class TryWithResources {
    public static void main(String[] args) {

        long start = Instant.now().getNano();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D://test.txt"))){

            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }


        }
        catch (IOException ioException){
            ioException.getMessage();
        }
        long end = Instant.now().getNano();
        System.out.println("Time read file:" +(end-start));

    }
}
