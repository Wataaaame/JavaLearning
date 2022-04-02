// 4、从控制台接收一个正整数，判断该数字是否为质数
//（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
public class HW04 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num;
		boolean flag = true;

		num = scan.nextInt();
		for (int i=2; i<num/2; i++)
			if (num % i == 0) {
				flag = false;
				break;
			}
		
		if (flag)	System.out.println("Is prime number");
		else	System.out.println("Not prime number");
	}
}