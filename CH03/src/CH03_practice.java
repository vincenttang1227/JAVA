import java.io.*;
public class CH03_practice
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J���Z�G");
		String st1 = keyin.readLine();
		int num = Integer.parseInt(st1);
		
		if (num < 0)
		{
			System.out.print("��J���t��\n�Э��s��J�G");
		}

	}
}
