/*
	5、一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍
		这个四位数是多少？
*/
public class HW05 {
	public static void main(String[] args) {
		int three, four;

		for (three=334; three<=999; three++) {
			four = 3 * three;
			if (four %= 1000 == three)
				System.out.println("is: " + four);
		}
	}
}