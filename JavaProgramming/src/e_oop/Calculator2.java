package e_oop;

public class Calculator2 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double plus = cal.plus(123456, 654321);
		System.out.println(plus);
		double second = cal.multiply(plus, 123456);
		System.out.println(second);
		double third = cal.devide(second, 123456);
		System.out.println(third);
		double fouth = cal.minus(third, 654321);
		System.out.println(fouth);
		double fifth = cal.rest(fouth, 123456);
		System.out.println(fifth);
	}

}
