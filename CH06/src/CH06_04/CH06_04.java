package CH06_04;

class Triangle
{
	public double dbase, dheight;

	public Triangle()
	{
		dbase = 10.0;
		dheight = 20.0;
		System.out.println("�غc�lTriangle()���w�q�A��=" + dbase + "�A��=" + dheight);
	}

	public Triangle(double b, double h)
	{
		dbase = b;
		dheight = h;
		System.out.println("�غc�l����Triangle(double b,double h)�ǤJ���ȡA��=" + dbase + "�A��=" + dheight);
	}

	public double Area()
	{
		return (dbase * dheight) / 2;
	}

	public double Area(double b, double h)
	{
		dbase = b;
		dheight = h;
		System.out.println("�غc�l����dtriangle.Area(dbase,dheight)�����ǤJ�����double�ȡA��=" + dbase + "�A��=" + dheight);
		return (dbase * dheight) / 2;
	}
}

public class CH06_04
{

	public static void main(String[] args)
	{
		double dbase = 2.5, dheight = 8.5, dans;

		Triangle triangle = new Triangle();
		dans = triangle.Area();
		System.out.println("�S���ǤJ�Ȫ�Area()��k�A�T���έ��n��" + dans + "\n");

		Triangle dtriangle = new Triangle(dbase, dheight);
		dbase = 5.5;
		dheight = 10.5;
		dans = dtriangle.Area(dbase, dheight);
		System.out.println("�ǤJ���double��Area(dabse,dheight)��k�A�T���έ��n��" + dans + "\n");
	}

}
