package messenger04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		try(ServerSocket server = new ServerSocket(port)) {
			System.out.println("클라이언트의 요청을 기다리고 있음...");
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함!!!");

			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream()))	{
			
				pw.println("환영합니다💌");		
				pw.flush();		// 현재 버퍼있는 스트림을 강제로 보내고 버퍼를 비움
				
				String msg = null;
				while((msg = br.readLine()) != null) {
					if(msg.equals("exit")) {
						System.out.println("채팅을 종료합니다");
						break;
					}
					System.out.println("클라이언트 : " + msg);
					
					System.out.println("서버 : ");
					String sendMsg = sc.nextLine();
					pw.println(sendMsg);
					pw.flush();
					
					if(sendMsg.equals("exit"))
						break;
				}
				System.out.println(socket.getInetAddress().getHostAddress() + "와 연결을 해제함");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
