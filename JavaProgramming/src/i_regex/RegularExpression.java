package i_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식 (회원가입 같은거 구현할 때 로그인 정보 검사할 때 사용되기도 함)
		 * 
		 * ^	뒷 문자로 시작
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외), 한 글자 표현 가능
		 * *	앞 문자가 0개 이상
		 * +	앞 문자 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z]):a부터 z까지, [^a-z]:a부터 z가 아닌것)
		 * {}	앞 문자의 개수({2}:2개, {2,4}:2개 이상 4개 이하)
		 * ()	그룹화, 여러개의 표현들을 하나로 묶어줄 수 있음
		 * |	OR연산
		 * \s	공백, 텝, 줄바꿈
		 * \S	공백, 텝, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 * 기본적인 표현들만 작성, 실제로는 더 많은 표현들이 있음
		 */
		
		String str = "abc123";
		//위에껄 정규표현식으로 패턴 만들기
//		String regex = "[a-z]{3}[0-9]{1,3}"; //위에 str은 알파벳 3글자이므로 정확히 3글자를 나오게 하기 위해서는 {3}중괄호안에 3을 써줌 안그러면 a-z에서 하나씩만 나오기 때문임
		//위에 숫자 {1,3}은 갯수를 지정해준 것이고 1개이상 3개이하를 의미한다.
		//정규표현식은 위에처럼 패턴을 만드는 것임
	
//		String regex = "[a-z0-9]+"; //a-z하나,0-9하나 나옴 근데 + 있어서 문자가 1개 이상만 있으면 됨, 패턴 일치해서 true나옴, 대문자 넣으면 false나옴, 소대문자 구분함
		
//		String regex = "\\w*"; //알파벳이나 숫자가 0개 이상, 문자열안에 역슬러쉬 하나를 표현하고 싶으면 역슬러쉬 2개 써야함 왜냐하면 역슬러쉬 자체가 하나의 탈출문자로 작용하기 때문, 알파벳이라서 소대문자 상관없음
		
//		String regex = ".*"; // 줄바꿈을 제외한 어떠한 문자도 상관없으므로 true가 나옴
//		//정규표현식 만들 때 최대한 좁은 표현을 만들어야 내가 원하는 패턴에 맞는 표현을 가져올 수 있음
//		
//		Pattern p = Pattern.compile(regex); //컴파일된 패턴을 리턴해줌
//		Matcher m = p.matcher(str); //str비교하는걸 Matcher라는 타입으로 넘겨줌
//		System.out.println(m.matches()); // str문자열과 regex 패턴이 일치하기 때문에 true가 나옴 일치하지 않으면 false가 나옴
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		
		String id = "thisid1234_-";
		String number = "042-666-5896";
		String email = "thisid1234@naver.com";
		
		String idCheck = "[a-zA-Z0-9-_]{5,20}";
		Pattern p0 = Pattern.compile(idCheck);
		Matcher m0 = p0.matcher(id);
		System.out.println("id 검사 결과 : " + m0.matches());
		
		String numberCheck = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
		Pattern p1 = Pattern.compile(numberCheck);
		Matcher m1 = p1.matcher(number);
		System.out.println("전화번호 검사결과 : " + m1.matches());
		
		String emailCheck = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		Pattern p2 = Pattern.compile(emailCheck);
		Matcher m2 = p2.matcher(email);
		System.out.println("이메일 검사결과: " + m2.matches());
		
		//정답이 딱히 없기에 그 때 그 때 쓸 때마다 구글에서 검색해서 사용하면 됨
	
		
		
	}

}
