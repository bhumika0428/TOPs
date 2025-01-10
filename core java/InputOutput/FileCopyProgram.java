package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
    public static void main(String[] args) {
         String sourceFilePath = "C:\\Users\\lenovo1\\Desktop\\tops\\textfile\\demo.txt";  
        String destinationFilePath = "C:\\Users\\lenovo1\\Desktop\\tops\\textfile\\destination.txt";  
        
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {
             
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied successfully!");
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred during file copy.");
        }
    }
}
