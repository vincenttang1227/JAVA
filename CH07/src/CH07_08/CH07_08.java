package CH07_08;
import java.io.*;

class CFruit
{
	protected int price;

	public int Spend()

	{
		return 0;
	}
}

class CApple extends CFruit

{

	private int number;

	CApple(int number, int price)

	{

		this.number = number;
		this.price = price;
	}

	public int Spend()

	{

		return number * price;
	}
}
class CTomato extends CFruit

{

	private float kg;

	CTomato(float kg, int price)

	{

		this.kg = kg;
		this.price = price;
	}

	public int Spend()

	{

		return (int) (kg * price);
	}
}

class CSum

{

	public static int tot;

	public void Total(CFruit f)

	{

		tot += f.Spend();

		System.out.println("�p�p�G" + f.Spend() + "��\t\t�֭p�G" + tot);
	}
}

public class CH07_08
{

public static void main(String[] args) throws IOException

{

CSum sum = new CSum();

CApple apple;

CTomato tomato;

BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));

while (true)

{

System.out.print("���⪺�`���H�]1�Bī�G\t2�B�f�X\t3�B��覡r�G");

String item = keyin.readLine();
if (item.equals("1"))

{

System.out.print("�ʶR�X���H");

int number = Integer.parseInt(keyin.readLine());

System.out.print("����]���r�H");
int price = Integer.parseInt(keyin.readLine());
apple = new CApple(number, price);
sum.Total(apple);

}

else if (item.equals("2"))

{

	System.out.print("�ʶR�X����H");

	float kg = Float.parseFloat(keyin.readLine());

	System.out.print("����]���r�H");
	int price = Integer.parseInt(keyin.readLine());
	tomato = new CTomato(kg, price);
	sum.Total(tomato);

}

else

	break;

System.out.println();
}
}
}