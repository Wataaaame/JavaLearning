/*
	8����һ��������5λ����������
		Ҫ��
		һ�������Ǽ�λ��
		���������ӡ����λ����
*/
public class HW08 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num, bit=0;

	/*
		for (num=scan.nextInt(); num/10!=0; bit++, num/=10) {
			System.out.println(num % 10);
		}
	*/

		num=scan.nextInt();
		do {
			bit++;
			System.out.print(num % 10);
		} while((num/=10) != 0);
		System.out.println("\nBit: " + bit);
	}
}