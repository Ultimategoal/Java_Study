package review;

public class MarchEleventhChile extends MarchEleventhParent {

//	MarchEleventhChile mec = (MarchEleventhChile) new MarchEleventhParent(); 타입 변경해줘야함
	MarchEleventhParent mep = new MarchEleventhChile();
	
	void chileMethod1(){
		System.out.println(var);
		System.out.println(method1(3, 7));
	}
	
	@Override
	int method1(int a, int b){
		return a * b;
	}
	
	int var;
	
	void test1(double var){
		System.out.println(var);
		System.out.println(this.var);
		System.out.println(super.var);
		System.out.println(this.method1(10, 20));
		System.out.println(super.method1(10, 20));
	}
	
	public static void main(String[] args) {
	}
	
	
	
}
