package CH11_05;

import java.io.*;

public class CH11_05
{

	public static void main(String[] args)
	{
		String file_name="images.jpg";
		
		try
		{
			FileInputStream filein=new FileInputStream(file_name);
			byte data[]=new byte[filein.available()];
			filein.read(data);
			filein.close();
			
			FileOutputStream fileout=new FileOutputStream("�ƻs_"+file_name);
			fileout.write(data);
			System.out.println("�ɮפw�ƻs...");
			filein.close();
		}
		catch(IOException e)
		{
			System.out.println("�ɮ׳B�z���~�I");
		}

	}

}
