/*
	3����Ŀ������ 1! + 2! + 3! + 4! +... + 10!
		˵����4! ��ʾ4�Ľ׳ˡ�4�Ľ׳��ǣ�1 * 2 * 3 * 4
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