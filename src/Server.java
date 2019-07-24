import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	public void main() {
		Socket socket = null;
		ServerSocket serverSocket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		try {
			serverSocket = new ServerSocket(11123);
			System.out.println("Server Start");
			while(true) {
				socket = serverSocket.accept();
				executorService.execute(new ProcessThread(socket));
				
			}
			/*in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			String str = null;
			str = in.readLine();
			System.out.println("클라이언트로 온 메시지 : "+str);
			out.write(str);
			out.flush();
			socket.close();*/
			
		}catch(Exception e) {
			
		}
	}
}
