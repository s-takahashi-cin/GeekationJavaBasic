package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 5;
		int b = 3;
		
		boolean result = (a > b);
		System.out.println(result);
		
		
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean isSunnyAndWarm = isSunny && isWarm;
		
		System.out.println(isSunnyAndWarm);
		
		int x = 5;
		int y = 10;
		
		boolean andResultA = (x >= 0) && (y % 2 == 0);
		System.out.println(andResultA);
		
		boolean hasPermission =false;
		System.out.println(!hasPermission);
	}

}
