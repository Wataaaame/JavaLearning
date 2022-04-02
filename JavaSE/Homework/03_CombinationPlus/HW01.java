/*
	1、题目：一个5位数，判断它是不是回文数。即12321是回文数，
		个位与万位相同，十位与千位相同
*/
public class HW01 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num;
		int a, b, c, d;

		while (true) {
			num = scan.nextInt();
			a = num / 10000;
			b = num/1000 % 10;
			c = num % 10;
			d = num%100 / 10;

			if (a==c && b==d)
				System.out.println("Is perfect number!");
			else
				System.out.println("Not perfect number!");
		}
	}
}