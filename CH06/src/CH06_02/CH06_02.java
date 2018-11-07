package CH06_02;


class Triangle
{
	private int base;
	private int height;
	private double ans;
	
	public void setData(int b, int h)
	{
		base=b;
		height=h;
		Area();
	}
	
	public double outArea()
	{
		return ans;
	}
	
	private void Area()
	{
		ans = (base*height)/2;
		System.out.println("�g��public setData()��k�A�����]�w�A��="+base+"�A��="+height+"\n");
	}	
}

public class CH06_02
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		
		int base=2, height=8;
		double ans;
		
		triangle.setData(base, height);
		ans=triangle.outArea();
		
		System.out.println("�g��public outArea()��k�A�����Ǧ^�T���έ��n��"+ans+"\n");
	}
}