/*
	1. ����ָ���·ݣ���ӡ���·������ļ��ڡ�
		3,4,5 ���� 
		6,7,8 �ļ� 
		9,10,11 �＾ 
		12, 1, 2 ����

		if��switch��дһ��
*/

public class HW01 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int month;
		String season;

		System.out.print("Plz enter month(num): ");
		month = scan.nextInt();

		// if
		/*
		if (month<1 || month>12)	season="Out of range!";
		else if (month>=3 && month<=5)	season="Spring";
		else if (month>=6 && month<=8)	season="Summer";
		else if (month>=9 && month<=11)	season="Autumn";
		else	season="Winter";
		*/

		// switch
		switch (month) {
			case 3: case 4: case 5:
				season="Spring"; break;
			case 6: case 7: case 8:
				season="Summer"; break;
			case 9: case 10: case 11:
				season="Autumn"; break;
			case 12: case 1: case 2:
				season="Winter"; break;
			default:
				season="Out of range!";
		}


		System.out.println(season);
	}
}