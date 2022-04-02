/*
	8、给一个不多于5位的正整数，
		要求：
		一、求它是几位数
		二、逆序打印出各位数字
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