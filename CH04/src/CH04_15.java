import java.io.*;
import java.util.Arrays;

public class CH04_15
{
	public static void main(String[] args)throws IOException
	{
	  int account[] = {18,4,12,16,10};
	  String name[] = {"����","�i�T","���G","���|","�G�@"};
	  
	  int i,j,account_t;
	  String name_t;
	  
	  System.out.println("Before sort:\n");
	  System.out.println("���u�s��\t�m�W");
	  for (i=0;i<account.length;i++)
		  System.out.println(" "+account[i]+"\t\t\t"+name[i]);
	  
	  for (i=3;i>=0;i--)
		  for(j=0;j<=i;j++)
			  if(account[j]>account[j+1])
			  {
				  account_t=account[j+1];
				  account[j+1]=account[j];
				  account[j]=account_t;
				  name_t=name[j+1];
				  name[j+1]=name[j];
				  name[j]=name_t;
			  }
	  
	  System.out.println("After Bubble Sort:\n");
	  System.out.println("���u�s��\t�m�W");
	  for (i=0;i<account.length;i++)
		  System.out.println(" "+account[i]+"\t\t\t"+name[i]);
	  
	  System.out.print("\nUse �G���j�M�k�AInput the employee number:");
	  BufferedReader keyin;
	  keyin = new BufferedReader(new InputStreamReader(System.in));
	  int search_account = Integer.parseInt(keyin.readLine());
	  
	  int arrNum = Arrays.binarySearch(account,search_account);
	  
	  if (arrNum<0)
		  System.out.println("\nNo the number");
	  else
	  {
		  System.out.println("\n�s��\t�m�W");
		  System.out.println(" "+account[arrNum]+"\t\t+name[arrNum");
	  }
	}

}
