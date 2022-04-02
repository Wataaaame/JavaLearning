/*
	6、打车起步价8元（3KM以内）
	超过3KM，超出的每公里1.2元
	超过5KM，超出的每公里1.5元
	请在键盘上接收公里数，得出总价。
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