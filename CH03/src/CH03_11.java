
public class CH03_11
{
	public static void main(String[] args)
	{
		int i,num = 1;
		for (i=0;i<10;i++)
		{
			num *= 2;
			if (num>20)
				break;
		}
		System.out.printf("break�Q����A���ɪ�i=%d�Anum=%d",i,num);
	}
}
