import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; 
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}