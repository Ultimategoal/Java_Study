package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collections Framework : 다수의 데이터를 다루기 위한 표준화된 방법
		 * - List >> ArrayList라는 것을 사용
		 * - Map
		 * - Set
		 * 
		 * add라는 메서드는 값을 저장하기 위한 메서드, 파라미터 하나일 경우 값을 인덱스 순서대로 저장함
		 * 파라미터가 두 개 있으면 지정된 인덱스에 값을 저장할 수 있다
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다., 수정하는 메서드, 기존에 저장된 값을 리턴으로 반환도 해줌
		 * Object get(int index) : 지정된 위치의 객체를 반환한다., 저장된 값을 얻기 위한 메서드, 인덱스 값을 지정하면 그 값에 위치하 값을 리턴 받을 수 있음
		 * int size() : 저장된 객체의 수를 반환한다., 값의 개수를 리턴해줌
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다., 인덱스 값을 넣어주면 그 위치에 있는 값을 제거해줌
		 */
		
		//배열의 단점 : 길이 변경이 어렵고 같은 타입의 데이터만 넣을 수 있음
		//그래서 다수의 데이터를 더 쉽게 다루기 위하 클래스들이 있는데
		//그 클래스들을 Collections Framework라고 함
		//자바에서 제공하는 표준화된 프레임워크
		//List, Map, Set 3가지가 제공
		//List는 배열과 비슷 인덱스도 존재
		//Map은 인덱스에 저장하는것이 아니라 키에다가 저장, 본인이 원하는 곳에다 직접 키를 지정, 키와 값을 함께 저장하는 특징이 있음
		//Set은 값을 저장하는데 인덱스라는 개념이 없고 값이 중복해서 저장되지 않음
		//위의 3가지는 인터페이스라고 함
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc"); //String 타입의 값을 저장
		sample.add(100); //int 타입의 값을 저장 이렇게 Array list에서는 타입에 상관없이 값 저장이 가능
		sample.add(new Scanner(System.in));
		
		//제네릭
		ArrayList<Integer> list = new ArrayList<>(); //이렇게 제네릭 설정해주면 Integer만 저장이 가능하게 됨
		list.add(10);
//		list.add("abc"); 이렇게 다른 타입은 저장이 불가능하게 됨
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list); //배열에서 Arrays.toString해서 프린트한거랑 똑같이 나옴
		
		list.add(1, 40); //1번 인덱스부터 뒤로 밀고 값을 저장한다.
		System.out.println(list); //1번 인덱스 자리에 40이 들어간것을 볼 수 있다. 인덱스는 0번부터 시작
		
//		list.add(5, 50); 인덱스가 현재 3까지 밖에 없어서 범위를 넘었기 때문에 에러 뜸, add는 위치 지정해주는거라서 새로운 인덱스를 만들지는 못함
		//그래서 지금 인덱스가 0~3까지 밖에 없으므로 4이상 넣어봤자 에러 뜸
		
		Integer before = list.set(2, 50); //2번 인덱스를 50으로 수정
		System.out.println("before : " + before); // 출력해보면 수정된 값이 아니라 원래 값으로 출력이 됨
		System.out.println("after : " + list.get(2)); //get을 이용해서 2번째 인덱스 확인해보면 50이 들어간것을 확인 할 수 있음
		System.out.println(list); //다시 확인해보면 2번째 인덱스에 값이 20에서 50으로 바뀐 것을 확인 할 수 있다
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
		//배열에 length가 있듯이 Array list에는 사이즈가 있음 길이를 나타날 때 이용 for문으로 주로 사용
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			
//			list.remove(i); //해당 인덱스의 값을 제거해줌
//			//Array list의 여러 값을 한 번에 삭제하고 싶다면 위 방식처럼 for문을 이용해서 삭제하면 안됨
//			//왜냐하면 Array list의 특징이 앞에 0번 인덱스의 값이 삭제 되었다면 그 뒤에 오는 1번 인덱스가
//			//그 자리를 채우기 때문임 빈 공간을 주지 않기 때문에 이런식으로 for문을 이용해서 삭제해봤자 값이 다 삭제가 되지 않음
//		}
//		System.out.println(list);
		
		//값을 제거 할 때는 뒤에서부터 제거해야 한다.
		for(int i = list.size() - 1; 0 <= i; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
		
		//list에 1 ~ 100사이의 랜덤값을 10개 저장해주세요.
		for(int i = 0; i < 10; i++){
			list.add((int)(Math.random() * 100) + 1);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 출력해주세요.
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < 10; i++){
			sum += list.get(i);
						
		}
		avg = (double)sum / list.size();
		System.out.println("sum : " + sum + " / avg : " + avg);
		
		/*
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 * char : Character
		 * boolean : Boolean
		 * 
		 * Collections 저장은 객체만 가능, 콜렉션에서는 왼쪽 기본형 애들을 저장하고 싶을 때 오른쪽 메포?클래스로 저장을 한다.
		 * list.add(10) 이 int가 integer로 자동형변환되서 들어감
		 * int a = list.get(2); 이것도 마찬가지로 int가 자동으로 integer로 형변환 되서 들어감
		 */
		
		//list에서 최소값과 최대값을 출력해주세요.
		
		int max = list.get(0);
		int min = list.get(0);
		
		for(int i = 0; i < list.size(); i++){
			if(max < list.get(i)){
				max = list.get(i);
			}
			if(min > list.get(i)){
				min = list.get(i);
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		//list를 오름차순으로 정렬해주세요.
		for(int i = 0; i < list.size() - 1; i++){
			min = i;
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(j) < list.get(min)){
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
					
		}System.out.println(list);
		
		ArrayList wow = new ArrayList();
		
		wow.add(5);
		wow.add(30);
		wow.add(8);
		
		
		
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(); //new 뒤에는 <>해도 되고 안해도 됨
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list2.add(list);
		list.add(40);
		list.add(50); //어차피 주소를 참조하는 거라 이렇게 뒤에 써도 값이 들어감
		
		System.out.println(list2);
		
		//모든 값의 접근을 위한 for문
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> li = list2.get(i);
			for(int j = 0; j < li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		//하나의 값만 가져오고 싶다면
		
		Integer integer2 = list2.get(0).get(1);
		System.out.println(integer2);
		
		
	}	
	
	
}

		

