public class CH04_06
{

	public static void main(String[] args)
	{
		int[] A=new int[]{2,4,6,8,10,12};
		System.out.println("���A�}�C���������e�G");
		for (int i=0;i<A.length;i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n");
		
		A = new int[A.length+1];
		System.out.println("��ܭ��s�t�mA�}�C���׫᪺�������e�G");
		for (int i=0;i<A.length;i++)
			System.out.print(A[i]+"\t");

	}

}
