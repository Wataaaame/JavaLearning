/*
	2����Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬
		����񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����
		һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10������
		���ٳ�ʱ��ֻʣ��һ�������ˡ����һ�칲ժ�˶���
*/
public class HW02 {
	public static void main(String[] args) {
		int peach = 1;

		for (int i=0; i<9; i++) {
			peach = 2 * (peach+1);
		}
		System.out.println("Totally " + peach + " peaches");
	}
}