package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 */
		
		//2차원
		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		/*
		 * {주소1, 주소1}
		 * 
		 * 주소1
		 * {0, 0, 0}
		 * 
		 * 주소2
		 * {0, 0, 0}
		 */
		
		int[][] arr = new int[2][3]; // 3칸짜리 배열이 2개 들어가있는 형태
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //얘는 선언과 초기화를 반드시 동시에 해줘야 한다.
		
		int[][] arr4 = new int[3][]; //가변 배열
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]); //1차원과 달리 인덱스 두 개 지정해서 2차원까지 접근해야 저장된 값이 나옴
		
//		arr[0] = 10; //값을 저장할 수 없다.
		arr[0] = new int[5]; //배열을 저장해야 한다.
		arr[0][0] = 10; //2차원에 값을 저장할 수 있다.
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); //2차원 배열의 길이
		System.out.println(arr[1].length); //2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		} // 2차원 배열의 모든 값을 보고 싶다면 이런식으로 for문을 중첩해서 사용하는 수 밖에 없다.
		
		System.out.println(Arrays.toString(arr)); //2차원 배열의 경우 주소만 확인 가능
		System.out.println(Arrays.toString(arr[0])); //2차원 배열의 실제 값을 보고 싶다면 이렇게 인덱스 추가 해줘야 함
		System.out.println(Arrays.toString(arr[1]));
		
		System.out.println("여기서부터는 문제");
		
		int[][] scores = new int[3][5]; //int[학생수][과묵수]
		int[] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 101);
			}			
			System.out.println(Arrays.toString(scores[i]));
		}
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println("합계: " + sum[i] + " / 평균: " + avg[i]);
		}
		
		System.out.println("합계: " + Arrays.toString(sum));
		System.out.println("평균: " + Arrays.toString(avg));
		
		
	}
	
}

