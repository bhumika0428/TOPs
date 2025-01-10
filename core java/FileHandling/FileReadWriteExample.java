package FileHandling;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\lenovo1\\Desktop\\tops\\textfile\\demo.txt"; 
        String outputFilePath = "C:\\Users\\lenovo1\\Desktop\\tops\\textfile\\hello.txt"; 

 try (FileReader fileReader = new FileReader(inputFilePath);
             FileWriter fileWriter = new FileWriter(outputFilePath)) {

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("Content has been copied from " + inputFilePath + " to " + outputFilePath);

        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}
