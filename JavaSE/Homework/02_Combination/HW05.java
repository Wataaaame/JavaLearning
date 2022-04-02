/*
	5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
			*
		 ***
		*****
	 *******
	*********
*/
public class HW05 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int row, i, j, k;

		row = scan.nextInt();
		for (i=0; i<row; i++) {
			for (j=i; j<=row-2; j++) {
				System.out.print(' ');
			}
			for (k=0; k<2*i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}