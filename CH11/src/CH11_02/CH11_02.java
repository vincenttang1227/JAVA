package CH11_02;

import java.io.*;

public class CH11_02
{
	public static void main(String[] args)
	{
		String file_name = "c:\\javadir\\javatest.txt";
		File myFile = new File(file_name);

		if (myFile.exists())
			System.out.println(file_name + "�w�g�s�b");
		else
			System.out.println(file_name + "�|���إ�");
		
		try
		{
		if (myFile.createNewFile())
			System.out.println(file_name + "�ɮ׫إߦ��\");
		else
			System.out.println(file_name + "�ɮ׫إߥ���");
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
