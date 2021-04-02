package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 함수를 비교해 작은 함수의 함수를 증가시키는 방식
		 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 버블정렬 : 바로 위의 숫자와 비교해서 큰수를 위로 보내는 방식
		 * 삽입정렬 : 두 번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //자바에서 구현되는 정렬 메서드임, 퀵 정렬이라는 방법을 사용해서 정렬함
		System.out.println(Arrays.toString(arr)); // 오늘 배운 3개 정렬 방법들은 느려서 사용하지를 않음
		
		//삽입정렬
//		for(int i = 1; i < arr.length ; i++){
//			int standard = arr[i];
//			int aux = i - 1;
//			while(aux >= 0 && standard < arr[aux]){
//				arr[aux + 1] = arr[aux];
//				
//				aux--;
//				
//			}
//			arr[aux + 1] = standard;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//수업시간 삽입정렬 위에꺼는 인터넷 참고함
		
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i]; //i의 값을 보존하기 위해 작성
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(temp < arr[j]){
					arr[j + 1] = arr[j];
				}else{ //작은 값을 만났을 경우 break로 빠져나가기 위함임
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		//버블정렬
		
//		for(int i = 0; i < arr.length - 1; i++){
//			boolean flag = true;
//			for(int j = 0; j < arr.length -1 -i; j++){
//				if(arr[j] > arr[j + 1]){
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					flag = false;
//				}
//			}
//			if(flag){
//				break;
//			}
//		}System.out.println(Arrays.toString(arr));
		
		
		//선택정렬
		/*
		 * for문 인덱스
		 * i,j
		 * 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9
		 * 1,2 1,3 1,4 1,5 1,6 1,7 1,8 1,9
		 * 2,3 2,4 2,5 2,6 2,7 2,8 2,9
		 * 3,4 3,5 3,6 3,7 3,8 3,9
		 * 4,5 4,6 4,7 4,8 4,9
		 * 5,6 5,7 5,8 5,9
		 * 6,7 6,8 6,9
		 * 7,8 7,9
		 * 8,9
		 */
//		for(int i = 0; i < arr.length - 1; i++){
//			int min = i;
//			for(int j = i+1; j < arr.length; j++){
//				if(arr[min] > arr[j]){					
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
//		//석차구하기
//		int[] rank = new int[arr.length];
//		for(int i = 0; i < rank.length; i++){
//			rank[i] = 1;
//		}
//		
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr.length; j++){
//				if(arr[i] < arr[j]){
//					rank[i]++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(rank));
		
		
	}

}
