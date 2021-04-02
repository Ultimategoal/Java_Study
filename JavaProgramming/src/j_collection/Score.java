package j_collection;

import java.util.ArrayList;

public class Score {

	private static final String Integer = null;

	public static void main(String[] args) {/*
		
		ArrayList<ArrayList> score = new ArrayList();
		
		ArrayList<ArrayList> subScore = new ArrayList();
		
		ArrayList subject = new ArrayList();
		ArrayList sub = new ArrayList();
		
		
		
		double avg = 0;
		int sum = 0;
		int subSum = 0;
		double subAvg = 0;
		
		System.out.print("\t");
		System.out.println("국어\t영어\t수학\t사회\t과학\tOrcale\tJava\t합계\t평균\t순위");
		
		Integer num = 0;
		Integer subNum = 0;
		int rank = 1;
		for(int i = 0; i < 5; i++){
			subject.add(i+1 + "번 학생");
			
			for(int j = 0; j < 7; j++){
				subject.add((int)(Math.random() * 100) + 1);
				num = (Integer)subject.get(j+1);
				sum += num;
				avg = Math.round((double)sum / 7.0 * 100) / 100.0;
			}
			subject.add(sum);
			subject.add(avg);
			
			
			subject.add(rank);
			score.add(subject);
			
			sum = 0;
			avg = 0;
			subject = new ArrayList();
		}
		
		Integer numNum = 0;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if((Integer)score.get(j).get(8) > (Integer)score.get(i).get(8)){
					rank++;
					score.get(i).set(10, rank);
				}
			}
			rank = 1;
		}
		
		
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				score.get(i).get(10);
				if((Integer)score.get(i).get(10) < (Integer)score.get(j).get(10)){
					score.get(i).get(j);
				}
			}
		}
		
		
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 5; j++){
				sub.add(score.get(j).get(i+1));
			}
			subScore.add(sub);
			sub = new ArrayList();
		}
		
							
		for(int i = 0; i < score.size(); i++){
			ArrayList<Integer> li = score.get(i);
			for(int j = 0; j < li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		System.out.print("과목합계\t");
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 5; j++){
				subNum = (Integer)subScore.get(i).get(j);
				subSum += subNum;
			}
			System.out.print(subSum+"\t");
			subSum = 0;
		}
		System.out.println();
		
		
		System.out.print("과목평균\t");
		
		
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 5; j++){
				subNum = (Integer)subScore.get(i).get(j);
				subSum += subNum;
				subAvg = Math.round((double)subSum / 5.0 ) *100 / 100;
			}
			System.out.print(subAvg+"\t");
			subSum = 0;
			subAvg = 0;
		}*/
		
		ArrayList<String> students = new ArrayList<>();
		students.add("오태훈");
		students.add("조항민");
		students.add("김정명");
		students.add("이치우");
		
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		ArrayList<Integer> ranks = new ArrayList<>();
		ArrayList<Integer> subSums = new ArrayList<>();
		ArrayList<Double> subAvgs = new ArrayList<>();
		
		for(int i = 0; i < students.size(); i++) {
			ranks.add(1);
			
			ArrayList<Integer> score = new ArrayList<>();
			for(int j = 0; j < subjects.size(); j++) {
				score.add((int)(Math.random() * 101));
			}
			scores.add(score);
		}
		
		for(int i = 0; i < scores.size(); i++) {
			int sum = 0;
			for(int j = 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / scores.get(i).size() * 100) / 100.0);
		}
		
		for(int i = 0; i < sums.size(); i++) {
			for(int j = 0; j < sums.size(); j++) {
				if(sums.get(i) < sums.get(j)) {
					ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		for(int i = 0; i < ranks.size(); i++) {
			int min = i;
			for(int j = i + 1; j < ranks.size(); j++) {
				if(ranks.get(j) < ranks.get(min)) {
					min = j;
				}
			}
			
			String tempName = students.get(i);
			students.set(i, students.get(min));
			students.set(min, tempName);
			
			ArrayList<Integer> tempScore = scores.get(i);
			scores.set(i, scores.get(min));
			scores.set(min, tempScore);
			
			int tempSum = sums.get(i);
			sums.set(i, sums.get(min));
			sums.set(min, tempSum);
			
			double tempAvg = avgs.get(i);
			avgs.set(i, avgs.get(min));
			avgs.set(min, tempAvg);
			
			int tempRank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, tempRank);
		}
		
		for(int i = 0; i < subjects.size(); i++) {
			int sum = 0;
			for(int j = 0; j < students.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add(Math.round((double)sum / students.size() * 100) / 100.0);
		}
		
		System.out.println("===================================================================================");
		System.out.print("이름");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			
			ArrayList<Integer> score = scores.get(i);
			for(int j = 0; j < score.size(); j++) {
				System.out.print("\t" + score.get(j));
			}
			System.out.println("\t" + sums.get(i) + "\t" + avgs.get(i) + "\t" + ranks.get(i));
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("과목합계");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subSums.get(i));
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subAvgs.get(i));
		}
		System.out.println();
		System.out.println("===================================================================================");
		
		
		
	}

}
