/*
	5��һ����λ����ǡ�õ���ȥ��������λ����֮����ʣ����λ����3��
		�����λ���Ƕ��٣�
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