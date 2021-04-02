package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		 */
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다. [] 변수명 뒤에 붙여도 되지만 주로 타입 뒤에 붙임
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다. 배열은 이렇게 초기화 함
		
		/*
		 * 변수 = 주소
		 * 주소 {0, 0, 0, 0, 0} 메모리안에 변수가 생긴거임 지금 0은 기본값
		 * 첫 번째 0이 주소안에 들어있는 값
		 */
		
		
		//배열 초기화시 기본값이 저장된다.
		/*
		 * 기본값
		 * - byte, short, int, long : 0
		 * - float, double : 0.0
		 * - char : 0(' ')
		 * - boolean : false
		 * - 참조형타입 : null >> 값이 없음을 의미
		 */
		
		array = new int[]{1, 2, 3, 4, 5};
		//위의 방식대로 저장하면 {0, 0, 0, 0, 0}이 아니라 위의 값을 가짐
		
//		array = {1, 2, 3, 4, 5}; //이 방식은 반드시 선언과 초기화를 동시에 해야 컴파일 에러가 안뜸
		int[] array2 = {1, 2, 3, 4, 5};
		//위의 두 가지 방식으로도 변수 초기화가 가능
		//배열을 초기화하는 방법은 총 3가지
		
		
		//배열에다가 개별적으로 값을 집어넣을 때 사용
		//배열은 같은 타입의 값만 저장 가능
		
		System.out.println(array[0]); //인덱스는 0번부터 시작해서 첫 번째 값을 불러오려면 0을 입력
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i + 1) * 10;
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		
		int [] arr;
		arr = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100) + 1;

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr); //변수에 들어있는 주소가 출력됨
		//배열에 들어있는 값을 문자열로 표시해줌
		//한줄로 다 출력해줌
		
		//배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		double avg = sum/10.0;
		//double avg = (double)sum / arr.length; 위에랑 똑같음
		System.out.println("합계 : " + sum + "  /  평균 : " + avg);
		
		//배열의 길이는 int
		
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
			}
		System.out.println(Arrays.toString(shuffle));
		
		for(int i = 0; i < shuffle.length * 10; i++){
			int index = (int)(Math.random() * shuffle.length);
			
			int temp = shuffle[0];
			shuffle[0] = shuffle[index];
			shuffle[index] = temp;

		}
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int [] counts = new int[10];
		for(int i = 0; i < 500; i++){
			int random = (int)(Math.random() * 10) + 1;
			
//			if(random == 1) counts[0]++;
//			if(random == 2) counts[1]++;
//			if(random == 3) counts[2]++;
//			if(random == 4) counts[3]++;
//			if(random == 5) counts[4]++;
//			if(random == 6) counts[5]++;
//			if(random == 7) counts[6]++;
//			if(random == 8) counts[7]++;
//			if(random == 9) counts[8]++;
//			if(random == 10) counts[9]++;
			//위에꺼 간단히 표현
			counts[random - 1]++;
		}
		
		System.out.println(Arrays.toString(counts));
		
		

	}

}

