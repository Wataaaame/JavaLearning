// 2、计算 1+2-3+4-5+6-7....+100的结果
public class HW02 {
	public static void main(String[] args) {
		int sum = 1;

		for (int i=2; i<=100; i+=2)
			sum += i;
		for (int i=3; i<=100; i+=2)
			sum -= i;
		System.out.println(sum);
	}
}