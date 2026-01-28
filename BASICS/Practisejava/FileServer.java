/*write a java program to read file  form another system on the same network */

import java.io.*;
import java.net.*;

public class FileServer 
{
    public static void main(String[] args) throws IOException 
	{
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server is running... Waiting for connection");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        // Specify the file to send
        File file = new File("C:/SharedFolder/sample.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        OutputStream os = socket.getOutputStream();

        byte[] contents;
        long fileLength = file.length();
        long current = 0;

        contents = new byte[10000];
        while((current = bis.read(contents))!=-1) 
		{
            os.write(contents, 0, (int) current);
        }

        os.flush();
        socket.close();
        serverSocket.close();
        System.out.println("File sent successfully!");
    }
}
