public class ThreeSixNineGame {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) { // i가 1부터 100까지 반복되어야합니다.
			int secondNumber = i % 10; // 1의 자리 숫자를 나타냅니다
			// secondNumber % 10

			int firstNumber = i / 10; // 10의 자리 숫자를 나타냅니다.
			// firstNumber / 10
			System.out.println("secondNumber:" + secondNumber);
			System.out.println("firstNumber:" + firstNumber);

			boolean is306090 = (firstNumber == 3) || (firstNumber == 6) || (firstNumber == 9);
			boolean is369 = (secondNumber == 3) || (secondNumber == 6) || (secondNumber == 9);

			if (is306090 && is369 == true) {
				System.out.println("**");
			} else if (is306090) {
				System.out.println("*");
			} else if (is369) {
				System.out.println("*");
			} else {
				System.out.println(i);
			}
			i++;
		}
	}
}
