package basicSyntax;

public class MethodPractice {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		methodFive(methodOne(a, b));
		methodFive(methodTwo(a, b));
		methodFive(methodThree(a, b));
		methodFive(methodFour(a, b));
	}
	
	public static int methodOne(int a, int b) {
		return a + b;
	}
	
	public static int methodTwo(int a, int b) {
		return a - b;
	}
	
	public static int methodThree(int a, int b) {
		return a * b;
	}
	
	public static int methodFour(int a, int b) {
		return a / b;
	}
	public static void methodFive(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}