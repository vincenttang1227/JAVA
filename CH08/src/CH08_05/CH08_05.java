package CH08_05;

import java.io.*;

public class CH08_05
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));

		double base, exponent;

		System.out.print("��J����:");
		base = Double.parseDouble(keyin.readLine());

		System.out.print("��J����:");
		exponent = Double.parseDouble(keyin.readLine());

		try
		{
			if (base == 0 && exponent < 0)
				throw new ArithmeticException();

			if (base < 0)
				try
				{
					if (exponent > 0 && exponent < 1)
						throw new ArithmeticException();
				}
				catch (ArithmeticException ex)
				{
					System.out.println("���Ƥp��0�A�h���Ƥ��i����0~1�����A�L�k�p��I");
					return;
				}
			System.out.println("���G�G" + Math.pow(base, exponent));
		}
		catch (ArithmeticException ex)
		{
			System.out.println("���Ƶ���0�A�h���Ƥ��i�p��0�A�L�k�p��I");
		}
	}
}
