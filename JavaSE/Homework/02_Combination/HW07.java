/*
	7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
		找出1000内所有的完数。
*/
public class HW07 {
	public static void main(String[] args) {
		int sum;
		int i, j;

		for (i=2; i<1000; i++) {
			sum = 0;
			for (j=1; j<i/2; j++) {
				if (i % j == 0) {
					sum += j;
					if (sum == i) {
						System.out.println(i);
					}
				}
			}
		}
	}
}