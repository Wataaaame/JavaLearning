// 3���ӿ���̨����һ������������������Ľ׳ˡ���������5���׳�Ϊ 5*4*3*2*1
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