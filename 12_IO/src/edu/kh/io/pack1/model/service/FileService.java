package edu.kh.io.pack1.model.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileService {

	/* File 클래스
	 *
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리 존재 유무 관계 없음)
	 *
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 *
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String   getName()        : 파일 이름 반환
	 * String   parent()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */
	
	/* [개발자 상식!]
	 *
	 * OS : 운영 체제
	 *
	 *  (Windows)    /     (Linux, Mac)
	 *    폴더       /      디렉토리
	 *
	 * - 경로 표기 방법(하위 폴더, 파일 표시)
	 *
	 * 백슬래시 (\, Windows)     -> C:\workspace\01_Java
	 * 슬래시   (/, Linux, Mac ) -> C:/workspace/01_Java
	 *
	 *
	 * - Java 언어의 특징 : 플랫폼(OS)에 독립적
	 * -> OS 관계 없이 똑같은 코드 작성이 가능
	 *
	 * -> 이 특징을 유지하기 위해 /, \ 둘다 호환 가능
	 *   (런타임 시 실행되는 OS에 맞게 자동으로 변경)
	 *
	 *
	 * -------------------------------------------------------------
	 *
	 * - 경로 표기 방법
	 *
	 * 1) 절대 경로 : 하나의(절대적인) 기준으로 부터
	 * 				 목표까지의 경로를 모두 표기하는 방법
	 *
	 * - 기준
	 * [Windows] :   C:/  , D:/
	 * [Linux, Mac] : /Users ,   /
	 *
	 *
	 * 2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법
	 *
	 *
	 * */

	/**
	 * File 클래스로 객체 생성
	 * + 폴더가 존재 하지 않으면 폴더 생성 
	 * 
	 */
	public void method1() {
		
		// 제일 앞에 "/" 의 의미 : 최상위 폴더 ( == root, 절대 경로의 기준점)
		// 리눅스, mac에서는 User/ , 윈도우에서는 C:/ , D:/ 등
		
		
		// c:io_test/51581618 폴더를 지정
		File directory = new File("/io_test/20250305");
		
		// 존재 하지 않는 폴더를 관리하는 File 객체 생성
		
		if (!directory.exists()) {// 폴더가 존재하지 않으면
			
			//  폴더를 모두 생성
			directory.mkdirs();
			
			System.out.println(directory.getName());
			System.out.println(directory.getPath());
			
		}
		
		
		
		
	}
	
	
	/**
	 * File 객체를 이용해서
	 * 지정된 위치에 파일 생성하기
	 * createNewFile()  : 파일 생성
	 * 
	 */
	public void method2() {
		
		// 문자열에서 "\" 표기하는 방법은 \\ 두번 쓰면된다
		// = > 역슬래시는 이스케이프 문자로 사용됨
		// - > 역슬래시 문자 그대로 쓸꺼면 두번 입력하면 됨.
		File file = new File("\\io_test\\20250305\\파일생성.txt");
		
		if(!file.exists()) {
			
			// 파일 생성
			try {
				// File 클래스의 메서드는 대부분 IOException 발생시킴
				// - > IOException는 반드시 예외 처리해야하는 
				//checked Exception 이다.
				// 그래서 예외처리가 필수이다.
				if(file.createNewFile() ) { // 파일이 정상 생성된 경우
					System.out.println(file.getName() + "파일이 생성되었습니다.");
					
				}
			
			} catch (IOException e) {
			
				e.printStackTrace();// 예외정보 + 예외가 발생한 위치까지의 메서드추적
				
			}
			
		}
		
	}
	
	
	/**
	 * File 클래스 제공 메서드 활용하기
	 * 
	 */
	public void method3() {
		
		//File 객체 생성
		File directory = new File("\\workspace\\01_Java\\12_io");
		
		//지정된 경로에 있는 모든 파일/디렉토리를 File[] 형태로 얻어오기
		File[] files = directory.listFiles();
		
		//System.out.println(Arrays.toString(files));
		
		//향상된 for 문
		
		for (File f:files) {
			
			//파일명 
			String fileName = f.getName();
			
			// 마지막으로 수정한 날짜
			long lastModified = f.lastModified();
		//	System.out.println(lastModified); // 1741135114818 이게 뭐여 ..
			
			//java.text.SimpleDateFormat : 라는 클래스가있음메 
			                      // 간단히 날짜 형식을 지정할 수 있는 객체

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
			
			// String SimpleDateFormat.format(long) : 
			// 매개변수 long 값을 지정된 패턴 형식으로 변환하여
			// 문자열 형태로 반환

			String date = sdf.format(lastModified);
		//	System.out.println(date); //2025-03-05 오전 9:38
			
			String type = null;
			
			if(f.isFile()) type = "파일";
			else           type = "폴더";
			
			// 파일 크기 (byte)
			String size = f.length() + "B";
			if (f.isDirectory()) size = "";
			// - > 폴더 크기를 구하는 메서드는 따로 존재하지 않는다
			// -> 구하려면 폴더안의 모든 파일을 순회하여 
			//각파일 크기를 합산해서 써야함.
			
			String result = String.format("%-20s %-20s %-5s %10s" , 
					                          fileName,date,type,size   );
			
			System.out.println(result);

		     // 원하는 날짜 형식 지정
			   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			    // 현재 날짜와 시간을 가져옴
			   Date currentDate = new Date();
			// SimpleDateFormat을 이용하여 Date 객체를 문자열로 변환
			   String formattedDate = formatter.format(currentDate);
			     // 현재 날짜 출력
			    System.out.println("현재 날짜와 시간: " + formattedDate);
			   
		}
	}

	

	
}
