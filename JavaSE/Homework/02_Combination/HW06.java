/*
	6��С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5��
		����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
*/
public class HW06 {
	public static void main(String[] args) {
		int day = 1;
		double money = 0;

		while (money < 100) {
			money += 2.5;
			if (day % 5 == 0)	money-=6;
			day++;
		}
		System.out.println("Need " + day + " day to 100 CNY");
	}
}