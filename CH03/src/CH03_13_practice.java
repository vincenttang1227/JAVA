import java.io.*;

public class CH03_13_practice
{
	public static void main(String[] args) throws IOException
	{
		int i = 0; 
		int sum = 1;
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�@�ӥ���ơG");
		String st1 = keyin.readLine();
		int num1 = Integer.parseInt(st1);
		
		System.out.println("�п�J����ơG");
		String st2 = keyin.readLine();
		int num2 = Integer.parseInt(st2);
		
		for ( i=0 ; i<num2 ; i++)
			 sum *= num1;
		System.out.printf (" i=%d�Asum=%d", i , sum );
	}
}
