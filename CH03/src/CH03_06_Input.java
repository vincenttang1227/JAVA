import java.io.*;

public class CH03_06_Input
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J���ġG");
		String math_score = keyin.readLine();
		System.out.println("Michael�ƾǦ��Z�G"+math_score);
		switch (math_score)
		{
			case "A":
				System.out.println("�v�����y�G�D�`�n�I�u�O�u�q"+"\n");
				break;
			case "B":
				System.out.println("�v�����y�G�]�����A���٥i�H��n"+"\n");
				break;
			case "C":
				System.out.println("�v�����y�G�u���n�h�Υ\"+"\n");
				break;
			default:
				System.out.println("�v�����y�G���n�g���A���ۤv�hŪ��"+"\n");
		}
	}
}