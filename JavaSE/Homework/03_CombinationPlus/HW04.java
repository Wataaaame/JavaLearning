/*
	4、题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
		求它在第10次落地时，共经过多少米
*/
public class HW04 {
	public static void main(String[] args) {
		double height=100, track=0;

		for (int i=0; i<10; i++) {
			track += height;
			if (i == 9)	break;
			track += (height /= 2);
		}
		System.out.println("Drop at 10th gone " + track + " m");
	}
}