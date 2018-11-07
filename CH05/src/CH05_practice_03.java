import java.io.*;

public class CH05_practice_03
{
	static int k = 0;
	
	public static void move(int n, char a,char b,char c)
	{
		if(n==1)
		{
			System.out.println("�L"+n+" �� "+a+" ���� "+c);
			k++;
		}
		else
		{
			move(n-1,a,c,b);
			System.out.println("�L"+n+" �� "+a+" ���� "+c);
			move(n-1,b,a,c);
			k++;			
		}
	}

	public static void main(String[] args)throws IOException
	{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�п�J�L��(3~10)�G");
		int n = Integer.parseInt(keyin.readLine());
		
		if(n<3 || n>10)
		{
			do
			{
				System.out.print("��J���~�A�Э��s��J�L��(3~10)�G");
				n = Integer.parseInt(keyin.readLine());
			}while(n<3 || n>10);
		}
		
		System.out.println();
		move(n,'A','B','C');
		System.out.println();
		System.out.print("�@���ʽL�l"+k+"��");
	}

}
