package CH06_01;

class Triangle
{
	int base;
	int height;
	double ans;
	
	void Area()
	{
		ans = (base * height)/2;
		System.out.println("�bArea���A��="+base+"�A��="+height+"�A�T���έ��n="+ans+'\n');
	}
	
	double Area_2(int i)
	{
		System.out.print("�bArea_2���A��="+ i +"�A��="+height+"�A");
		return ans =(i*height)/2;
	}
	
	double Area_3(int i,int j)
	{
		System.out.print("�bArea_3���A��="+ i +"�A��="+j+"�A");
		return ans =(i*j)/2;
	}
}

public class CH06_01
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		
		triangle.base=2;
		triangle.height=8;
		
		System.out.println("�bmain���A��="+triangle.base+"�A��="+triangle.height+'\n');
		
		System.out.println("����^�ǭȪ���k�A�S���޼ơG");
		triangle.Area();
		
		System.out.println("�qmain���A�ǤJ��@�޼�base�A�B�㦳�^�ǭȡG");
		System.out.println("�q�T���έ��n="+triangle.Area_2(4)+'\n');
		
		System.out.println("�qmain���A�ǤJ2�Ӥ޼�base��height�A�B�㦳�^�ǭȡG");
		System.out.println("�q�T���έ��n="+triangle.Area_3(4,10));

	}

}
