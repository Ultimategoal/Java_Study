package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를 0~100까지 랜덤으로 생성해주시고, 아래와
		 * 같이 출력해주세요.
		 * 
		 * 국어 영어 수학 사회 과학 Oracle Java 합계 평균 석차 홍길동 90 90 90 90 90 90 90 630
		 * 90.00 1 홍길동 홍길동 홍길동 홍길동 과목합계 450 450 450 450 450 450 450 과목평균 90 90
		 * 90 90 90 90 90
		 */
		/*
		 * System.out.println("	국어	 " + "	영어		" +"수학	 " + "	사회 	" + "	과학    	 "
		 * + "	Oracle 	  " + "	Java 	" + "	합계	 " + "	평균		 " + "석차 	"); int[][]
		 * student = new int[25][10]; for(int i = 0; i < student.length; i++){
		 * for(int j = 0; j < 7; j++){ student[i][j] = (int)(Math.random()*101);
		 * } // System.out.println(i+1 + "번학생" + Arrays.toString(student[i])); }
		 * 
		 * int[] sum = new int[student.length]; double[] avg = new
		 * double[student.length]; int[] sub = new int[student[7].length];
		 * double[] subAvg = new double[7];
		 * 
		 * for(int i = 0; i < student.length; i++){ for(int j = 0; j < 7; j++){
		 * sum[i] += student[i][j]; System.out.print("	" + student[i][j]+"	"); }
		 * // sub[0] += student[i][0]; // sub[1] += student[i][1]; // sub[2] +=
		 * student[i][2]; // sub[3] += student[i][3]; // sub[4] +=
		 * student[i][4]; // sub[5] += student[i][5]; // sub[6] +=
		 * student[i][6]; // // subAvg[0] = (double)sub[0]/student.length;
		 * 
		 * 
		 * 
		 * 
		 * avg[i] = (double)sum[i]/7; avg[i] = Math.round(avg[i]* 100) / 100;
		 * System.out.print("	" + sum[i] +"		"+ avg[i]);
		 * System.out.println("	    	   " + student[i][9] + "등");
		 * 
		 * }
		 * 
		 * for (int i = 0; i < student.length; i++) { student[i][9] = 1; for
		 * (int j = 0; j < 7; j++) { if (student[i][7] < student[i][7])
		 * student[i][9]++; }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * System.out.print("과목합계"); int[] sub1 = new int[7]; for(int i = 0; i <
		 * 7; i++){ for(int j = 0; j < student.length; j++){ sub1[i] +=
		 * student[j][i]; subAvg[i] = (double)sub1[i]/student[i].length; }
		 * System.out.print("	" + sub1[i] + "	"); // System.out.print("" +
		 * subAvg[i] + "  ");
		 * 
		 * // System.out.println("과목별 합: " + sub1[i] + "/과목별 평균: " + subAvg[i]);
		 * }System.out.println(); System.out.print("과목평균");
		 * 
		 * for(int i = 0; i < 7; i++){ for(int j = 0; j < student.length; j++){
		 * subAvg[i] = (double)sub1[i]/student[i].length; } System.out.print("	"
		 * + subAvg[i] + " 	 ");
		 * 
		 * }
		 */

		// System.out.println("과목합계" + Arrays.toString(sub1));
		// System.out.println("과목평균" + Arrays.toString(subAvg));

		// System.out.println(Arrays.toString(sub1));
		// System.out.println(Arrays.toString(subAvg));

		// ---------------------------------------------------------------------------------------------------------------------------------

		String[] names = { "허지영", "김민지", "김동민", "배현태", "여인욱", "김동희", "김인혁",
				"이영섭", "정선영", "이지향", "김용진" };
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "Oracle", "Java" };
		int[][] score = new int[names.length][subjects.length];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		}

		int[] nameSum = new int[score.length];
		double[] nameAvg = new double[score.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
			nameAvg[i] = Math
					.round((double) nameSum[i] / subjects.length * 100) / 100.0;
		}

		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		for (int i = 0; i < subjects.length; i++) {
			for (int j = 0; j < score.length; j++) {
				subSum[i] += score[j][i];
			}
			subAvg[i] = Math.round((double) subSum[i] / score.length * 100) / 100.0;
		}

		int[] rank = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < score.length; j++) {
				if (nameSum[i] < nameSum[j]) {
					rank[i]++;
				}
			}
		}

		// 석차순으로 정렬(시험에서 출제되지 않음)
		// for(int i = 0; i < nameSum.length - 1; i++){
		// int min = i;
		// for(int j = i + 1; j < nameSum.length; j++){
		// if(nameSum[j] > nameSum[min]){
		// min = j;
		// }
		// }
		// int[] temp = score[i];
		// score[i] = score[min];
		// score[min] = temp;
		//
		// int temp2 = nameSum[i];
		// nameSum[i] = nameSum[min];
		// nameSum[min] = temp2;
		//
		// double temp3 = nameAvg[i];
		// nameAvg[i] = nameAvg[min];
		// nameAvg[min] = temp3;
		//
		// int temp4 = rank[i];
		// rank[i] = rank[min];
		// rank[min] = temp4;
		//
		// String temp5 = names[i];
		// names[i] = names[min];
		// names[min] = temp5;
		// }

		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}

		System.out.print("과목합계\t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();

		System.out.print("과목평균\t");
		for (int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i] + "\t");
		}
	}

}
