import java.io.*;
public class CH04_02_01
{
	public static void main(String[] args)throws IOException
	{
		String[] course = new String[] {"�m�W","���","�ƾ�","���|","�۵M"};
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < course.length; i++)
		{
			System.out.print("\n�п�J�G"+course[i+1]+"���Z(0~100)�G");
			String st1 = keyin.readLine();
		
			System.out.print(course[i] + "\t");
		}
		System.out.println();
		System.out.print("�d�l��\t");
		
		int[] score = new int[] { 100, 96, 97, 86 };
		int sum = 0;
		for (int i = 0; i < score.length; i++)
		{
			System.out.print(score[i] + "\t\t");
			sum += score[i];
		}
		System.out.println();
		System.out.print("\n�`��=" + sum);
		System.out.print("\n����=" + (float) sum / score.length);
	}
}
