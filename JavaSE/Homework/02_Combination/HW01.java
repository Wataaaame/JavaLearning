// 1、计算1000以内所有不能被7整除的整数之和
public class HW01 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i=0; i<=1000; i++)
			if (i % 7 != 0)
				sum += i;
		System.out.println(sum);
	}
}