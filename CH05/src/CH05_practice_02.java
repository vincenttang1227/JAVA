import java.io.*;

public class CH05_practice_02
{
	public static void bubbleSort(int A[])
	{
		int i, j, k, t;
		System.out.println("\n\nA�}�C�����ƦC���L�{�G");

		for (i = A.length - 2; i >= 0; i--)
		{
			for (j = 0; j <= i; j++)
			{
				if (A[j] < A[j + 1])
				{
					t = A[j + 1];
					A[j + 1] = A[j];
					A[j] = t;
				}
			}

			System.out.print("��" + (A.length - 1 - i) + "���G");

			for (k = 0; k < A.length; k++)
				System.out.print(A[k] + " ");

			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException
	{
		int A[];
		int i;

		System.out.println("�п�J�}�C����(2~10����)�G");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int sc = Integer.parseInt(keyin.readLine());

		if (sc < 2 || sc > 10)
		{
			do
			{
				System.out.print("��J���~�A�Э��s��J(2~10����)�G");
				sc = Integer.parseInt(keyin.readLine());
			}
			while (sc < 2 || sc > 10);
		}

		A = new int[sc];
		
		System.out.println();

		for (i = 0; i < A.length; i++)
		{
			System.out.print("�п�J��" + (i + 1) + "�Ӥ�����(1~100����)�G");
			sc = Integer.parseInt(keyin.readLine());

			if (sc < 1 || sc > 100)
			{
				do
				{
					System.out.print("��J���~�A�Э��s��J(1~100����)�G");
					sc = Integer.parseInt(keyin.readLine());
				}
				while (sc < 1 || sc > 100);
			}
			A[i] = sc;
		}

		System.out.println("\nA�}�C�Ƨǫe������:");
		for (i = 0; i < A.length; i++)
			System.out.print(A[i] + "\t");

		bubbleSort(A);

		System.out.println("\nA�}�C�����ƧǪ����G�G");

		for (i = 0; i < A.length; i++)
			System.out.print(A[i] + "\t");
	}
}
