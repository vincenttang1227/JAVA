import java.io.*;
import java.util.*;

public class CH05_practice_01
{
	public static void main(String[] args) throws IOException
	{
		long t1, t2, tot;
		int num1, num2, ans;
		int score = 0;
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n��<<Enter>>��Y�}�l����");
		int p = System.in.read();
		Date date_time = new Date();
		System.out.println("�}�l�@���ɶ����G" + date_time);
		t1 = System.currentTimeMillis();

		for (int i = 0; i < 4; i++)
		{
			num1 = (int) (Math.random() * 16 + 1);
			num2 = (int) (Math.random() * 10 + 1);
			System.out.println(num1 + " * " + num2 + " = :");
			ans = Integer.parseInt(keyin.readLine());
			if (ans == num1 * num2)
			{
				System.out.println("�� "+i+"�D�A����F");
				score += 25;
			}
			else
			{
				System.out.println("�� "+i+"�D�A�����F");
				System.out.println("���T���׬��G"+(num1*num2));
			} 
		}
		t2 = System.currentTimeMillis();
		System.out.println("�@�������A�����ɶ����G" + date_time);
		System.out.println("�@�ϥήɶ��G"+(t2-t1)+"�@��");
		System.out.println("�@�ϥΡG"+((t2-t1)/1000)+"��");
	}
}
