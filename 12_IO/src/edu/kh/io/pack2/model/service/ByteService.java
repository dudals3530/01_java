package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.Properties;

public class ByteService {

	/*
	 * 스트림 (Stream) : 데이터가 이동하는 통로
	 * 					 기본적으로 한방향으로 흐름
	 * 
	 * Byte 기반 스트림
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * - 최상위 클래스 : InputStream, OutputStream
	 * - 문자열, 이미지 , 영상 ,오디오,pdf 등
	 *   모든 것을 입 / 출력 할수있음
	 *  ( 단, 통로가 좁다보니 속도가 좀 느림,
	 *    char형 문자 같은 경우 깨질 우려가 있음)  프러퍼ㅣㅌ?! 
	 *    
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	// IO 관련된 코드 IOException 이 발생될 가능성이 높다!!
	// - > IO 관련 코드는 거의 모든 메서드가 throws IOExcepton
	// - > IOException 예외 처리 구문을 작성하는것이 필수 ! 
	
	
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력
	 * + 데이터 출력 그안에 데이터 까지 쓸꺼따!! 하면 스트림 필요! 
	 * 
	 */
	public void fileByteOutput() {
		
		//FileOutputStream 참조 변수 선언(OutPutStream 의 상속받은 자식클래스)
		
		FileOutputStream fos = null;
		
		
		try {
			
			
			// new FileOubputStream("경로")
			// - > 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// - > 출력 스트림에 연결된 파일이 존재 하지 않으면 자동 생성
			// 단, 폴더는 생성되지 않음
			//-> 기존 파일이 존재하면 내용을 덮어쓰기 함
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");
		
			// String 의 불변의 문제를 해결한 객체 StringBuiler(비동기) // StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!\n");
			sb.append("1234567890\n");
			sb.append("~!@#$%^&*()_?+\n");
			sb.append("자바개꿀맛");
			sb.append("선생님 저 공부 열심히 할꼐유~ ");
			sb.append("진짜루 화이또");
		
			//출력방법 1: 한 글자(2byte) 씩 파일로 출력
			
			//StringBuilder - > String 변환 - > charAt - > char로 변환 ? ? ?
			String content = sb.toString();
			
			
			/*for(int i = 0; i < content.length(); i++) {
				
				char ch = content.charAt(i);
				fos.write(ch); // 1byte 출력 스트림이 연결된 파일에 ch 쓰기
			}
			*/
			
			// -> 2byte 범주의 문자 (영어,숫자, 기본특수문자 제외)는
			// 바이트 기반 스트림 통과시
			//데이터 손실이 발생하여 글자가 깨지는 문제가발생
			
			
			//출력 방법 2 : String을 byte[] 변환후 출력
			
			
			//********* 수행시간 확인 **********
			// write() 수행 되는 시간 측정
			// System.nanoTime() : 1970.01.01 오전 9:00:00 부터
			// 현재 시간까지의 차이를 ns(nano second)로 반환
			// 1ms(밀리)      ==        1/1000초
			// 1us(마이크로)  ==        1/1000ms
			// 1ns(나노)     ==         1/1000us
 			
			
			//이전
			long startTime = System.nanoTime();
			
			fos.write(content.getBytes()); //byte[]로 만들어 반환
			
			
			//이후
			long endTime = System.nanoTime();
			
			System.out.println("[수행시간] : " + (endTime - startTime) + "ns");      //[수행시간] : 79100ns 평균적으로 ?
			
			
			fos.flush(); // 스트림 안에 남아있는 모든 데이터를 모두 밀어냄
			//FileOutputStream 에서는 flusy() 선택 사항
			
			
			
			System.out.println("출력완료!");
		
		}catch (Exception e) {
			//filenotfound 는 Exception 의 자식 임 
			
			e.printStackTrace();
			
		}finally {// try 예외 발생 여부 관 계 없이 무조건 수행 하는 코드
		
		                 	 // finally 에 접근하기위해서
                               // FileOutputStream fos = null; 
                                // close 를 해야 메모리 누수를 방지 함
				try {
					// 스트림이 정상 생성된 경우
					//스트림을 닫는다 (NullPointerEcepion 방지)
					//close() 메서드도 IOException을 발생시키기 때문에
					//try - catch 이용하여 예외처리 필수
					
					
					if (fos != null)fos.close();
					//이것도 NullPointException 방지하기위해서 fos != null
				} catch (IOException e) {
				
					e.printStackTrace();
				}             
		
		
			// 사용 완료한 스트림을 제거 (닫기, 메모리 반환)하는 코드 작성
			// -> 메모리 누수방지
			
			//fos.close();
		
		
		}
		
		
		
		
	}

	
	/**
	 * 버퍼를 이용한 파일 출력
	 * + BufferedoutputStream 보조 스트림 이용
	 * 
	 * 
	 */
	public void bufferedFileByteoutput() {
		
		/*
		 * 버퍼(Buffer) 란 ?
		 * - 데이터를 모아두는 공간 , 마치 바구니 같은 메모리 공간
		 * 
		 * BufferedoutputStream / BufferedInputStream
		 * 출력용 보조스트림(바이트)        입력용 보조 스트림(바이트)
		 *
		 * -FileOutputStream 은 1바이트씩 데이터를 입출력
		 * -> 통로가 좁아서 데이터 입출력시 속도가 느림
		 * 
		 * 
		 * -> 보조스트림 이용시 버퍼에 입출력할 내용을 모아서 한번에 입출력!
		 * (내부 버퍼에 데이터를 모아뒀다가 일정 크기가 되면 한번에 출력)
		 * 
		 * --> 기반 스트림을 이용하는 횟수가 적어짐
		 * --> 성능 , 시간 효율 상승
		 * 
		 * */
		
		FileOutputStream fos = null; // 기반 스트림 참조변수 선언
		BufferedOutputStream bos = null; // 출력용 보조스트림 참조변수 선언
		
		try {
			
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_Buffered.txt");
			
			//기반 스트림 fos를 이용해 보조스트림 bos를 생성
			bos = new BufferedOutputStream(fos);
		
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!\n");
			sb.append("1234567890\n");
			sb.append("~!@#$%^&*()_?+\n");
			sb.append("자바개꿀맛");
			sb.append("선생님 저 공부 열심히 할꼐유~ ");
			sb.append("진짜루 화이또");
			
			String content = sb.toString();
			
			
			
	        long startTime = System.nanoTime();  
			
         	bos.write(content.getBytes()); // 버퍼에 저장하는 행위 만 했음 (파일에 즉시기록 X)
	
			
			
			//이후
			long endTime = System.nanoTime();
			
			System.out.println("[수행시간] : " + (endTime - startTime) + "ns");    //28300ns 평균  
			                                                                       // 보조스트림을 사용했을때 2배정도차이남
			
			
			bos.flush();
			// 스트림 (버퍼  ) 안에 있는 모든 데이터를 밀어냄
			// 버퍼 내용을 강제로 파일에 기록
			// BufferdOutputStream 은 flush 사용이 필수!
			
			
			System.out.println("출력완료");
			
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(bos != null) bos.close();
				// 보조스트림 (bos) close()시
				// 보조스트림 생성에 사용된 기반 스트림(fos)도 같이 
				// close()됨
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		
		
	}

	
	
	
	/**
	 * 바이트 기반 파일 입력
	 * 
	 * 
	 */
	public void fileByteInpt() {
		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			fis= new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			//FileInputStream 이용시 해당 경로에 반드시실제 파일이 존재해야한다!
			// -> 존재 하지 않으면 FileNotFoundException 발생
			
			// 방법1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			// - > 2byte 범주의 글자들은 깨지는 문제 발생함
			
			// byte - > 자바에서 정수형 
			// 다루기 힘들기 때문에 정수형 기본형인 int로 변환해서 사용
			
			int value = 0; // 읽어온 바이트값을 저장할 변수

			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				value = fis.read();  // 1byte씩 읽어오는 메서드 .read()
				// 단 , 더이상 읽어올값이 없으면  -1 반환 
				
				if (value == -1) break; // 다 읽어왔으면 반복 멈춤 
				
				sb.append((char)value); // char로 강제 형변환해서 글자형태로 sb 추가
				
			}
			
			System.out.println(sb.toString()); // 읽어온 내용 콘솔에 출력
			
			// InputeStream 은 flush() 없음
			// flush() 는 출력 스트림에만 관련된 동작 
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			
			try {
			
				if(fis != null)	fis.close();
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

	
	/**
	 * 바이트 기반 파일 입력 2 
	 * 
	 */
	public void fileByteInput2() {
		

		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			fis= new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			// 방법 2 . 파일에 정장된 모든 byte 값 을 다읽어와
			//      byte[] 형태로 반환 받기
			// -> byte[] 배열을 이용해서 String 객체 생성

			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
		
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			
			// 사용완료된 Stream 메모리반환
			try {
			
				if(fis != null)	fis.close();
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	
		
		
		
	}

	/**
	 * BufferInputStream 보조스트림을 이용한 성능 향상
	 * 
	 * InputStream의 경우 외부 파일의 데이터를 읽어올때 사용
	 * -> 읽어오는 파일의 크기가 작으면 보조 스트림의 
	 *            성능 이점이 크게 눈에 띄지는 않음
	 * 
	 * 
	 */
	public void bufferFileByteInput() {
		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		//파일 입령용 바이트 보조 스트림선언
		BufferedInputStream bis = null;
		
		try {
			// 기반스트림생성
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			// 보조 스트림생성
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
		}catch(Exception e){
			e.printStackTrace();
		
		}finally {
			try {
				//보조스트림 만 close() 해도 기반 스트림도 같이 close 됨
			      if(bis !=null)	bis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	

	/**
	 * 
	 * 외부에 있는 config.properties 파일 입출력하기   *config는 설정 이란 의미
	 * -> Map 계열인 Properties 클래스 사용하기                           
	 * 
	 */
	public void readproperties() {
		
		//Properties 클래스는  Hashtable의 하위 클래스로 Map 계열 클래스 중 하나 .
		//Key 와 Value 모두 String 타입으로 이루어져있다.
		
		//Properties 객체생성
		Properties properties = new Properties();
		
		//바이트 기반 파일 입력 스트림 참조 변수 선언
		FileInputStream fis =null;
		
		//바이트 기반 파일 출력 스트림 참조 변수 선언
		FileOutputStream fos = null;
		
		
		try {
			
		
			// 읽기
		
			fis = new FileInputStream("/io_test/20250305/config.properties");
		
			properties.load(fis);   //파일로드
			
			// Properties.getProperty(key) ": key에 대응되는 value 반환
			
		    System.out.println("username : "+ properties.getProperty("username"));
		    System.out.println("password : "+ properties.getProperty("password"));
		    System.out.println("language : "+ properties.getProperty("language"));
		   // System.out.println("language : "+ properties.getProperty("12345")); //null 반환
		  
		   
		    
		    //쓰기
		   
		    fos = new FileOutputStream("/io_test/20250305/config.properties");
		    
		    properties.setProperty("theme", "dark"); // 새로운 속성 (설정) 추가
		    // theme = dark 
		    
		    properties.store(fos, "Update"); // 여기서 fos 는 FileOutputStream 값 
		    properties.store(fos, "onemore");                                  // update 는 코멘트임
		    
		    System.out.println("theme : "+ properties.getProperty("theme"));
		    // store가 저장한다 라는 의미
		    
		    
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
				try {
					if(fis !=null)	fis.close();
				    if(fos != null)  fos.close();                 
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		
		
	}

	
	/**파일 복사
	 * 
	 * 파일 경로를 입력받아
	 * 지정된 파일과 같은 경로에 복사된 파일 출력하기 
	 * 
	 * [실행화면]
	 * 파일경로 입력 : /io_test/20250305/노래가사.txt
	 * 복사완료 : /io_test/20250305/노래가사_copy.txt
	 * 
	 * 1) 입력된 경로에 파일이 있는지 검사
	 * 2) 있으면 파일 내용을 모두 읽어오기 : FileInputStream + BufferdInputStream
	 * 3) 읽어온 내용을 같은 경로 위치에 " 파일명_copy.확장자" 이름으로 출력
	 *        :FileOutputStream + BufferedoutputSTream
	 *        
	 * + Scanner 대신 BufferedReader 이용(문자열 입력용 스트림) 이용   
	 * -> BufferedReader는 보조스트림으로 단독사용 불가능!
	 * -> BufferedReader 생성 시 기반 보조 ? 스트림인 InputStreamReader -> InputStream가 기반    
	 * 
	 */
	public void fileCopy() {
		
		//스트림 참조변수 선언
		BufferedReader br = null; // 문자열 입력용 스트림
		
		FileInputStream fis = null;     // 파일 입력 기반 스트림
		BufferedInputStream bis = null; // 파일 입력 보조 스트림

		FileOutputStream fos = null;        //파일 출력 기반 스트림
		BufferedOutputStream bos = null;    //파일 출력 보조 스트림
		
		
		try {
			//키보드 입력을 받기위한 스트림 객체 생성
			 br = new BufferedReader(new InputStreamReader(System.in));
		                                                   // 1byte 씩 읽어오는 바이트 스트림
			                                               //스캐너 만들때도 있음 결국 둘다 InputStream 을 통해서얻어옴
			           								       // InputStreamReader 를 통해서 byte 단위를 문자 Stream 으로 변환
			                                               // 그걸 갓다가 버퍼드 리더에 대입시켜서 성능향상을 기대함.
		
		// 경로 입력받기
			 System.out.println("파일 경로 입력 : ");
			String target =br.readLine(); // 입력된 한줄 읽어오기
			// 우리는 여기다가  /io_test/20250305/노래가사.txt 이렇게 입력할꺼임
			
			// 1) 입력된 경로에 파일이 있는지 검사
			// 해당 경로에 파일이 존재하는지확인
			File file = new File(target);
			
			if(!file.exists() ) { // 해당경로에 파일이 존재하지 않으면 
				// 프린트 구문출력
				System.out.println("[해당경로에 파일이 존재하지 않습니다.]");
				return;
			}
			
			
			//2) 있으면 파일 내용을 모두 읽어오기 : FileInputStream + BufferdInputStream
			// 해당 경로에 파일이 존재하면 
			// target이 가리키는 파일을 입력받을수 있또록
			// 입력용 스트림생성
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			// 입력용 스트림을 이용해서 target 파일의 내용 입력받기
			byte[] bytes = bis.readAllBytes();
	
			// ------------------------------------------------------
			
			// 출력할 파일의 경로 + _ copy 가 붙은 파일이름
			// target : /io_test/20250305/노래가사.Txt
			// copy :  /io_test/20250305/노래가사_copy.Txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target); //" io_test/20250305/ shforktk. txt"
			
			//int  String.lastIndexof("문자열")
			// - 주어진 문자열이 마지막으로 등장하는 인덱스를 찾아
			//int 값으로 반환. 찾지못하면 -1반환
			
			int insertPoint = target.lastIndexOf(".");
			
			//System.out.println(insertPoint); //22
			
			sb.insert(insertPoint, "_copy");  //22번 인덱스자리에 _copy 추가
			
			
			String copy = sb.toString(); // 복사할 파일의 경로를 String 변환
			//io_test/20250305/노래가사_copy.Txt
			
			//출력용 스트림 생성
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);
			
			//원본에서 읽어온 내용 bytes 를 bos를 이용해서 쓰기(출력)
			bos.write(bytes);
			bos.flush(); // 스트림에 남아있는 데이터 모두 밀어내기!
			
			System.out.println("복사완료" + copy);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		finally {
			
			try {
			if(br !=null)	br.close();
			if(bos !=null)	bos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
			
				if(bis != null)	bis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}


	
