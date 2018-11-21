package CH07_11;

interface ILimit
{
	int HIGH=110;
	int LOW=60;
	
	String Drive();
}

interface IDistance
{
	void Process(int min);
}

interface ISpeed extends ILimit, IDistance
{
	void Keep();
}

class CTruck implements ILimit, IDistance
{
	private int speed;
	CTruck(int speed)
	{
		this.speed=speed;
	}
	
	public String Drive()
	{
		if (speed>HIGH)
			return"�W�t";
		else if (speed<LOW)
			return"�t�t";
		else
			return"�t�ץ��`";
	}
	
	public void Process(int min)
	{
		System.out.println("�w��p"+ (double)(speed*min/60) +"����");
	}
}

class CCar implements ISpeed
{
	private int speed;
	
	CCar(int speed)
	{
		this.speed=speed;
	}
	
	public String Drive()
	{
		if (speed>HIGH)
			return "Speed:"+speed+"km/hr,�д�t";
		else if (speed<LOW)
			return "Speed:"+speed+"km/hr,�Х[�t";
		else
			return "Speed:"+speed+"km/hr,�ЫO��";
	}
	
	public void Process(int min)
	{
		double leng=speed*min/60;
		System.out.println("�w��p"+min+"���A�]�F"+leng+"����");
	}
	
	public void Keep()
	{
		System.out.println("�лP�e���O��"+(int)(speed/2)+"���إH�W�Z��");
	}
}

public class CH07_11
{
	public static void main(String[] args)
	{
		CTruck t1=new CTruck(50);
		System.out.println("t1�j����:");
		System.out.println(t1.Drive());
		t1.Process(15);
		
		System.out.println();
		
		CCar c1=new CCar(120);
		System.out.println("c1�p����:");
		System.out.println(c1.Drive());
		c1.Process(10);
		c1.Keep();
	}
}
