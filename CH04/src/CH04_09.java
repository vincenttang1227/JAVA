public class CH04_09
{

	public static void main(String[] args)
	{
		int[] A=new int[]{1,2,3,4,5};
		int[] B=new int[A.length];
		System.out.println("���A�}�C���������e�G");
		for (int i=0;i<A.length;i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n\n���B�}�C���������e�G");
		for (int i=0;i<B.length;i++)
			System.out.print(B[i]+"\t");
		
		System.out.println("\n\n��arraycopy��k�A�ƻsA�}�C�������Ȩ�B�}�C��...\n");
		System.arraycopy(A,0,B,0,5);
				
		System.out.println("���B�}�C���������e�G");
		for (int i=0;i<B.length;i++)
			System.out.print(B[i]+"\t");		
		
	}

}