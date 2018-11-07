package CH06_03;

class Triangle
{
	public int ibase=10;
	public int iheight=20;
	
	public double dbase=10.0;
	public double dheight=20.0;
	
	public int Area()
	{
		return (ibase*iheight)/2;
	}
	
	public int Area(int b)
	{
		ibase=b;
		return(ibase*iheight)/2;
	}
	
	public int Area(int b,int h)
	{
		ibase=b;
		iheight=h;
		return(ibase*iheight)/2;
	}
	
	public double Area(double b, double h)
	{
		dbase=b;
		dheight=h;
		return(dbase*dheight)/2;
	}
}

public class CH06_03
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		
		int ibase=2,iheight=8,ians;
		double dbase=2.5,dheight=8.5,dans;
		
		ians=triangle.Area();
		System.out.println("�S���ǤJ�Ȫ�Area()��k�A�T���έ��n��"+ians+"\n");
		
		ians=triangle.Area(ibase);
		System.out.println("�ǤJ�@�Ӿ�ƭȪ�Area()��k�A�T���έ��n��"+ians+"\n");
		
		ians=triangle.Area(ibase,iheight);
		System.out.println("�ǤJ��Ӿ�ƭȪ�Area()��k�A�T���έ��n��"+ians+"\n");
		
		dans=triangle.Area(dbase,dheight);
		System.out.println("�ǤJ���double�Ȫ�Area()��k�A�T���έ��n��"+dans+"\n");

	}

}
