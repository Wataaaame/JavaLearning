// 4���ӿ���̨����һ�����������жϸ������Ƿ�Ϊ����
//��������ָ�ڴ���1����Ȼ���У�����1�����������ⲻ����������������Ȼ����
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