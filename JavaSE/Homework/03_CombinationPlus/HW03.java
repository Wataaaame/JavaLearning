/*
	3、题目：计算 1! + 2! + 3! + 4! +... + 10!
		说明：4! 表示4的阶乘。4的阶乘是：1 * 2 * 3 * 4
*/
public class HW03 {
	public static void main(String[] args) {
		int factorial = 1;
		int result = 0;

		for (int i=1; i<=10; i++) {
			factorial *= i;
			result += factorial;
		}
		System.out.println("1! + 2! + 3! + 4! + ... + 10! = " + result);
	}
}