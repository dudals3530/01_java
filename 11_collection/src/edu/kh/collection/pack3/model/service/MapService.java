package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	// key: value   - > 이걸 Entry라고함
	
	// - key 를 모아두면 Set의 특징 ( 중복 X ) 
	// - Value를 모아두면 List의 특징 ( 중복 O)
	
	public void ex1() {
		
		// HashMap <K , V > : Map 의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		// Map.put(Integer Key, String Value) : 추가 기능
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		
		// key 중복 테스트
		map.put(1, "김영민");  // 중복허용 X , 대신 Value 덮어쓰기
		map.put(1, "김영민"); 
		map.put(1, "김영민");
		
		
		
		map.put(7, "최길동");   // Value  중복허용 가능 
		
		
		System.out.println(map);
		
	}
	// key value map 예제
	
	public void ex2() {
		
		//Map 사용 예제
		
		//VO / DTO (값 저장용 객체)는 특정 데이터 묶음의 재상용이 많은 경우 주로 사용함.
		// -> 재사용이 적은 VO 는 오히려 코드 낭비
		// - > Map 을 이용해서 Vo 와 비슷한 코드를 작성 할수 있음

		// 1) VO 버전
		Member member = new Member();
		
		// 값세팅
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(30);
				
		// 값출력
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		
		System.out.println("==== 아래는 MAp 버전 =====");
		
		// 2) Map 버전
		Map<String, Object> map = new HashMap<String, Object>();
		//value 가 Object 타입 == 어떤 객체든 Value에 들어올수 있다!
		
		// 값세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// 값출력
		// Object(Value) Map.get(String Key) : 
		//매개변수로 전달받은 Key와 대응되는 value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("----------------------------------");
		
		// ** Map 에 저장된 데이터 순차적으로 접근하기 **
		//{"id"= "user02","pw" ="pass02","age"=25}

		// Map 에서 Key 만 모아두면 Set의 특징을 가진다 (중복저장X ) 
		// - > 이를 활용해서 Map 에서 keySet() 메서드 제공
		// - > Key 만 모아서 Set으로 반환
		
		Set<String> set = map.keySet(); // id, pw, age 가 저장된 set 반환
		
		System.out.println("keySet() : "+set); // 순서유지 안됨 .
		
		// 이렇게 Set 객체에 넣으면 향for문 사용 가능
		
		for (String key : set) {
			
			System.out.println(map.get(key));  // 향 for문으로 바꿔서 key 값에있는 value 값 뽑아오기
			
		}
		
		// map 에 저장된 데이터가 많거나(반복필요)
		// 어떤 key가 있는지 불분명 할때 ( 향상된 for 문 )
		// 또는 map 에 저장된 모든 데이터에 접근해야 할 때 
		// keySet() 이용해서 Set 개체 만들고 + 향상된 for문 코드 사용 
		
		
		
		
		
		
		
		
	}

	
	public void ex3() {
		// List에 Map 여러개 추가하여 다루기
		
		
		// List 객체 생성  ,, Map 객체생성 된거 아님 !!
		List<Map<String, Object> > list = new ArrayList<Map<String,Object>>();
		// List 객체만 생성되었고, 해당 list에는 Map만 들어올수 있음을 제한함!
		// -> Map 객체는 아직 생성X 
		
		for(int i=0; i < 10; i++) {
			
			// Map 객체생성
			Map<String, Object> map = new HashMap<String, Object>();    // 순서대로 한거 보고싶으면 LinkedHashMap 으로만 바꿔주면됨 다형성!
			// 여기서 이제 map 객체가 포문 돌면서 생성됨 10 개 되것지 ?
			
			//Map 에 데이터 추가
			map.put("id", "user0"+i); // user 00 ,, user01 ,, user02 ....
			map.put("pw", "pass0"+i); // pass 00 ,, pass01.....
 			
			// Map 을 List 에 추가
			list.add(map);
			// HashMap 은 순서를 보장하지 않는 자료구조 !
			// 우리가 put 한 순서로 나오지않음
			// 순서를 유지하고 싶다 !! 하면 LinkedHashMap 이용하면 된다! 
			// ->LinkedHashMap 은 put 한 순서를 유지시켜줌
			
			//
			
			
			
		}
		
		// for 문 종료시 list에 10개의 Map 객체가 추가되어있따.
		System.out.println(list);
		
		//향상 된 for문 이용하여 key가 "id"에 대응되는 value 값 전부 출력하기
		
		for( Map<String, Object> temp :list) { // 아 이미 list 있엇넹 ..
			
			System.out.println(temp.get("id"));
		}
		
		
		
	}
	
}
