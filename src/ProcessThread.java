import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ProcessThread implements Runnable {
	private Socket socket = null;

	public ProcessThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			
			String str = in.readLine();
			System.out.println("Client로 부터 온 메시지 : "+str);
			out.write(str);
			out.flush();
			
			out.close();
			in.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
