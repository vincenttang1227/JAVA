import java.io.*;

public class CH04_11
{
	public static void main(String[] args) throws IOException
	{
		int[] account = { 18, 14, 12, 16, 10 };
		String[] name = { "����", "�i�T", "���G", "���|", "�G�@" };

		System.out.println("���u�s��\t�m�W");
		for (int i = 0; i < account.length; i++)
		{
			System.out.print(account[i] + "\t\t");
			System.out.println(name[i]);
		}

		System.out.print("\n�ϥνu�ʷj�M�k�A�п�J�n�䪺���u�s���G");
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		int search_num = Integer.parseInt(keyin.readLine());

		int num = -1;
		for (int i = 0; i < account.length; i++)
			if (account[i] == search_num)
			{
				num = i;
				break;
			}

		if (num == -1)
			System.out.println("\n �d�L���s��");
		else
		{
			System.out.println("\n���u�s��\t�m�W");
			System.out.println(account[num] + "\t\t" + name[num]);
		}
	}
}