/*
	4. 整数大小比较：输入两个整数，比较大小，
		若x>y 输出 >
		若x=y 输出 =
		若x<y 输出 <
*/
public class HW04 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x, y;
		String ch;

		System.out.print("Plz enter x: ");
		x = scan.nextInt();
		System.out.print("Plz enter y: ");
		y = scan.nextInt();
		
		if (x > y)	ch=" > ";
		else if (x == y)	ch=" = ";
		else	ch=" < ";

		System.out.println(x + ch + y);
	}
}