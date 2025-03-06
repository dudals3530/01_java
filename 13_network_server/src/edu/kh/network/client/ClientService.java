package edu.kh.network.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientService {
	 

		public void clientStart() {
			//1. 서버의 Ip주소와 서버가 정한 
			        //포트번호를 매개변수로 하여 
			        // 클라이언트용 소켓객체
			
		
			     //1) .현재 컴퓨터의 호컬 Ip 주소를 얻어오는방법
			     /*	try {
				String serverIp =InetAddress.getLocalHost().getHostAddress();
			    } catch (UnknownHostException e) {
				
				e.printStackTrace();
			}*/
		 		
			String serverIp ="127.0.0.1";   // - > 이 번호가 루프백 IP 의 번호임
			//2). loop back IP(현재 컴퓨터를 나타내는 IP)
			
			//ex) 서버 IP 주소 : 198.50.212.22
			// String serverIp ="198.50.212.22";
			// 다른 컴퓨터가 서버일때는
			// 그 컴퓨터의 IP 주소를 작성해야한다.
			
			int port = 8500;   //포트주소
			
			Socket clientSocket = null;  //소켓
			
			InputStream is = null;       // 기반 스트림
			OutputStream os = null;
			
			BufferedReader br = null;   //보조스트림
			PrintWriter pw = null;
			
			
			try {
				System.out.println("[Client]");
				
				clientSocket = new Socket(serverIp,port);
				
				//2. 서버와의 입출력스트림 오픈
				if(clientSocket != null) { //서버와 연결에 성공한경우
					
					is = clientSocket.getInputStream();
					os = clientSocket.getOutputStream();
					//클라이언트 소켓에 인풋아웃풋 스트림 포함되어잇음
					
					//3) 보조스트림을 통해성는 개선
					br = new BufferedReader(new InputStreamReader(is));
					
					pw = new PrintWriter(os); // 바이트 기반의 아웃풋 스트림만 받아도 됨.
					
					//4) 스트림을 통해 읽고쓰기
					// 서버 - > 클라이언트에게 보낸 날짜 메시지를 한줄 읽어와 콘솔창에 출력
					String serverMessage = br.readLine();
					
					System.out.println(serverMessage);
					
					// ---------------------------------
					
					//클라이언트가 서버로 메시지 전송!
					
					Scanner sc= new Scanner(System.in);
					
					System.out.print("서버로 전달할 메시지 : ");
					String str = sc.nextLine();
					
					pw.println(str); //  메시지를 클라이언트 -> 서버 쪽으로 출력함.
					
					pw.flush();// 스트림에 있는내용을 밀어내기
					
					
				}
				
				
				
				
			
			
			}catch(Exception e) {
				e.printStackTrace();
			
			}finally {// 5. 통신종료
				try {
			
					if(br !=null)	br.close();
				
					if(pw != null)	pw.close();
			
					if(clientSocket != null) clientSocket.close();
			
				
				} catch (IOException e) {
					e.printStackTrace();
				
				}
			}
					
			
			
			
			

			
			
		}
	}

