package CH10_01;

public class CH10_01
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL Driver�w�˦��\�I");
		}
		catch (Exception e)
		{
			System.out.println("MySQL Driver�w�˥��ѡI!");
		}
	}
}