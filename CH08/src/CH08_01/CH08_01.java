package CH08_01;

public class CH08_01
{
	static void Division(int num1, double num2)
	{
		try
		{
			double num3 = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + num3);
		}
		catch (Exception ex)
		{
			System.out.println("���~����:" + ex);
		}
		finally
		{
			System.out.println("����finally�϶�\n");
		}
	}

	public static void main(String[] args)
	{
		Division(12, 0);
		Division(12, 2);
	}
}
