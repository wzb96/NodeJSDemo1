import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class socket{

    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(6002);
		System.out.println("服务器启动!");
		// File file = new File("d:/screen2.png");
		// FileOutputStream outputStream;
		while(true){
			Socket socket = null;
			socket = serverSocket.accept();
			System.out.println("new connection!");
//			outputStream  = new FileOutputStream(file);
//			byte[] data = readInputStream(socket.getInputStream());
//			outputStream.write(data);
//			outputStream.close();
			
			
			
		}

	}



}