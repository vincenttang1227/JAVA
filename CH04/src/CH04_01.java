public class CH04_01
{
	public static void main(String[] args)
	{
		int[] A = new int[5];
		System.out.println("A�}�C���סG" + A.length);
		System.out.print("A�}�C�����ȡG");
		
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + "\t");
		
		System.out.println("\n");
		
		int[] B = new int[5];
		System.out.println("B�}�C���סG" + B.length);
		System.out.print("B�}�C�����ȡG");
		for (int i = 0; i < B.length; i++)
			System.out.print(B[i] + "\t");
	}
}
