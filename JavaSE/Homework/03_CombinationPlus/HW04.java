/*
	4����Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�������£�
		�����ڵ�10�����ʱ��������������
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