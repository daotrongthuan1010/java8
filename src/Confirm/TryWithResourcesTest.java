package Confirm;

import java.io.*;
import java.util.Objects;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        withJava();

    }

    public static void checkResource() throws IllegalAccessException {

        if(Objects.isNull(null)){
            return;
        }
        else {
            throw new IllegalAccessException("Error");
        }

    }


    // Try with resource không cần close thủ công, mà autocloseable trong java 7.
    public static void withJava()  {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D://test.txt"));){
            String sCurrentLine;
            while ((sCurrentLine = bufferedReader.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }
        catch (IOException exception){
            exception.getMessage();
        }


    }
}
