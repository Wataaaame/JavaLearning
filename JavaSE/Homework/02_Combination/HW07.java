/*
	7��һ�������ǡ�õ�����������֮�ͣ�������������������� 6 = 1 + 2 + 3�����
		�ҳ�1000�����е�������
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