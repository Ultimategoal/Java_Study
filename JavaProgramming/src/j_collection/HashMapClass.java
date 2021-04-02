package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다., 저장할 때 이렇게 파라미터를 2개 넘겨줘야함(키, 저장할 이름)
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 * 인덱스라는 개념이 없어서 순서가 없음
		 */
		
		HashMap<String, Object> map = new HashMap<>(); //<>이렇게 타입을 넣어주는걸 제네릭이라고 함, hash map에서는 앞에있는게 키고 뒤에 오는게 값임
		//보통 키는 String을 정하고 뒤에 오는 값은 int나 아무거나 본인이 원하는 걸 넣어주면 됨
		
		map.put("a", 10); //10이라는 값을 a라는 키로 저장함
		map.put("b", "홍길동"); //홍길동이라는 값을 b라는 키로 저장함
		map.put("c", new Date()); //지금 아무타입으로 저장이 가능한게 위에 Object로 제네릭을 설정했기 때문
		
		System.out.println(map); //인덱스가 없기 때문에 순서라는 개념이 없음 그래서 순서가 b, c, a로 나옴
		//저장한 순서와는 무관하게 출력됨
		
		map.put("b", "이순신"); //이렇게 하게 되면 값을 덮어씌게 됨, 하나의 키에는 하나의 값만 들어갈 수 있음
		//그래서 위에 홍길동 없어지고 이순신이 들어가게 됨
		System.out.println(map);
		
		map.remove("a"); //a라는 키를 삭제
		
		System.out.println(map);
		
		Object value = map.get("b"); //값을 얻기 위해서 get을 사용하고 저장할 때에는 제네릭에서 설정한 타입을 그대로 써야함
		System.out.println(value);
		
		String value2 = (String)map.get("b"); //Object로 설정하기 했지만 형 변환을 통해서 형변환 가능
		System.out.println(value2);
		
		Set<String> keys = map.keySet(); //모든 키를 set의 형태로 반환해줌
		System.out.println(keys);
		
		//Set은 값을 꺼낼 수 있는 수단이 존재하지 않음
		
		for(String key : keys){ //향상된 for문, : 오른쪽에 데이터형태가 오게됨, 왼쪽에는 오르쪽에 있는 값을 꺼내줄 변수를 만들어줌, 타입은 : 오르쪽에 있는 데이터의 타입으로 타입이 결정됨, 콜론 오른쪽에 있는 값을 처음부터 끝까지 다 꺼낼때 까지 돌아감
			System.out.println(key + " : " + map.get(key));
		}
		
		//데이터베이스에서 한 줄(row)을 표현할 때 hashmap을 사용
		
		//회원 테이블
		//아이디, 비밀번호, 이름, 전화번호 >> 전부 String으로 저장해야하기 때문에 String으로 저장
		HashMap<String, String> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-1234");
		
		System.out.println(user);
		
		//회원 명의 데이터가 담긴 HashMap을 하나 더 만들어주세요.
		HashMap<String, String> user1 = new HashMap<>();
		user1.put("id", "user1");
		user1.put("password", "user123");
		user1.put("name", "방문자");
		user1.put("tel", "010-1234-1234");
		
		System.out.println(user1);
		//테이블 형태로 저장을 하려면 ArrayList에다가 저장하면 됨
		
		ArrayList<HashMap<String, String>> table = new ArrayList<>(); //제네릭에 HashMap을 저장하고 싶은거니까 HashMap이라고 써야됨 HashMap안에 타입은 HashMap만든 타입이랑 똑같이 해주면 됨
		table.add(user);
		table.add(user1);
		System.out.println(table);
		
		//자바랑 DB연동할 때 이렇게 테이블 만들 때 써주면 됨
		
		//ArrayList와 HashMap을 사용해 데이터베이스에 있는 임의의 테이블을 저장해주세요.
		
		HashMap<String, Object> lprod = new HashMap<>();
		lprod.put("LPROD_ID", "1");
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		
		HashMap<String, Object> lprod1 = new HashMap<>();
		lprod1.put("LPROD_ID", "2");
		lprod1.put("LPROD_GU", "P102");
		lprod1.put("LPROD_NM", "전자제품");
		
		HashMap<String, Object> lprod2 = new HashMap<>();
		lprod2.put("LPROD_ID", "3");
		lprod2.put("LPROD_GU", "P201");
		lprod2.put("LPROD_NM", "여성캐주얼");
		
		HashMap<String, Object> lprod3 = new HashMap<>();
		lprod3.put("LPROD_ID", "4");
		lprod3.put("LPROD_GU", "P202");
		lprod3.put("LPROD_NM", "남성캐주얼");
		
		HashMap<String, Object> lprod4 = new HashMap<>();
		lprod4.put("LPROD_ID", "5");
		lprod4.put("LPROD_GU", "P301");
		lprod4.put("LPROD_NM", "피혁잡화");
		
		HashMap<String, Object> lprod5 = new HashMap<>();
		lprod5.put("LPROD_ID", "6");
		lprod5.put("LPROD_GU", "P302");
		lprod5.put("LPROD_NM", "화장품");
		
		HashMap<String, Object> lprod6 = new HashMap<>();
		lprod6.put("LPROD_ID", "7");
		lprod6.put("LPROD_GU", "P401");
		lprod6.put("LPROD_NM", "음반/CD");
		
		HashMap<String, Object> lprod7 = new HashMap<>();
		lprod7.put("LPROD_ID", "8");
		lprod7.put("LPROD_GU", "P402");
		lprod7.put("LPROD_NM", "도서");
		
		HashMap<String, Object> lprod8 = new HashMap<>();
		lprod8.put("LPROD_ID", "9");
		lprod8.put("LPROD_GU", "P403");
		lprod8.put("LPROD_NM", "문구류");
		
		ArrayList<HashMap<String, Object>> tableLprod = new ArrayList<>();
		
		tableLprod.add(lprod);
		tableLprod.add(lprod1);
		tableLprod.add(lprod2);
		tableLprod.add(lprod3);
		tableLprod.add(lprod4);
		tableLprod.add(lprod5);
		tableLprod.add(lprod6);
		tableLprod.add(lprod7);
		tableLprod.add(lprod8);
		
		System.out.println(tableLprod);
		
	}

}
