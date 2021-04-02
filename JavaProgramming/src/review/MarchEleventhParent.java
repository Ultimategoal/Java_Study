package review;

public class MarchEleventhParent {
	
	String var;
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	MarchEleventhParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method1(int a, int b){
		return a + b;
	}
}
