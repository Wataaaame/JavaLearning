// 3. 从键盘接收一个数字，判断该数字的奇偶。
public class HW03 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num;

		System.out.print("Plz enter a num: ");
		num = scan.nextInt();
		if (num%2 == 0)	System.out.println("Is ou");
		else	System.out.println("Is ji");
	}
}