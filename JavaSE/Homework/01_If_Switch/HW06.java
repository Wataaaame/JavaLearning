/*
	6�����𲽼�8Ԫ��3KM���ڣ�
	����3KM��������ÿ����1.2Ԫ
	����5KM��������ÿ����1.5Ԫ
	���ڼ����Ͻ��չ��������ó��ܼۡ�
*/
public class HW06 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double km, price;
		double price0=8, price1=price0+(5-3)*1.2;

		km = scan.nextDouble();
		if (km < 0)	return;
		else if (km <= 3)	price=price0;
		else if (km <= 5) price=price0+(km-3)*1.2;
		else	price=price1+(km-5)*1.5;
		System.out.println(km + " km, " + price + " CNY");
	}
}