import java.util.Arrays;

public class CH04_13
{
	public static void main(String[] args)
	{
		int[] account = { 18, 14, 12, 16, 10 };

		System.out.println("�Ƨǫe����ƶ��ǡG");
		for (int i = 0; i < account.length; i++)
			System.out.print(account[i] + "\t");

		Arrays.sort(account);

		System.out.println("\n\n�Ƨǫ᪺��ƶ��ǡG");
		for (int i = 0; i < account.length; i++)
			System.out.print(account[i] + "\t");
	}
}
