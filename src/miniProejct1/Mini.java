package miniProejct1;

public class Mini {

	public static void main(String[] args) {
		int i = 1;

		for (; i <= 100; i++) { // TODO i가 1부터 100까지 반복되어야합니다.
			int secondNumber = i % 10; // TODO 1의 자리 숫자를 나타냅니다
			// secondNumber % 10

			int firstNumber = i / 10; // TODO 10의 자리 숫자를 나타냅니다.
			// firstNumber / 10

			boolean is306090 = (firstNumber == 3) || (firstNumber == 6) || (firstNumber == 9);
			boolean is369 = (secondNumber == 3) || (secondNumber == 6) || (secondNumber == 9);

			if (is306090 & is369 == true) {
				System.out.println("**");
			} else if (is306090) {
				System.out.println("*");
			} else if (is369) {
				System.out.println("*");
			} else {
				System.out.println(i);
			}

		}
	}

}
// comment: 실행에는 전혀 문제가 없는 코드지만 일반적으로 사용하지 않는 코딩 스타일입니다.
// 실제 업무에서는 다른 사람의 코드를 봐야하는 경우도 많고 한 프로젝트를 여러 사람이 하게 되기 때문에 코딩 스타일을 통일하게 되는데,
// 표준적으로 많이 사용하는 코딩 스타일로 습관을 들여놓는 것이 장기적으로 도움이 될 것이라 생각합니다.
// 참고:
// http://developer.gaeasoft.co.kr/development-guide/java-guide/java-coding-style-guide/
