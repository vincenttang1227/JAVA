package CH11_01;

import java.io.*;

public class CH11_01
{
	public static void main(String[] args)
	{
		String path_name = "c:\\javadir";
		File myDir = new File(path_name);

		if (myDir.exists())
			System.out.println(path_name + "�w�g�s�b");
		else
			System.out.println(path_name + "�|���إ�");

		if (myDir.mkdir())
			System.out.println(path_name + "��Ƨ��إߦ��\");
		else
			System.out.println(path_name + "��Ƨ��إߥ���");
	}
}
