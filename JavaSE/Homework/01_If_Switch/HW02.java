// 2. �Ӽ��̽���һ�����֣��жϸ����ֵ�������
public class HW02 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num;

		num = scan.nextInt();
		if (num == 0)	System.out.println("It's zero");
		else if (num > 0)	System.out.println("Positive Number");
		else	System.out.println("Negative Number");
	}
}