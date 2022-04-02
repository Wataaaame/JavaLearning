/*
	5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中
	对它们进行排序，使用if-else结构，并按从小到大的顺序输出
*/
public class HW05 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num1, num2, num3, temp;
		String ch = " < ";

		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2) {
			temp=num1; num1=num2; num2=temp;
		}
		if (num1 > num3) {
			temp=num1; num1=num3; num3=temp;
		}
		if (num2 > num3) {
			temp=num2; num2=num3; num3=temp;
		}
		System.out.println(num1 + ch + num2 + ch + num3);
	}
}