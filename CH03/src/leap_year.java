import java.io.*;

public class leap_year
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("�п�J�|��Ʀ褸�~�G");
		String st1 = keyin.readLine();
		int year = Integer.parseInt(st1);
		
		do
		{
			if (year <= 0 || year > 10000)
			{
				System.out.print("��J���~�A�Э��s��J(�̦h�|��Ʀr)�G");
				st1 = keyin.readLine();
				year = Integer.parseInt(st1);
			}
		}while(year<=0 || year>10000);
		
		System.out.println();
		
		if (year %4 != 0)
			System.out.println(year+"���O�|�~");
		else if (year %100 == 0)
			{
				if (year%400==0)
					System.out.println(year+"�O�|�~");
				else
					System.out.print(year+"���O�|�~");
		}
		else
			System.out.print(year+"�O�|�~");
	}
}
