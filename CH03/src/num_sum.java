import java.io.*;

public class num_sum
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�Ʀr1�G");
		String st1 = keyin.readLine();
		int num1 = Integer.parseInt(st1);
		
		System.out.print("�п�J�Ʀr2�G");
		String st2 = keyin.readLine();
		int num2 = Integer.parseInt(st2);
		
		do
		{
			if (num2 <= num1)
			{
				System.out.println("�п�J�Ʀr1�G");
				st1 = keyin.readLine();
				num1 = Integer.parseInt(st1);
				
				System.out.println("�п�J�Ʀr2�G");
				st2 = keyin.readLine();
				num2 = Integer.parseInt(st2);
			}
		}while (num2 <= num1);
		
		int sum=0;
		for (int i = num1; i <= num2; i++)
			sum += i;
		System.out.println(num1+"��"+num2+"���`�M��"+sum);
	}
}
