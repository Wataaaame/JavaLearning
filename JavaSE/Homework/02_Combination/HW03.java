// 3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
public class HW03 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num, result;

		result = num = scan.nextInt();
		while (num > 2) {
			num--;
			result *= num;
		}
		System.out.println(result);
	}
}