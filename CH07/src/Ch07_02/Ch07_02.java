package Ch07_02;

class CLine
{
	protected int leng;

	CLine()
	{
		System.out.println("\n����CLine���O���a�޼ƪ��غc�l");
	}

	CLine(int x, int y)
	{
		System.out.println("����CLine(int x, int y)���O�a��Ӥ޼ƪ��غc�l");
		System.out.println("�ǤJ�غc�l���޼�x=" + x + "�Ay=" + y);
	}

	public void SetLeng(int l)
	{
		leng = l;
		System.out.println("���u����=" + leng);
	}
}

class CRectangle extends CLine
{
	private int wide;

	CRectangle()
	{
		System.out.println("����CRectangle���O���a�޼ƪ��غc�l");
	}

	CRectangle(int x, int y)
	{
		System.out.println("����CRectangle���O����Ӥ޼ƪ��غc�l");
		System.out.println("�ǤJ�غc�l���޼�x=" + x + "�Ay=" + y);
	}

	public void SetValue(int l, int w)
	{
		leng = l;
		wide = w;
		System.out.println("�x�Ϊ���=" + leng);
		System.out.println("�x�μe��=" + wide);
	}

}
public class Ch07_02
{

	public static void main(String[] args)
	{
		CLine sha1 = new CLine();
		sha1.SetLeng(20);
		System.out.println("\n===========================");
		CRectangle sha2 = new CRectangle();
		sha2.SetValue(10, 5);
		System.out.println("\n===========================");
		CRectangle sha3 = new CRectangle(2, 3);
		sha2.SetValue(10, 5);
	}

}
