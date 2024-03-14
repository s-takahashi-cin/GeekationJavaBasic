package basicSyntax;

public class GeekIntroduction {

	public static void greeding(int age, double height) {
		System.out.println("こんにちは！私はGeek組んでごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}

	public static void specialSkill(int num1, int num2) {
		//num1またはnum2が1より小さい場合
		if (num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		}
		//num1がnum2以上の場合
		if (num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}
		//num1またはnum2が300より大きい場合
		if(num1 > 300 || num2 > 300) {
			System.out.println("num1とnum12は300以下にしてください。");
			return;
		}
		//繰り返し処理の中で数値が3の倍数かつ5の倍数の場合		
		for (int i = num1; i <= num2; i++) {
			//繰り返し処理の中で数値が3の倍数かつ5の倍数の場合
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println( i + "は3の倍数かつ5の倍数です。");
				continue;
			}
			if (i % 3 == 0) {
				System.out.println( i + "は3の倍数です。");
				continue;
			}
			if (i % 5 == 0) {
				System.out.println( i + "は5の倍数です。");
				continue;
			}
			System.out.println(i);
		}
	}
}
