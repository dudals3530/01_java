package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

	/*
	 * ObjectInputStream / ObjectOutputStream
	 * 
	 * - Java 객체를 입/추력 할때 
	 *   사용하는 바이트 기반 "보조" 스트림
	 *   (보조 스트림은 단독 사용 불가능!)
	 *
	 * *** 직렬화 (Serializable)
	 * - 객체를 직렬(직선)형태로 변환
	 * 
	 * - 직렬화란 객체의 상태(필드값)를 바이트 스트림으로 변환하는 과정
	 *  이를 통해 객체는 메모리에서만 존재하는 것이 아니라, 
	 *  파일로 저장되거나 네트워크를 통해 전송될 수있음
	 *  
	 *  - 역직렬화는 바이트 스트림을 다시 객체로 복원하는 과정
	 *  즉, 저장되거나 전송된 데이터를 원래의 객체 형태로 되돌리는 작업.
	 * 
	 * */
	
	
	/**
	 * 객체를 외부 파일로 출력
	 * 자바프로그램 내부 - > 외부출력
	 *               직렬화 필요!
	 *               
	 *               
 	 */
	public void objectOutput() {
		
		// 스트림 참조 변수 선언
		FileOutputStream fos = null;        //기반 스트림
		ObjectOutputStream oos = null;       //보조 스트림

		try {
			//.dat 확장자 : data를 담고있는 파일을 나타내는 확장자
			fos = new FileOutputStream("/io_test/20250305/Member.dat");
			
			oos = new ObjectOutputStream(fos); // 객체 보조 스트림 생성 (보조스트림에 기반스트림의 객체생성된걸 전달)
			
			//Member 객체 하나 생성
			
			Member member = new Member("member01","pass01","김회원",30);
			
			//ObjectOutputStream 이용해서 Member 객체를 출력하기
			oos.writeObject(member);  // write 가 쓰다 .. ㅇㅋ member 객체를 연결된 경로의 파일에 쓰겠다 ! (출력)
			
			//java.io.NotSerializableException: edu.kh.io.pack3.model.dto.Member
			// 직렬화를 안시키고 Object를 출력하려고하니깐 예외발생하누
			//- > Member 클래스를 직렬화하기 위해 Implements Serializable 해줘야함!
			
			
			
			System.out.println("회원 데이터 출력 완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			try {
		        
				if(oos != null)	oos.close(); // 보조스트림만 닫아도 기반스트림 같이 닫힘
                //조건문을 달아주는게 이쁨 ..			
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		
		}
		
		
		
		
		
	}
		
	
	/**
	 * 외부파일로 객체 입력받기
	 * 
	 * 외부 - > 내부
	 * 역직렬화 필요!
	 */
	public void objectInput() {
		
		// 스트림 참조 변수 선언
		FileInputStream fis = null;    // 기반스트림 변수 선언
		ObjectInputStream ois = null;  //보조스트림 변수 선언
		
		try {
			 // 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20250305/Member.dat");
			
			// 객체 입력 보조 스트림 생성
			ois = new ObjectInputStream(fis); 
			
			// 스트림을 이용해서 파일에 작성된
			// 직렬화 된 Member 객체를 읽어와
			// 역직렬화를 수행하여 정상적인 Member 객체로 변경
               
		
			//Object ois.readObject() : 직렬화된 객체를 읽어와 역직렬화 
			//Object 타입으로 반환함 
			
			Member member = (Member)ois.readObject();
			                            // Object 타입으로 오기떄문에
			                             // 우리가원하는 Member 타입으로 오려면
			                              // 다운캐스팅!! 필요!!!
			
			//읽어온 내용확인 
			System.out.println(member);
			 
		
		}catch(Exception e){
			e.printStackTrace();
		
		}finally {
			try {
			
				if( ois != null) ois.close();
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	















}
