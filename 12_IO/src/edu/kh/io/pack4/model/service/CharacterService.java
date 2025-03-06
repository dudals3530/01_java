package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterService {

	/*
	 * 문자 기반 스트림
	 *
	 * - 2byte 문자 단위로 입/출력 하는 스트림
	 * 
	 * - Reader(입력), Writer(출력)
	 * 
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	/**
	 * 문자 기반 파일 입력 (파일 읽어오기)
	 * +보조스트림 Buffered 사용
	 */
	public void fileInput() {
		
		// 스트림 참조변수
		FileReader fr = null; // 문자기반 파일 입력 스트림
		// 2byte 기반이라 한글도 다 읽어올수있음 .
		BufferedReader br = null; //문자기반 보조스트림
		
		try {
			//문자 기반 스트림 생성
			fr = new FileReader("/io_test/20250305/노래가사.txt");
			
			//보조 스트림 생성
			br = new BufferedReader(fr);
			
			String line = null; //한줄을 읽어와 저장할 변수
			
			while(true) {
				
				//BufferedReader.readLine() : 한줄씩 문자열을 읽는 역할.(줄단위)
				//-> 개행문자가 나올떄까지의 문자열을 읽음.
				line = br.readLine();
				
				if(line == null) {// 더이상 읽어올 내용이 없을떄
					break; // 반복종료
				}
			
				System.out.println(line);	
			}
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		
		}finally {
			
			try {
			
				if(br != null)br.close();
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	
	/**
	 * 문자 기반 파일 출력 (파일 내보내기)
	 * +보조스트림 Buffered 이용
	 */
	public void fileoutPut() {
		
		//스트림 참조변수 선언
		FileWriter fw = null;
		BufferedWriter bw =null; //보조스트림 참조변수 선언
		
		try {
			// 단일쓰레드 환경이라 StringBuilder 이걸씀 비동기!
			StringBuilder sb = new StringBuilder();
			
			sb.append("오늘은 3월 6일 목요일 입니다\n");
			sb.append("벌써 목요일라니 ,, 개꿀\n");
			sb.append("그리고 오늘 쪽지 시험 있다니 ..ㅠ;");
			
			String content = sb.toString(); // String 타입으로 변환
			
			//content 에 저장된 문자열을 
			// /io_test/20250305/출력테스트.txt 파일로 출력하기
			
			//파일과 출력 스트림 연결 (파일 이 없으면 생성해줌 .. 개꿀)
			
			fw = new FileWriter("/io_test/20250305/출력테스트.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(content); // content에 저장된 내용을 연결된 파일에 출력
			
			//bw.flush();  버퍼가 있으면 꼭 써야됨 .단 아래 close 구문잇으면 안써두댐
			
			System.out.println("출력 완료");
			
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
	
		}finally {
			try {
		
				if(bw != null)	bw.close();
		
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
