package InputOutput;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\lenovo1\\Desktop\\tops\\textfile\\demo.txt";
        String destinationFile = "C:\\Users\\lenovo1\\Desktop\\tops\\textfile\\destination.txt";
        
        copyFileContent(sourceFile, destinationFile);
    }

    public static void copyFileContent(String sourceFile, String destinationFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }
            
            System.out.println("Content successfully copied from " + sourceFile + " to " + destinationFile);
        
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + sourceFile + " was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the content: " + e.getMessage());
        }
    }
}
